package com.example.python.dto;

import lombok.Data;

@Data
public class KindDetailDto {
    private String 유형명;
    private String 원인명;
    //private LocalDateTime 사고일자;
    private int 사망;
    private int 부상;
    private int 총사상자;
}
