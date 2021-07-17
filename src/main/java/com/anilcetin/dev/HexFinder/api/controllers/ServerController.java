package com.anilcetin.dev.HexFinder.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.ServerService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Server;

@RestController
@RequestMapping("/api/servers/")
@CrossOrigin
public class ServerController {
	
	private ServerService serverService;

	@Autowired
	public ServerController(ServerService serverService) {
		super();
		this.serverService = serverService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Server>> getAll() {
		return this.serverService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Server server) {
		return this.serverService.add(server);
	}
}
