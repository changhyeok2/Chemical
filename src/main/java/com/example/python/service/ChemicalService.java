package com.example.python.service;

import com.example.python.dto.ChemicalDto;
import com.example.python.mapper.ChemicalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChemicalService {

    private final ChemicalMapper chemicalMapper;

}
