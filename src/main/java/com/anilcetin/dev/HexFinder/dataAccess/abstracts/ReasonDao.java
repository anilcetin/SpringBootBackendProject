package com.anilcetin.dev.HexFinder.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anilcetin.dev.HexFinder.entities.concretes.Reason;

public interface ReasonDao extends JpaRepository<Reason,Integer> {
	Reason findById(int id);
}
