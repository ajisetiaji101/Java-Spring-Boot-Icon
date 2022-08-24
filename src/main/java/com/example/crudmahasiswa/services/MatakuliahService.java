package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahInsertDto;
import com.example.crudmahasiswa.models.Mahasiswa;
import com.example.crudmahasiswa.models.Matakuliah;

import java.util.List;
import java.util.UUID;

public interface MatakuliahService {
    MatakuliahDto create(MatakuliahInsertDto matakuliahInsertDto);
    List<MatakuliahDto> getAll();
    List<Matakuliah> getData();
}
