package com.example.crudmahasiswa.dto.jurusandto;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasInsertDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

public class JurusanDto {

    private UUID id;

    private String jurusanName;

    private FakultasDto fakultas;

    public JurusanDto(){

    }

    public JurusanDto(UUID id, String jurusanName, FakultasDto fakultas) {
        this.id = id;
        this.jurusanName = jurusanName;
        this.fakultas = fakultas;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getJurusanName() {
        return jurusanName;
    }

    public void setJurusanName(String jurusanName) {
        this.jurusanName = jurusanName;
    }

    public FakultasDto getFakultas() {
        return fakultas;
    }

    public void setFakultas(FakultasDto fakultas) {
        this.fakultas = fakultas;
    }
}
