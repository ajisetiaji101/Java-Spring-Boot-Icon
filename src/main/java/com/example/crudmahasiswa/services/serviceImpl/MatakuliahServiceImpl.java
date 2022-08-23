package com.example.crudmahasiswa.services.serviceImpl;

import com.example.crudmahasiswa.dto.fakultasdto.FakultasDto;
import com.example.crudmahasiswa.dto.jurusandto.JurusanDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahDto;
import com.example.crudmahasiswa.dto.matakuliahdto.MatakuliahInsertDto;
import com.example.crudmahasiswa.models.Fakultas;
import com.example.crudmahasiswa.models.Jurusan;
import com.example.crudmahasiswa.models.Matakuliah;
import com.example.crudmahasiswa.repository.JurusanRepository;
import com.example.crudmahasiswa.repository.MatakuliahRepository;
import com.example.crudmahasiswa.services.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class MatakuliahServiceImpl implements MatakuliahService {

    @Autowired
    MatakuliahRepository matakuliahRepository;

    @Autowired
    JurusanRepository jurusanRepository;

    @Override
    public MatakuliahDto create(MatakuliahInsertDto matakuliahInsertDto) {
        Matakuliah matakuliah = new Matakuliah();
        matakuliah.setMatakuliahName(matakuliahInsertDto.getMatakuliahName());
        matakuliah.setJurusan(jurusanRepository.findById(matakuliahInsertDto.getJurusanId()).get());

        matakuliahRepository.save(matakuliah);

        MatakuliahDto matakuliahDto = new MatakuliahDto();
        matakuliahDto.setId(matakuliah.getId());
        matakuliahDto.setMatakuliahName(matakuliah.getMatakuliahName());

        return matakuliahDto;
    }

    @Override
    public List<MatakuliahDto> getAll() {
        List<Matakuliah> matakuliahList = matakuliahRepository.findAll();

        List<MatakuliahDto> matakuliahDtos = new ArrayList<>();

        for(Matakuliah matakuliah: matakuliahList){
            MatakuliahDto matakuliahDto = new MatakuliahDto();
            matakuliahDto.setId(matakuliah.getId());
            matakuliahDto.setMatakuliahName(matakuliah.getMatakuliahName());

            matakuliahDtos.add(matakuliahDto);
        }
        return matakuliahDtos;
    }
}
