package com.example.crudmahasiswa.dto.matakuliahdto;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanReadDto;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Matakuliah;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

public class MatakuliahDto {

    private UUID id;

    private String matakuliahName;

    private JurusanDto jurusan;


    public MatakuliahDto(){

    }

    public MatakuliahDto(UUID id, String matakuliahName, JurusanDto jurusan) {
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

    public JurusanDto getJurusan() {
        return jurusan;
    }

    public void setJurusan(JurusanDto jurusan) {
        this.jurusan = jurusan;
    }
}
