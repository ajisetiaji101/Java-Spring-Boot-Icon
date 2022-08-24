package com.example.crudmahasiswa.dto.matakuliahdto;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.models.Mahasiswa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class MataKuliahMahasiswaDto {
    private UUID id;

    private String matakuliahName;

    private Set<MahasiswaDto> mahasiswas = new HashSet<>();

    public  MataKuliahMahasiswaDto(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMatakuliahName() {
        return matakuliahName;
    }

    public void setMatakuliahName(String matakuliahName) {
        this.matakuliahName = matakuliahName;
    }

    public Set<MahasiswaDto> getMahasiswas() {
        return mahasiswas;
    }

    public void setMahasiswas(Set<MahasiswaDto> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }
}
