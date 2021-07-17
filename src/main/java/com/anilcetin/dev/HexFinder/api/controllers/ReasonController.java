package com.anilcetin.dev.HexFinder.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.ReasonService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Reason;

@RestController
@RequestMapping("/api/reasons/")
@CrossOrigin
public class ReasonController {

	private ReasonService reasonService;

	@Autowired
	public ReasonController(ReasonService reasonService) {
		super();
		this.reasonService = reasonService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Reason>> getAll() {
		return this.reasonService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Reason reason) {
		return this.reasonService.add(reason);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Reason reason) {
		return this.reasonService.update(reason);
	}
	
	@PostMapping("delete")
	public Result delete(@RequestBody Reason reason) {
		return this.reasonService.delete(reason);
	}
	
	@GetMapping("findById")
	public Result findById(int id) {
		return this.reasonService.findById(id);
	}
}
