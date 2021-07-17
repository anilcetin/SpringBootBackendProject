package com.anilcetin.dev.HexFinder.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anilcetin.dev.HexFinder.entities.concretes.Cliem;

public interface CliemDao extends JpaRepository<Cliem,Integer>{

}
