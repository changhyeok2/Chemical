package com.example.python.dto;

import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class ChemicalDto {
    private int 사고번호;
    private int 유형아이디;
    private int 원인아이디;
    private Date 사고일자;
    private String 사고내용;
}
