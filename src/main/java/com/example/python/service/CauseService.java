package com.example.python.service;

import com.example.python.dto.CauseDetailDto;
import com.example.python.dto.CauseDto;
import com.example.python.dto.YearDto;
import com.example.python.mapper.CauseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CauseService {

    private final CauseMapper causeMapper;

    public List<CauseDetailDto> selectCause(String 원인명){
        return causeMapper.selectCause(원인명);
    }

    public List<YearDto> selectYear(String 원인명){
        return causeMapper.selectYear(원인명);
    }
}
