package com.example.crudmahasiswa.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_mahasiswa")
public class Mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "mahasiswa_name")
    private String mahasiswaName;

    @Column(name = "mahasiswa_age")
    private Integer mahasiswaAge;

    @Column(name = "mahasiswa_genre")
    private String mahasiswaGenre;

    @Column(name = "mahasiswa_address")
    private String mahasiswaAddress;

    @OneToOne
    @JoinColumn(name = "fakultas_id", referencedColumnName = "id", unique = true)
    private Fakultas fakultas;

    @OneToOne
    @JoinColumn(name = "jurusan_id", referencedColumnName = "id", unique = true)
    private Jurusan jurusan;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "allmatakuliah",
            joinColumns = @JoinColumn(name = "mahasiswa_id"),
            inverseJoinColumns = @JoinColumn(name = "matakuliah_id"))
    private Set<Matakuliah> matakuliahs = new HashSet<>();

    public Mahasiswa(){

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
