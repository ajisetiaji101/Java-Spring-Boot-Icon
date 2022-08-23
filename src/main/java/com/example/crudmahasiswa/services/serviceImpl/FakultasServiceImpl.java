package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasInsertDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.repository.FakultasRespository;
import com.example.crudmahasiswa.services.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FakultasServiceImpl implements FakultasService {

    @Autowired
    FakultasRespository fakultasRespository;

    @Override
    public FakultasDto create(FakultasInsertDto fakultasInsertDto) {

        Fakultas fakultas = new Fakultas();
        fakultas.setFakultasName(fakultasInsertDto.getFakultasName());

        fakultasRespository.save(fakultas);

        FakultasDto fakultasDto = new FakultasDto();
        fakultasDto.setId(fakultas.getId());
        fakultasDto.setFakultasName(fakultas.getFakultasName());

        return fakultasDto;
    }

    @Override
    public List<FakultasDto> getAll() {

        List<Fakultas> fakultas = fakultasRespository.findAll();

        List<FakultasDto> fakultasDtos = new ArrayList<>();

        for(Fakultas fakultas1: fakultas){
            FakultasDto fakultasDto = new FakultasDto();
            fakultasDto.setId(fakultas1.getId());
            fakultasDto.setFakultasName(fakultas1.getFakultasName());

            fakultasDtos.add(fakultasDto);
        }
        return fakultasDtos;
    }


}
