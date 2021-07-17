package com.anilcetin.dev.HexFinder.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.DataService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.DataEntity;

@RestController
@RequestMapping("/api/datas/")
@CrossOrigin
public class DataController {
	
	private DataService dataService;

	@Autowired
	public DataController(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<DataEntity>> getAll() {
		return this.dataService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody DataEntity data) {
		return this.dataService.add(data);
	}
	
	@GetMapping("getByHexId")
	public DataResult<List<DataEntity>> getByHexIdStartsWith(@RequestParam String hexId){
		return this.dataService.getByHexIdStartsWith(hexId);
	}
}
