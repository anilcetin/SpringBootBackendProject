package com.anilcetin.dev.HexFinder.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anilcetin.dev.HexFinder.entities.concretes.DataEntity;

public interface DataDao extends JpaRepository<DataEntity,Integer> {
	List<DataEntity> getByHexIdStartsWith(String hexId);
}
