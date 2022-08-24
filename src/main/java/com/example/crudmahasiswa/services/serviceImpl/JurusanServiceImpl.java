package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaReadDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanMahasiswaDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Mahasiswa;
import com.example.crudmahasiswa.repository.FakultasRespository;
import com.example.crudmahasiswa.repository.JurusanRepository;
import com.example.crudmahasiswa.repository.MahasiswaRepository;
import com.example.crudmahasiswa.services.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class JurusanServiceImpl implements JurusanService {

    @Autowired
    JurusanRepository jurusanRepository;

    @Autowired
    FakultasRespository fakultasRespository;

    @Autowired
    MahasiswaRepository mahasiswaRepository;


    @Override
    public JurusanDto create(JurusanInsertDto jurusanInsertDto) {
        Jurusan jurusan = new Jurusan();
        jurusan.setJurusanName(jurusanInsertDto.getJurusanName());
        jurusan.setFakultas(fakultasRespository.findById(jurusanInsertDto.getFakultasId()).get());

        jurusanRepository.save(jurusan);

        JurusanDto jurusanDto = new JurusanDto();
        jurusanDto.setId(jurusan.getId());
        jurusanDto.setJurusanName(jurusan.getJurusanName());
        FakultasDto fakultasDto = new FakultasDto();
        fakultasDto.setId(jurusan.getFakultas().getId());
        fakultasDto.setFakultasName(jurusan.getFakultas().getFakultasName());
        jurusanDto.setFakultas(fakultasDto);

        return jurusanDto;

    }

    @Override
    public List<JurusanDto> getAll() {
        List<Jurusan> jurusanDtoList = jurusanRepository.findAll();

        List<JurusanDto> jurusanDtos = new ArrayList<>();

        for(Jurusan jurusan: jurusanDtoList){
            JurusanDto jurusanDto = new JurusanDto();
            jurusanDto.setId(jurusan.getId());
            jurusanDto.setJurusanName(jurusan.getJurusanName());
            FakultasDto fakultasDto = new FakultasDto();
            fakultasDto.setId(jurusan.getFakultas().getId());
            fakultasDto.setFakultasName(jurusan.getFakultas().getFakultasName());
            jurusanDto.setFakultas(fakultasDto);


            jurusanDtos.add(jurusanDto);
        }
        return jurusanDtos;
    }

    @Override
    public List<JurusanMahasiswaDto> getJurusanMahasiswa() {

        List<Jurusan> jurusans = jurusanRepository.findAll();

        List<JurusanMahasiswaDto> jurusanMahasiswaDtos = new ArrayList<>();

        for(Jurusan jurusan: jurusans){
            JurusanMahasiswaDto jurusanMahasiswaDto = new JurusanMahasiswaDto();

            jurusanMahasiswaDto.setId(jurusan.getId());
            jurusanMahasiswaDto.setJurusanName(jurusan.getJurusanName());

            List<MahasiswaReadDto> mahasiswaReadDtos = new ArrayList<>();
            List<Mahasiswa> mahasiswas = mahasiswaRepository.findByJurusanId(jurusan.getId());

            for(Mahasiswa mahasiswa: mahasiswas){
                MahasiswaReadDto mahasiswaReadDto = new MahasiswaReadDto();
                mahasiswaReadDto.setId(mahasiswa.getId());
                mahasiswaReadDto.setMahasiswaName(mahasiswa.getMahasiswaName());
                mahasiswaReadDto.setMahasiswaAge(mahasiswa.getMahasiswaAge());
                mahasiswaReadDto.setMahasiswaAddress(mahasiswa.getMahasiswaAddress());
                mahasiswaReadDto.setMahasiswaGenre(mahasiswa.getMahasiswaGenre());

                mahasiswaReadDtos.add(mahasiswaReadDto);
            }

            jurusanMahasiswaDto.setMahasiswa(mahasiswaReadDtos);

            jurusanMahasiswaDtos.add(jurusanMahasiswaDto);
        }
        return jurusanMahasiswaDtos;
    }

}
