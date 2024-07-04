package com.example.python;

import com.example.python.dto.CauseDto;
import com.example.python.dto.ChemicalDto;
import com.example.python.dto.DamageDto;
import com.example.python.dto.KindDto;
import com.example.python.service.CauseService;
import com.example.python.service.ChemicalService;
import com.example.python.service.DamageService;
import com.example.python.service.KindService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class PythonApplicationTests {

	@Autowired
	private CauseService causeService;

	@Autowired
	private KindService kindService;

	@Autowired
	private ChemicalService chemicalService;

	@Autowired
	private DamageService damageService;

	@Test
	void contextLoads() {
		CauseDto name = new CauseDto();
		name.setCauseId(4);
		name.setCauseName("자연재해");
		int result = causeService.insertCause(name);
		System.out.println(result);
	}

	@Test
	void listAll(){
		List<CauseDto> list = causeService.causeAll();
		System.out.println(list);
	}

	@Test
	void insertKind(){
		KindDto kindDto = new KindDto();
		kindDto.setKindId(4);
		kindDto.setKindName("기타");
		int result = kindService.insertKind(kindDto);
		System.out.println(result);
	}

	@Test
	void insertChem(){
		ChemicalDto chemicalDto = new ChemicalDto();
		chemicalDto.setAccidentNumber(1);
		chemicalDto.setKindId(1);
		chemicalDto.setCauseId(1);
		chemicalDto.setAccidentDay(LocalDateTime.of(2017, 11, 12, 0, 0));
		int result = chemicalService.insertChem(chemicalDto);
		System.out.println(result);
	}

	@Test
	void insertDamage(){
		DamageDto damageDto = new DamageDto();
		damageDto.setAccidentNumber(1);
		damageDto.setDead(20);
		damageDto.setWounded(10);
		damageDto.setCasualty(30);
		int result = damageService.insertDamage(damageDto);
	}
}
