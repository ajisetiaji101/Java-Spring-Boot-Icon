package com.example.crudmahasiswa.controllers;

import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MataKuliahMahasiswaDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahInsertDto;
import com.example.crudmahasiswa.helpers.ResponseUtil;
import com.example.crudmahasiswa.models.Matakuliah;
import com.example.crudmahasiswa.models.ResponseDto;
import com.example.crudmahasiswa.services.JurusanService;
import com.example.crudmahasiswa.services.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/matakuliah")
public class MatakuliahController {
    @Autowired
    MatakuliahService matakuliahService;

    @PostMapping
    public ResponseEntity<ResponseDto<MatakuliahDto>> create(@RequestBody MatakuliahInsertDto matakuliahInsertDto){
        try{
            MatakuliahDto matakuliahDto = matakuliahService.create(matakuliahInsertDto);

            ResponseDto<MatakuliahDto> responseDto = ResponseUtil.responseDtoSuccess(matakuliahDto, "Create data Mata Kuliah success");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<MatakuliahDto> responseDto = ResponseUtil.responseDtoFailed(null, "Gagal create data Mata Kuliah", HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseDto<List<MatakuliahDto>>>getAll(){
        try{
            List<MatakuliahDto> matakuliahDtos = matakuliahService.getAll();

            ResponseDto<List<MatakuliahDto>> responseDto = ResponseUtil.responseDtoSuccess(matakuliahDtos, "Data Seluruh Mata Kuliah Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<MatakuliahDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }

    @GetMapping("mahasiswa")
    public ResponseEntity<ResponseDto<List<MataKuliahMahasiswaDto>>>getMahasiswa(){
        try{
            List<MataKuliahMahasiswaDto> matakuliahDtos = matakuliahService.getData();

            ResponseDto<List<MataKuliahMahasiswaDto>> responseDto = ResponseUtil.responseDtoSuccess(matakuliahDtos, "Data Seluruh Mata Kuliah Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<MataKuliahMahasiswaDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }
}
