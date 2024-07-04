package com.example.python.mapper;

import com.example.python.dto.KindDetailDto;
import com.example.python.dto.YearDto;
import org.apache.ibatis.annotations.Mapper;

import java.time.Year;
import java.util.List;

@Mapper
public interface KindMapper {

    List<KindDetailDto> selectKind(String 유형명);

    List<YearDto> selectYear(String 유형명);
}
