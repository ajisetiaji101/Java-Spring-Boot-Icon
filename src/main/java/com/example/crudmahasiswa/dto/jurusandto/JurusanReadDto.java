package com.example.crudmahasiswa.dto.jurusandto;

import java.util.UUID;

public class JurusanReadDto {
    private UUID id;

    private String jurusanName;

    JurusanReadDto(){

    }

    public JurusanReadDto(UUID id, String jurusanName) {
        this.id = id;
        this.jurusanName = jurusanName;
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
}
