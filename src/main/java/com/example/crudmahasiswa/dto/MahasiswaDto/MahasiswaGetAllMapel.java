package com.example.crudmahasiswa.dto.MahasiswaDto;

import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.models.Matakuliah;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class MahasiswaGetAllMapel {
    private UUID id;

    private String mahasiswaName;

    private Set<MatakuliahDto> matakuliahs = new HashSet<>();

    public MahasiswaGetAllMapel(){

    }

    public MahasiswaGetAllMapel(UUID id, String mahasiswaName, Set<MatakuliahDto> matakuliahs) {
        this.id = id;
        this.mahasiswaName = mahasiswaName;
        this.matakuliahs = matakuliahs;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMahasiswaName() {
        return mahasiswaName;
    }

    public void setMahasiswaName(String mahasiswaName) {
        this.mahasiswaName = mahasiswaName;
    }

    public Set<MatakuliahDto> getMatakuliahs() {
        return matakuliahs;
    }

    public void setMatakuliahs(Set<MatakuliahDto> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }
}
