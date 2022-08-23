package com.example.crudmahasiswa.models;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tbl_jurusan")
public class Jurusan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "jurusan_name")
    private String jurusanName;

    @OneToMany(mappedBy = "jurusan")
    private List<Matakuliah> matakuliah;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "fakultas_id")
    private Fakultas fakultas;

    public Jurusan(){

    }

    public Jurusan(UUID id, String jurusanName, Fakultas fakultas) {
        this.id = id;
        this.jurusanName = jurusanName;
        this.fakultas = fakultas;
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

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

}
