package com.sekolah.kesiswaan.repository;

import com.sekolah.kesiswaan.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiswaRepository extends JpaRepository<Siswa, Long> {
}
