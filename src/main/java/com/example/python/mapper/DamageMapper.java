package com.example.python.mapper;

import com.example.python.dto.DamageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DamageMapper {
    int insertDamage(DamageDto dto);

    List<DamageDto> selectDamage();
}
