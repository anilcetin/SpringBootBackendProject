package com.anilcetin.dev.HexFinder.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.DataService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessDataResult;
import com.anilcetin.dev.HexFinder.dataAccess.abstracts.DataDao;
import com.anilcetin.dev.HexFinder.entities.concretes.DataEntity;

@Service
public class DataManager implements DataService{
	
	private DataDao dataDao;
	
	@Autowired
	public DataManager(DataDao dataDao) {
		super();
		this.dataDao = dataDao;
	}

	@Override
	public DataResult<List<DataEntity>> getAll() {
		return new SuccessDataResult<List<DataEntity>>(this.dataDao.findAll(),"Tüm datalar listelendi");
	}

	@Override
	public Result add(DataEntity data) {
		this.dataDao.save(data);
		return new SuccessDataResult<DataEntity>(data, "Data eklendi");
	}

	@Override
	public DataResult<List<DataEntity>> getByHexIdStartsWith(String hexId) {
		return new SuccessDataResult<List<DataEntity>>(this.dataDao.getByHexIdStartsWith(hexId),"HexIdler listelendi");
	}


}
