package com.example.crudmahasiswa.controllers;

import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaInsertMaperlDto;
import com.example.crudmahasiswa.dto.MahasiswaDto.MahasiswaMapelDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanInsertDto;
import com.example.crudmahasiswa.helpers.ResponseUtil;
import com.example.crudmahasiswa.models.ResponseDto;
import com.example.crudmahasiswa.services.JurusanService;
import com.example.crudmahasiswa.services.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/mahasiswa")
public class MahasiswaController {

    @Autowired
    MahasiswaService mahasiswaService;

    @PostMapping
    public ResponseEntity<ResponseDto<MahasiswaDto>> create(@RequestBody MahasiswaInsertDto mahasiswaInsertDto){
        try{
            MahasiswaDto mahasiswaDto = mahasiswaService.create(mahasiswaInsertDto);

            ResponseDto<MahasiswaDto> responseDto = ResponseUtil.responseDtoSuccess(mahasiswaDto, "Create data mahasiswa success");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<MahasiswaDto> responseDto = ResponseUtil.responseDtoFailed(null, "Gagal create data jurusan", HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseDto<List<MahasiswaDto>>>getAll(){
        try{
            List<MahasiswaDto> mahasiswaDtos = mahasiswaService.getAll();

            ResponseDto<List<MahasiswaDto>> responseDto = ResponseUtil.responseDtoSuccess(mahasiswaDtos, "Data Seluruh Mahasiswa Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<MahasiswaDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }

    @PutMapping
    public ResponseEntity<ResponseDto<MahasiswaDto>> update(@RequestBody MahasiswaDto mahasiswaDto){
        try{
            MahasiswaDto mahasiswaDto1 = mahasiswaService.update(mahasiswaDto);

            ResponseDto<MahasiswaDto> responseDto = ResponseUtil.responseDtoSuccess(mahasiswaDto, "Update data mahasiswa success");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<MahasiswaDto> responseDto = ResponseUtil.responseDtoFailed(null, "Gagal create data jurusan", HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id) {
            mahasiswaService.removeOne(id);
    }

    @PostMapping("/mapel")
    public ResponseEntity<ResponseDto<MahasiswaMapelDto>> mapel(@RequestBody MahasiswaInsertMaperlDto mahasiswaInsertMaperlDto){
        try{
            MahasiswaMapelDto mahasiswaMapelDto = mahasiswaService.mapelBaru(mahasiswaInsertMaperlDto);

            ResponseDto<MahasiswaMapelDto> responseDto = ResponseUtil.responseDtoSuccess(mahasiswaMapelDto, "Create data mahasiswa success");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<MahasiswaMapelDto> responseDto = ResponseUtil.responseDtoFailed(null, "Gagal create data jurusan", HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }
}
