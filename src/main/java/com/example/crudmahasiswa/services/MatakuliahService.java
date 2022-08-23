package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahInsertDto;

import java.util.List;

public interface MatakuliahService {
    MatakuliahDto create(MatakuliahInsertDto matakuliahInsertDto);
    List<MatakuliahDto> getAll();
}
