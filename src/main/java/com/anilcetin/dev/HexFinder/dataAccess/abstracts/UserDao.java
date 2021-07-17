package com.anilcetin.dev.HexFinder.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anilcetin.dev.HexFinder.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{
	User findByEmail(String email);
	User findById(int id);
}
