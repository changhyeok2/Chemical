package com.example.python.controller;

import com.example.python.config.PageHandler;
import com.example.python.dto.DataDto;
import com.example.python.service.DataService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;


    @GetMapping("/accidents")
    @ResponseBody
    public List<DataDto> getAllAccidents() {
        return dataService.allData();
    }


    @GetMapping("/search")
    @ResponseBody
    public List<DataDto> search(@RequestParam(required = false) String year,
                                @RequestParam(required = false) String kind,
                                @RequestParam(required = false) String cause) {
        return dataService.filterAccidents(year, kind, cause);
    }

}
