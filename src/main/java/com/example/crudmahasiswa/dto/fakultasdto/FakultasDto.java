package com.example.crudmahasiswa.dto.fakultasdto;

import java.util.UUID;

public class FakultasDto {

    private UUID id;

    private String fakultasName;

    public FakultasDto(UUID id, String fakultasName) {
        this.id = id;
        this.fakultasName = fakultasName;
    }

    public FakultasDto(){

    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFakultasName() {
        return this.fakultasName;
    }

    public void setFakultasName(String fakultasName) {
        this.fakultasName = fakultasName;
    }
}
