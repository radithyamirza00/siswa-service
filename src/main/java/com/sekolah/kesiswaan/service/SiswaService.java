package com.sekolah.kesiswaan.service;

import com.sekolah.kesiswaan.dto.CreateSiswaRequestDto;
import com.sekolah.kesiswaan.dto.CreateSiswaResponseDto;
import com.sekolah.kesiswaan.model.Siswa;
import com.sekolah.kesiswaan.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiswaService {

    @Autowired
    SiswaRepository siswaRepository;

    public CreateSiswaResponseDto createSiswa(CreateSiswaRequestDto requestDto){
       Siswa savedEntity = Siswa.builder()
               .nama(requestDto.getNama())
               .umur(requestDto.getUmur())
               .kelas(requestDto.getKelas())
               .build();
       siswaRepository.save(savedEntity);

       return CreateSiswaResponseDto.builder()
               .nama(savedEntity.getNama())
               .kelas(savedEntity.getKelas())
               .umur(savedEntity.getUmur())
               .build();
    }

    public List<Siswa> getAllSiswa(){

        List<Siswa> allSiswa = siswaRepository.findAll();

        return allSiswa;
    }

    public CreateSiswaResponseDto updateSiswaById(Long id, CreateSiswaRequestDto requestDto){

        Siswa savedEntity = siswaRepository.getById(id);

        savedEntity.setNama(requestDto.getNama());
        savedEntity.setUmur(requestDto.getUmur());
        savedEntity.setKelas(requestDto.getKelas());

        siswaRepository.save(savedEntity);

        return CreateSiswaResponseDto.builder()
                .nama(savedEntity.getNama())
                .kelas(savedEntity.getKelas())
                .umur(savedEntity.getUmur())
                .build();
    }

    public void deleteSiswaById(Long id){

        siswaRepository.deleteById(id);
    }

}
