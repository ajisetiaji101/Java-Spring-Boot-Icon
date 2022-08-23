package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;

import java.util.List;

public interface JurusanService {
    JurusanDto create(JurusanInsertDto jurusanInsertDto);
    List<JurusanDto> getAll();
}
