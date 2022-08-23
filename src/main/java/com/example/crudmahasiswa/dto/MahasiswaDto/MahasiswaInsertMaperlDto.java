package com.example.crudmahasiswa.dto.MahasiswaDto;

import java.util.UUID;

public class MahasiswaInsertMaperlDto {

    private UUID idMahasiswa;

    private UUID idMataKuliah;

    public MahasiswaInsertMaperlDto(){

    }

    public UUID getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(UUID idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public UUID getIdMataKuliah() {
        return idMataKuliah;
    }

    public void setIdMataKuliah(UUID idMataKuliah) {
        this.idMataKuliah = idMataKuliah;
    }
}
