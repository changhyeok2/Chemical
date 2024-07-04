package com.example.python.service;

import com.example.python.dto.DataDto;
import com.example.python.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataMapper dataMapper;

    public List<DataDto> allData() {
        return dataMapper.findAll();
    }

    public List<DataDto> filterAccidents(String year, String kind, String cause) {
        return dataMapper.findFilter(year, kind, cause);
    }

}
