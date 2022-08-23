package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.repository.FakultasRespository;
import com.example.crudmahasiswa.repository.JurusanRepository;
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


    @Override
    public JurusanDto create(JurusanInsertDto jurusanInsertDto) {
        Jurusan jurusan = new Jurusan();
        jurusan.setJurusanName(jurusanInsertDto.getJurusanName());
        jurusan.setFakultas(fakultasRespository.findById(jurusanInsertDto.getFakultasId()).get());

        jurusanRepository.save(jurusan);

        JurusanDto jurusanDto = new JurusanDto();
        jurusanDto.setId(jurusan.getId());
        jurusanDto.setJurusanName(jurusan.getJurusanName());

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

            jurusanDtos.add(jurusanDto);
        }
        return jurusanDtos;
    }

}
