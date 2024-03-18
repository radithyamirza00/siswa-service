package com.sekolah.kesiswaan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
public class Siswa {

    @Id
    Long id;

    String nama;

    int umur;

    String kelas;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

}
