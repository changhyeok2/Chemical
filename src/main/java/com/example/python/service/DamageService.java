package com.example.python.service;

import com.example.python.dto.DamageDto;
import com.example.python.mapper.DamageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DamageService {

    private final DamageMapper damageMapper;

    public int insertDamage(DamageDto damageDto){
        return damageMapper.insertDamage(damageDto);
    }

    public List<DamageDto> selectDamage(){
        return damageMapper.selectDamage();
    }
}
