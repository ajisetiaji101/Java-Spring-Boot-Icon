package com.example.crudmahasiswa.dto.matakuliahdto;

import com.example.crudmahasiswa.models.Jurusan;

import java.util.UUID;

public class MatakuliahInsertDto {
    private UUID jurusanId;

    private String matakuliahName;

    public MatakuliahInsertDto(){

    }

    public MatakuliahInsertDto(UUID jurusanId, String matakuliahName) {
        this.jurusanId = jurusanId;
        this.matakuliahName = matakuliahName;
    }

    public UUID getJurusanId() {
        return jurusanId;
    }

    public void setJurusanId(UUID jurusanId) {
        this.jurusanId = jurusanId;
    }

    public String getMatakuliahName() {
        return matakuliahName;
    }

    public void setMatakuliahName(String matakuliahName) {
        this.matakuliahName = matakuliahName;
    }
}
