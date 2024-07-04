package com.example.python.dto;

import lombok.Data;

@Data
public class CauseDetailDto {
    private String 유형명;
    private String 원인명;
    private int 사망;
    private int 부상;
    private int 총사상자;
}
