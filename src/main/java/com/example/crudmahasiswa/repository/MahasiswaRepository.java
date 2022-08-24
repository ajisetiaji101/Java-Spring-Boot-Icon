package com.example.crudmahasiswa.repository;

import com.example.crudmahasiswa.models.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, UUID> {
    public List<Mahasiswa> findByJurusanId(UUID uuid);
}
