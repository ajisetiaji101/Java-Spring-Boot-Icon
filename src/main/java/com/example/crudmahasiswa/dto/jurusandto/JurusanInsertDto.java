package com.example.crudmahasiswa.dto.jurusandto;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.models.Fakultas;

import java.util.UUID;

public class JurusanInsertDto {

    private UUID FakultasId;

    private String jurusanName;


    public JurusanInsertDto(){

    }

    public JurusanInsertDto(UUID fakultasId, String jurusanName, FakultasDto fakultas) {
        FakultasId = fakultasId;
        this.jurusanName = jurusanName;
    }

    public UUID getFakultasId() {
        return FakultasId;
    }

    public void setFakultasId(UUID fakultasId) {
        FakultasId = fakultasId;
    }

    public String getJurusanName() {
        return jurusanName;
    }

    public void setJurusanName(String jurusanName) {
        this.jurusanName = jurusanName;
    }
}
