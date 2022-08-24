package com.example.crudmahasiswa.dto.jurusandto;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaReadDto;
import com.example.crudmahasiswa.models.Mahasiswa;

import java.util.List;
import java.util.UUID;

public class JurusanMahasiswaDto {
    private UUID id;

    private String jurusanName;

    private List<MahasiswaReadDto> mahasiswa;

    public JurusanMahasiswaDto() {
    }

    public JurusanMahasiswaDto(UUID id, String jurusanName, List<MahasiswaReadDto> mahasiswa) {
        this.id = id;
        this.jurusanName = jurusanName;
        this.mahasiswa = mahasiswa;
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

    public List<MahasiswaReadDto> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<MahasiswaReadDto> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
