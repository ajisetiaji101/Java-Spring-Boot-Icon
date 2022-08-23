package com.example.crudmahasiswa.dto.MahasiswaDto;

import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Matakuliah;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class MahasiswaInsertDto {
    private UUID FakultasId;

    private UUID JurusanId;

    private String mahasiswaName;

    private Integer mahasiswaAge;

    private String mahasiswaGenre;

    private String mahasiswaAddress;

    MahasiswaInsertDto(){

    }

    public MahasiswaInsertDto(UUID fakultasId, UUID jurusanId, String mahasiswaName, Integer mahasiswaAge, String mahasiswaGenre, String mahasiswaAddress, UUID matakuliahId) {
        FakultasId = fakultasId;
        JurusanId = jurusanId;
        this.mahasiswaName = mahasiswaName;
        this.mahasiswaAge = mahasiswaAge;
        this.mahasiswaGenre = mahasiswaGenre;
        this.mahasiswaAddress = mahasiswaAddress;
    }

    public UUID getFakultasId() {
        return FakultasId;
    }

    public void setFakultasId(UUID fakultasId) {
        FakultasId = fakultasId;
    }

    public UUID getJurusanId() {
        return JurusanId;
    }

    public void setJurusanId(UUID jurusanId) {
        JurusanId = jurusanId;
    }

    public String getMahasiswaName() {
        return mahasiswaName;
    }

    public void setMahasiswaName(String mahasiswaName) {
        this.mahasiswaName = mahasiswaName;
    }

    public Integer getMahasiswaAge() {
        return mahasiswaAge;
    }

    public void setMahasiswaAge(Integer mahasiswaAge) {
        this.mahasiswaAge = mahasiswaAge;
    }

    public String getMahasiswaGenre() {
        return mahasiswaGenre;
    }

    public void setMahasiswaGenre(String mahasiswaGenre) {
        this.mahasiswaGenre = mahasiswaGenre;
    }

    public String getMahasiswaAddress() {
        return mahasiswaAddress;
    }

    public void setMahasiswaAddress(String mahasiswaAddress) {
        this.mahasiswaAddress = mahasiswaAddress;
    }
}
