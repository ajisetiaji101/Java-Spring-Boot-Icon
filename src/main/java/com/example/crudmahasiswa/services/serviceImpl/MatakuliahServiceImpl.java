package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MataKuliahMahasiswaDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahInsertDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Mahasiswa;
import com.example.crudmahasiswa.models.Matakuliah;
import com.example.crudmahasiswa.repository.JurusanRepository;
import com.example.crudmahasiswa.repository.MatakuliahRepository;
import com.example.crudmahasiswa.services.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Transactional
@Service
public class MatakuliahServiceImpl implements MatakuliahService {

    @Autowired
    MatakuliahRepository matakuliahRepository;

    @Autowired
    JurusanRepository jurusanRepository;

    @Override
    public MatakuliahDto create(MatakuliahInsertDto matakuliahInsertDto) {
        Matakuliah matakuliah = new Matakuliah();
        matakuliah.setMatakuliahName(matakuliahInsertDto.getMatakuliahName());
        matakuliah.setJurusan(jurusanRepository.findById(matakuliahInsertDto.getJurusanId()).get());


        matakuliahRepository.save(matakuliah);

        MatakuliahDto matakuliahDto = new MatakuliahDto();
        matakuliahDto.setId(matakuliah.getId());
        matakuliahDto.setMatakuliahName(matakuliah.getMatakuliahName());

        JurusanDto jurusanDto = new JurusanDto();
        jurusanDto.setId(matakuliah.getJurusan().getId());
        jurusanDto.setJurusanName(matakuliah.getJurusan().getJurusanName());

        matakuliahDto.setJurusan(jurusanDto);

        return matakuliahDto;
    }

    @Override
    public List<MatakuliahDto> getAll() {
        List<Matakuliah> matakuliahList = matakuliahRepository.findAll();

        List<MatakuliahDto> matakuliahDtos = new ArrayList<>();

        for(Matakuliah matakuliah: matakuliahList){
            MatakuliahDto matakuliahDto = new MatakuliahDto();
            matakuliahDto.setId(matakuliah.getId());
            matakuliahDto.setMatakuliahName(matakuliah.getMatakuliahName());

            JurusanDto jurusanDto = new JurusanDto();
            jurusanDto.setId(matakuliah.getJurusan().getId());
            jurusanDto.setJurusanName(matakuliah.getJurusan().getJurusanName());


            FakultasDto fakultasDto = new FakultasDto();
            fakultasDto.setId(matakuliah.getJurusan().getFakultas().getId());
            fakultasDto.setFakultasName(matakuliah.getJurusan().getFakultas().getFakultasName());

            jurusanDto.setFakultas(fakultasDto);

            matakuliahDto.setJurusan(jurusanDto);



            matakuliahDtos.add(matakuliahDto);
        }
        return matakuliahDtos;
    }

    @Override
    public List<MataKuliahMahasiswaDto> getData() {
        List<Matakuliah> matakuliahs = matakuliahRepository.findAll();

        List<MataKuliahMahasiswaDto> matakuliahDtos = new ArrayList<>();

        for(Matakuliah matakuliah: matakuliahs){
            MataKuliahMahasiswaDto matakuliahDto = new MataKuliahMahasiswaDto();
            matakuliahDto.setId(matakuliah.getId());
            matakuliahDto.setMatakuliahName(matakuliah.getMatakuliahName());

            Set<MahasiswaDto> mahasiswaDtos = new HashSet<>();

            Set<Mahasiswa> mahasiswas = matakuliah.getMahasiswas();
            for(Mahasiswa mahasiswa: mahasiswas){
                MahasiswaDto mahasiswaDto = new MahasiswaDto();
                mahasiswaDto.setId(mahasiswa.getId());
                mahasiswaDto.setMahasiswaName(mahasiswa.getMahasiswaName());
                mahasiswaDto.setMahasiswaAge(mahasiswa.getMahasiswaAge());
                mahasiswaDto.setMahasiswaAddress(mahasiswa.getMahasiswaAddress());
                mahasiswaDto.setMahasiswaGenre(mahasiswa.getMahasiswaGenre());

                mahasiswaDtos.add(mahasiswaDto);
            }
            matakuliahDto.setMahasiswas(mahasiswaDtos);


            matakuliahDtos.add(matakuliahDto);
        }

        return matakuliahDtos;
    }


}
