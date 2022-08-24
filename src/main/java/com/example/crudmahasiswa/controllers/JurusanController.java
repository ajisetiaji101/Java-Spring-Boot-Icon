package com.example.crudmahasiswa.controllers;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanMahasiswaDto;
import com.example.crudmahasiswa.helpers.ResponseUtil;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.ResponseDto;
import com.example.crudmahasiswa.services.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jurusan")
public class JurusanController {

    @Autowired
    JurusanService jurusanService;

    @PostMapping
    public ResponseEntity<ResponseDto<JurusanDto>> create(@RequestBody JurusanInsertDto jurusanInsertDto){
        try{
            JurusanDto jurusanDto = jurusanService.create(jurusanInsertDto);

            ResponseDto<JurusanDto> responseDto = ResponseUtil.responseDtoSuccess(jurusanDto, "Create data jurusan success");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<JurusanDto> responseDto = ResponseUtil.responseDtoFailed(null, "Gagal create data jurusan", HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseDto<List<JurusanDto>>>getAll(){
        try{
            List<JurusanDto> jurusanDtos = jurusanService.getAll();

            ResponseDto<List<JurusanDto>> responseDto = ResponseUtil.responseDtoSuccess(jurusanDtos, "Data Seluruh Fakultas Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<JurusanDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }

    @GetMapping("/mahasiswa")
    public ResponseEntity<ResponseDto<List<JurusanMahasiswaDto>>>getJurusanMahasiswa(){
        try{
            List<JurusanMahasiswaDto> jurusanDtos = jurusanService.getJurusanMahasiswa();

            ResponseDto<List<JurusanMahasiswaDto>> responseDto = ResponseUtil.responseDtoSuccess(jurusanDtos, "Data Seluruh Mahasiswa yang mengikuti Jurusan Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<JurusanMahasiswaDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }


}
