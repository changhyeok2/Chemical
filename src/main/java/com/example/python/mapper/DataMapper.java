package com.example.python.mapper;

import com.example.python.dto.DataDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataMapper {

    List<DataDto> findAll();

    List<DataDto> findFilter(@Param("year") String year,
                             @Param("kind") String kind,
                             @Param("cause") String cause);

}
