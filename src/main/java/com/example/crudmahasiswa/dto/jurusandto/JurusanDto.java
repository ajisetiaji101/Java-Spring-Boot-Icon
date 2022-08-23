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

    private FakultasDto fakultasDto;

    public JurusanDto(){

    }

    public JurusanDto(UUID id, String jurusanName, FakultasDto fakultasDto) {
        this.id = id;
        this.jurusanName = jurusanName;
        this.fakultasDto = fakultasDto;
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

    public FakultasDto getFakultasDto() {
        return fakultasDto;
    }

    public void setFakultasDto(FakultasDto fakultasDto) {
        this.fakultasDto = fakultasDto;
    }
}
