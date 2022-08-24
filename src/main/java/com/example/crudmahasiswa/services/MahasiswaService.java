package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.MahasiswaDto.*;

import java.util.List;
import java.util.UUID;

public interface MahasiswaService {
    MahasiswaDto create(MahasiswaInsertDto mahasiswaInsertDto);
    List<MahasiswaDto> getAll();
    MahasiswaDto update(MahasiswaDto mahasiswaDto);
    void removeOne(UUID id);
    MahasiswaMapelDto mapelBaru(MahasiswaInsertMaperlDto mahasiswaInsertMaperlDto);
    List<MahasiswaGetAllMapel> getMapel();
}
