package com.example.crudmahasiswa.dto.MahasiswaDto;

import com.example.crudmahasiswa.models.Matakuliah;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class MahasiswaMapelDto {

    private UUID id;

    private String mahasiswaName;

    private Set<Matakuliah> matakuliahs = new HashSet<>();

    public MahasiswaMapelDto(){

    }

    public MahasiswaMapelDto(UUID id, String mahasiswaName, Set<Matakuliah> matakuliahs) {
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

    public Set<Matakuliah> getMatakuliahs() {
        return matakuliahs;
    }

    public void setMatakuliahs(Set<Matakuliah> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }
}
