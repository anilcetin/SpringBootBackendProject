package com.anilcetin.dev.HexFinder.bussiness.abstracts;

import java.util.List;

import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
	DataResult<User> putByEmail (User user);
	DataResult<User> findByEmail(String email);
	DataResult<User> findById(int id);
	Result update(User user);
	Result delete(User user);
}
