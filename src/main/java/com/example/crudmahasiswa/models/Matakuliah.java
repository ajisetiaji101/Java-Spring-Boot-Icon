package com.example.crudmahasiswa.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tbl_matakuliah")
public class Matakuliah {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "matakuliah_name")
    private String matakuliahName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "jurusan_id")
    @JsonIgnore
    private Jurusan jurusan;

    public Matakuliah(){

    }

    public Matakuliah(UUID id, String matakuliahName, Jurusan jurusan) {
        this.id = id;
        this.matakuliahName = matakuliahName;
        this.jurusan = jurusan;
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

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
}
