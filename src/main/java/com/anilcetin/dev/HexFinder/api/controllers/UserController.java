package com.anilcetin.dev.HexFinder.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.UserService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.User;


@RestController
@RequestMapping("/api/users/")
@CrossOrigin
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody User user) {
		return this.userService.update(user);
	}
	
	@PostMapping("delete")
	public Result delete(@RequestBody User user) {
		return this.userService.delete(user);
	}
	
	@GetMapping("findByEmail")
	public Result findById(@RequestParam String email) {
		return this.userService.findByEmail(email);
	}
	
	@GetMapping("findById")
	public Result findById(@RequestParam int id) {
		return this.userService.findById(id);
	}
}
