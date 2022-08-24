package com.example.crudmahasiswa.controllers;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.fakultasdto.FakultasInsertDto;
import com.example.crudmahasiswa.helpers.ResponseUtil;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.ResponseDto;
import com.example.crudmahasiswa.services.FakultasService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fakultas")
@Tag(name = "Fakultas")
public class FakultasController {

    @Autowired
    private FakultasService fakultasService;

    @PostMapping
    public ResponseEntity<ResponseDto<FakultasDto>>create(@RequestBody FakultasInsertDto fakultasInsertDto){
        try{
            FakultasDto fakultasDto1 = fakultasService.create(fakultasInsertDto);

            ResponseDto<FakultasDto> responseDto = ResponseUtil.responseDtoSuccess(fakultasDto1,"Data Fakultas Baru berhasil ditambahkan");

            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<FakultasDto> response = ResponseUtil.responseDtoFailed(null, e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<ResponseDto<List<FakultasDto>>>getFakultasAll(){
        try{
            List<FakultasDto> fakultasDtos = fakultasService.getAll();

            ResponseDto<List<FakultasDto>> responseDto = ResponseUtil.responseDtoSuccess(fakultasDtos, "Data Seluruh Fakultas Success");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (Exception e){
            ResponseDto<List<FakultasDto>> responseDto = ResponseUtil.responseDtoFailed(null,e.getMessage(), HttpStatus.CREATED);
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }
    }

}
