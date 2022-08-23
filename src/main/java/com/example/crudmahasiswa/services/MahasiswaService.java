package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertMaperlDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaMapelDto;

import java.util.List;
import java.util.UUID;

public interface MahasiswaService {
    MahasiswaDto create(MahasiswaInsertDto mahasiswaInsertDto);
    List<MahasiswaDto> getAll();
    MahasiswaDto update(MahasiswaDto mahasiswaDto);
    void removeOne(UUID id);
    MahasiswaMapelDto mapelBaru(MahasiswaInsertMaperlDto mahasiswaInsertMaperlDto);
}
