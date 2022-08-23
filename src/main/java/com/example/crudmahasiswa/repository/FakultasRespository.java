package com.example.crudmahasiswa.repository;

import com.example.crudmahasiswa.models.Fakultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FakultasRespository extends JpaRepository <Fakultas, UUID> {

}
