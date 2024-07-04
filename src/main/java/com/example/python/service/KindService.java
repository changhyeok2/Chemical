package com.example.python.service;

import com.example.python.dto.KindDetailDto;
import com.example.python.dto.YearDto;
import com.example.python.mapper.KindMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KindService {

    private final KindMapper kindMapper;

    public List<KindDetailDto> selectKind(String 유형명){
        return kindMapper.selectKind(유형명);
    }

    public List<YearDto> selectYear(String 유형명){
        return kindMapper.selectYear(유형명);
    }
}
