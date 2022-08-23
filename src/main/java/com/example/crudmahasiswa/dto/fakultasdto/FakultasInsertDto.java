package com.example.crudmahasiswa.dto.fakultasdto;

import java.util.UUID;

public class FakultasInsertDto {

    private String fakultasName;

    public FakultasInsertDto(String fakultasName) {
        this.fakultasName = fakultasName;
    }

    public FakultasInsertDto(){

    }

    public String getFakultasName() {
        return fakultasName;
    }

    public void setFakultasName(String fakultasName) {
        this.fakultasName = fakultasName;
    }
}
