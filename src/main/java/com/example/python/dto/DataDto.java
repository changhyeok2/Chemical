package com.example.python.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class DataDto {
    private int 사고번호;
    private int 유형아이디;
    private int 원인아이디;
    private Date 사고일자;
    private String 사고내용;
    private KindDto kind;
    private CauseDto cause;
    private int 사망;
    private int 부상;
}
