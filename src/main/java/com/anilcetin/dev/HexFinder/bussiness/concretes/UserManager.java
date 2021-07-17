package com.anilcetin.dev.HexFinder.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.UserService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessDataResult;
import com.anilcetin.dev.HexFinder.dataAccess.abstracts.UserDao;
import com.anilcetin.dev.HexFinder.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Tüm kullanıcılar listelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessDataResult<User>(user, "Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> putByEmail(User user) {
		this.userDao.save(user);
		return new SuccessDataResult<User>(user, "test");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessDataResult<>("Data güncellendi");
	}

	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessDataResult<>("Data silindi");
	}

	@Override
	public DataResult<User> findById(int id) {
		return new SuccessDataResult<User>(this.userDao.findById(id),"Kullanıcı bulundu");
	}


}
