package com.example.crudmahasiswa.dto.jurusandto;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.models.Fakultas;

import java.util.UUID;

public class JurusanInsertDto {

    private UUID FakultasId;

    private String jurusanName;

    private Fakultas fakultas;

    public JurusanInsertDto(){

    }


    public JurusanInsertDto(UUID fakultasId, String jurusanName, Fakultas fakultas) {
        FakultasId = fakultasId;
        this.jurusanName = jurusanName;
        this.fakultas = fakultas;
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

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
}
