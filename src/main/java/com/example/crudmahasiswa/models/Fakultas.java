package com.example.crudmahasiswa.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="tbl_fakultas")
public class Fakultas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "fakultas_name", nullable = false)
    private String fakultasName;

    @OneToMany(mappedBy = "fakultas")
    private List<Jurusan> jurusan;

    public Fakultas() {

    }

    public Fakultas(UUID id, String fakultasName, List<Jurusan> jurusan) {
        this.id = id;
        this.fakultasName = fakultasName;
        this.jurusan = jurusan;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFakultasName() {
        return fakultasName;
    }

    public void setFakultasName(String fakultasName) {
        this.fakultasName = fakultasName;
    }

    public List<Jurusan> getJurusan() {
        return jurusan;
    }

    public void setJurusan(List<Jurusan> jurusan) {
        this.jurusan = jurusan;
    }
}
