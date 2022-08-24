package com.example.crudmahasiswa.dto.MahasiswaDto;

import java.util.UUID;

public class MahasiswaReadDto {
    private UUID id;

    private String mahasiswaName;

    private Integer mahasiswaAge;

    private String mahasiswaGenre;

    private String mahasiswaAddress;

    public MahasiswaReadDto(){

    }

    public MahasiswaReadDto(UUID id, String mahasiswaName, Integer mahasiswaAge, String mahasiswaGenre, String mahasiswaAddress) {
        this.id = id;
        this.mahasiswaName = mahasiswaName;
        this.mahasiswaAge = mahasiswaAge;
        this.mahasiswaGenre = mahasiswaGenre;
        this.mahasiswaAddress = mahasiswaAddress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
