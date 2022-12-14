package com.example.crudmahasiswa.repository;

import com.example.crudmahasiswa.models.Mahasiswa;
import com.example.crudmahasiswa.models.Matakuliah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah, UUID> {
    public Set<Matakuliah> findByMahasiswasId(UUID uuid);
}
