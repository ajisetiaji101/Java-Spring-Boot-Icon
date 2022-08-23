package com.example.crudmahasiswa.dto.matakuliahdto;

import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Matakuliah;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

public class MatakuliahDto {

    private UUID id;

    private String matakuliahName;

    private Jurusan jurusan;

    public MatakuliahDto(){

    }

    public MatakuliahDto(UUID id, String matakuliahName, Jurusan jurusan) {
        this.id = id;
        this.matakuliahName = matakuliahName;
        this.jurusan = jurusan;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMatakuliahName() {
        return matakuliahName;
    }

    public void setMatakuliahName(String matakuliahName) {
        this.matakuliahName = matakuliahName;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
}
