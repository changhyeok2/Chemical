package com.example.python.controller;

import com.example.python.dto.CauseDetailDto;
import com.example.python.dto.KindDetailDto;
import com.example.python.dto.YearDto;
import com.example.python.service.CauseService;
import com.example.python.service.DamageService;
import com.example.python.service.KindService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ChemicalController {

    private final CauseService causeService;
    private final KindService kindService;

    @GetMapping("/")
    public String index(){
        return "index";
    }



    //누출
    @GetMapping("/leakage")
    public String leakage(){
        return "leakage";
    }

    @GetMapping("/leak")
    @ResponseBody
    public List<KindDetailDto> listLeak() {
        String 유형명 = "누출";
        return kindService.selectKind(유형명);
    }

    @GetMapping("/leak/year")
    @ResponseBody
    public List<YearDto> listLeakYear() {
        String 유형명 = "누출";
        return kindService.selectYear(유형명);
    }



    //화재
    @GetMapping("/fire")
    public String Fire(){
        return "fire";
    }

    @GetMapping("/fire/show")
    @ResponseBody
    public List<KindDetailDto> listFire() {
        String 유형명 = "화재";
        return kindService.selectKind(유형명);
    }
    @GetMapping("/fire/year")
    @ResponseBody
    public List<YearDto> listFireYear(){
        String 유형명 = "화재";
        return kindService.selectYear(유형명);
    }



    //폭발
    @GetMapping("/explosion")
    public String Explosin(){
        return "explosion";
    }

    @GetMapping("/explosion/view")
    @ResponseBody
    public List<KindDetailDto> listExplosion() {
        String 유형명 = "폭발";
        return kindService.selectKind(유형명);
    }
    @GetMapping("/explosion/year")
    @ResponseBody
    public List<YearDto> listExplosionYear(){
        String 유형명 = "폭발";
        return kindService.selectYear(유형명);
    }



    //기타
    @GetMapping("/etc")
    public String Etc(){
        return "etc";
    }

    @GetMapping("/etc/other")
    @ResponseBody
    public List<KindDetailDto> listEtc() {
        String 유형명 = "기타";
        return kindService.selectKind(유형명);
    }
    @GetMapping("/etc/year")
    @ResponseBody
    public List<YearDto> listEtcYear(){
        String 유형명 = "기타";
        return kindService.selectYear(유형명);
    }






















    //안전기준 미준수
    @GetMapping("/safey")
    public String safey(){
        return "safey";
    }

    @GetMapping("/safey/show")
    @ResponseBody
    public List<CauseDetailDto> listSafey(){
        String 원인명 = "안전기준 미준수";
        return causeService.selectCause(원인명);
    }
    @GetMapping("/safey/year")
    @ResponseBody
    public List<YearDto> listSafeyYear(){
        String 원인명 = "안전기준 미준수";
        return causeService.selectYear(원인명);
    }



    //시설 결함
    @GetMapping("/facility")
    public String facility(){
        return "facility";
    }

    @GetMapping("/facility/show")
    @ResponseBody
    public List<CauseDetailDto> listFacility(){
        String 원인명 = "시설 결함";
        return causeService.selectCause(원인명);
    }
    @GetMapping("/facility/year")
    @ResponseBody
    public List<YearDto> listFacilityYear(){
        String 원인명 = "시설 결함";
        return causeService.selectYear(원인명);
    }



    //운송차량
    @GetMapping("/vehicle")
    public String vehicle(){
        return "vehicle";
    }

    @GetMapping("/vehicle/show")
    @ResponseBody
    public List<CauseDetailDto> listVehicle(){
        String 원인명 = "운송차량";
        return causeService.selectCause(원인명);
    }
    @GetMapping("/vehicle/year")
    @ResponseBody
    public List<YearDto> listVehicleYear(){
        String 원인명 = "운송차량";
        return causeService.selectYear(원인명);
    }



    //자연재해
    @GetMapping("/disasters")
    public String disasters(){
        return "disasters";
    }

    @GetMapping("/disasters/show")
    @ResponseBody
    public List<CauseDetailDto> listDisasters(){
        String 원인명 = "자연재해";
        return causeService.selectCause(원인명);
    }
    @GetMapping("/disasters/year")
    @ResponseBody
    public List<YearDto> listDisastersYear(){
        String 원인명 = "자연재해";
        return causeService.selectYear(원인명);
    }



    //데이터 표
    @GetMapping("/data")
    public String data(){

        return "data";
    }











}
