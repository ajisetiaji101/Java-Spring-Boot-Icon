package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertDto;

import java.util.List;
import java.util.UUID;

public interface MahasiswaService {
    MahasiswaDto create(MahasiswaInsertDto mahasiswaInsertDto);
    List<MahasiswaDto> getAll();
    MahasiswaDto update(MahasiswaDto mahasiswaDto);
    public void removeOne(UUID id);
}
