package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasInsertDto;
import com.example.crudmahasiswa.models.Fakultas;

import java.util.List;

public interface FakultasService {
    FakultasDto create(FakultasInsertDto fakultasInsertDto);
    List<FakultasDto> getAll();
}
