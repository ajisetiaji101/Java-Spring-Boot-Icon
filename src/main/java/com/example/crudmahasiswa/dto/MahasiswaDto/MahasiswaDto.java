package com.example.crudmahasiswa.dto.MahasiswaDto;

import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Matakuliah;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class MahasiswaDto {

    private UUID id;

    private String mahasiswaName;

    private Integer mahasiswaAge;

    private String mahasiswaGenre;

    private String mahasiswaAddress;

    private Fakultas fakultas;

    private Jurusan jurusan;

    private Set<Matakuliah> matakuliahs = new HashSet<>();

    public MahasiswaDto(){

    }

    public MahasiswaDto(UUID id, String mahasiswaName, Integer mahasiswaAge, String mahasiswaGenre, String mahasiswaAddress, Fakultas fakultas, Jurusan jurusan, Set<Matakuliah> matakuliahs) {
        this.id = id;
        this.mahasiswaName = mahasiswaName;
        this.mahasiswaAge = mahasiswaAge;
        this.mahasiswaGenre = mahasiswaGenre;
        this.mahasiswaAddress = mahasiswaAddress;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.matakuliahs = matakuliahs;
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

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public Set<Matakuliah> getMatakuliahs() {
        return matakuliahs;
    }

    public void setMatakuliahs(Set<Matakuliah> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }
}
