package com.sekolah.kesiswaan.controller;

import com.sekolah.kesiswaan.dto.CreateSiswaRequestDto;
import com.sekolah.kesiswaan.dto.CreateSiswaResponseDto;
import com.sekolah.kesiswaan.model.Siswa;
import com.sekolah.kesiswaan.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/siswa-service")
public class SiswaController {

    @Autowired
    SiswaService siswaService;

    @PostMapping("/siswa")
    @ResponseStatus(value = HttpStatus.CREATED)
    public CreateSiswaResponseDto createSiswa(CreateSiswaRequestDto createSiswaRequestDto) {
        return siswaService.createSiswa(createSiswaRequestDto);
    }

    @GetMapping("/siswa")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Siswa> getAllSiswa() {
        return siswaService.getAllSiswa();
    }

    @PatchMapping("/siswa/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public CreateSiswaResponseDto updateSiswa(@PathVariable Long id, CreateSiswaRequestDto createSiswaRequestDto) {
        return siswaService.updateSiswaById(id, createSiswaRequestDto);
    }

    @DeleteMapping("/siswa/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteSiswa(@PathVariable Long id) {
        siswaService.deleteSiswaById(id);
    }

}
