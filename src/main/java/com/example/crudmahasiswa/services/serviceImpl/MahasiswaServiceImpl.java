package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertMaperlDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaMapelDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Mahasiswa;
import com.example.crudmahasiswa.models.Matakuliah;
import com.example.crudmahasiswa.repository.FakultasRespository;
import com.example.crudmahasiswa.repository.JurusanRepository;
import com.example.crudmahasiswa.repository.MahasiswaRepository;
import com.example.crudmahasiswa.repository.MatakuliahRepository;
import com.example.crudmahasiswa.services.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    MahasiswaRepository mahasiswaRepository;

    @Autowired
    FakultasRespository fakultasRespository;

    @Autowired
    JurusanRepository jurusanRepository;

    @Autowired
    MatakuliahRepository matakuliahRepository;


    @Override
    public MahasiswaDto create(MahasiswaInsertDto mahasiswaInsertDto) {

        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setMahasiswaName(mahasiswaInsertDto.getMahasiswaName());
        mahasiswa.setMahasiswaAge(mahasiswaInsertDto.getMahasiswaAge());
        mahasiswa.setMahasiswaAddress(mahasiswaInsertDto.getMahasiswaAddress());
        mahasiswa.setMahasiswaGenre(mahasiswaInsertDto.getMahasiswaGenre());
        mahasiswa.setFakultas(fakultasRespository.findById(mahasiswaInsertDto.getFakultasId()).get());
        mahasiswa.setJurusan(jurusanRepository.findById(mahasiswaInsertDto.getJurusanId()).get());

        mahasiswaRepository.save(mahasiswa);

        MahasiswaDto mahasiswaDto = new MahasiswaDto();
        mahasiswaDto.setMahasiswaName(mahasiswa.getMahasiswaName());
        mahasiswaDto.setMahasiswaAge(mahasiswa.getMahasiswaAge());
        mahasiswaDto.setMahasiswaGenre(mahasiswa.getMahasiswaGenre());
        mahasiswaDto.setMahasiswaAddress(mahasiswa.getMahasiswaAddress());
        mahasiswaDto.setFakultas(mahasiswa.getFakultas());
        mahasiswaDto.setJurusan(mahasiswa.getJurusan());

        return mahasiswaDto;
    }

    @Override
    public List<MahasiswaDto> getAll() {
        List<Mahasiswa> mahasiswas = mahasiswaRepository.findAll();

        List<MahasiswaDto> mahasiswaDtos = new ArrayList<>();

        for(Mahasiswa mahasiswa: mahasiswas){
            MahasiswaDto mahasiswaDto = new MahasiswaDto();
            mahasiswaDto.setId(mahasiswa.getId());
            mahasiswaDto.setMahasiswaName(mahasiswa.getMahasiswaName());
            mahasiswaDto.setMahasiswaAge(mahasiswa.getMahasiswaAge());
            mahasiswaDto.setMahasiswaGenre(mahasiswa.getMahasiswaGenre());
            mahasiswaDto.setMahasiswaAddress(mahasiswa.getMahasiswaAddress());
            mahasiswaDto.setFakultas(mahasiswa.getFakultas());
            mahasiswaDto.setJurusan(mahasiswa.getJurusan());
            mahasiswaDto.setMatakuliahs(mahasiswa.getMatakuliahs());

            mahasiswaDtos.add(mahasiswaDto);
        }
        return mahasiswaDtos;
    }

    @Override
    public MahasiswaDto update(MahasiswaDto mahasiswaDto) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setId(mahasiswaDto.getId());
        mahasiswa.setMahasiswaName(mahasiswaDto.getMahasiswaName());
        mahasiswa.setMahasiswaAge(mahasiswaDto.getMahasiswaAge());
        mahasiswa.setMahasiswaAddress(mahasiswaDto.getMahasiswaAddress());
        mahasiswa.setMahasiswaGenre(mahasiswaDto.getMahasiswaGenre());

        mahasiswaRepository.save(mahasiswa);

        MahasiswaDto mahasiswaDto1 = new MahasiswaDto();
        mahasiswaDto.setId(mahasiswa.getId());
        mahasiswaDto.setMahasiswaName(mahasiswa.getMahasiswaName());
        mahasiswaDto.setMahasiswaAge(mahasiswa.getMahasiswaAge());
        mahasiswaDto.setMahasiswaGenre(mahasiswa.getMahasiswaGenre());
        mahasiswaDto.setMahasiswaAddress(mahasiswa.getMahasiswaAddress());

        return mahasiswaDto1;


    }

    @Override
    public void removeOne(UUID id) {
        mahasiswaRepository.deleteById(id);
    }

    @Override
    public MahasiswaMapelDto mapelBaru(MahasiswaInsertMaperlDto mahasiswaInsertMaperlDto) {

        Mahasiswa mahasiswa = mahasiswaRepository.findById(mahasiswaInsertMaperlDto.getIdMahasiswa()).get();

        MahasiswaMapelDto  mahasiswaMapelDto1 = new MahasiswaMapelDto();
        mahasiswaMapelDto1.setId(mahasiswa.getId());
        mahasiswaMapelDto1.setMahasiswaName(mahasiswa.getMahasiswaName());

        Set<Matakuliah> matakuliahs = new HashSet<>();

        Matakuliah matakuliah =  matakuliahRepository.findById(mahasiswaInsertMaperlDto.getIdMataKuliah()).get();
        matakuliahs.add(matakuliah);

        mahasiswaMapelDto1.setMatakuliahs(matakuliahs);

        mahasiswa.setMatakuliahs(matakuliahs);

        mahasiswaRepository.save(mahasiswa);

        return mahasiswaMapelDto1;

    }
}
