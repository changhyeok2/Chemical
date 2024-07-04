package com.example.python.mapper;

import com.example.python.dto.CauseDetailDto;
import com.example.python.dto.CauseDto;
import com.example.python.dto.YearDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CauseMapper {

    List<CauseDetailDto> selectCause(String 원인명);

    List<YearDto> selectYear(String 원인명);
}
