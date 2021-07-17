package com.anilcetin.dev.HexFinder.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.CliemService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Cliem;


@RestController
@RequestMapping("/api/cliems/")
@CrossOrigin
public class CliemController {
	
	private CliemService cliemService;

	@Autowired
	public CliemController(CliemService cliemService) {
		super();
		this.cliemService = cliemService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Cliem>> getAll() {
		return this.cliemService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Cliem cliem) {
		return this.cliemService.add(cliem);
	}
}
