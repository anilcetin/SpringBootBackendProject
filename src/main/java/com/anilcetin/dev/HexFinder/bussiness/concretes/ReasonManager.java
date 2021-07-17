package com.anilcetin.dev.HexFinder.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.ReasonService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessDataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessResult;
import com.anilcetin.dev.HexFinder.dataAccess.abstracts.ReasonDao;
import com.anilcetin.dev.HexFinder.entities.concretes.Reason;

@Service
public class ReasonManager implements ReasonService{
	
	private ReasonDao reasonDao;
	
	@Autowired
	public ReasonManager(ReasonDao reasonDao) {
		super();
		this.reasonDao = reasonDao;
	}

	@Override
	public DataResult<List<Reason>> getAll() {
		return new SuccessDataResult<List<Reason>>(this.reasonDao.findAll(),"Tüm datalar listelendi.");
	}

	@Override
	public Result add(Reason reason) {
		this.reasonDao.save(reason);
		return new SuccessDataResult<Reason>(reason, "Data eklendi.");
	}

	@Override
	public DataResult<Reason> findById(int id) {
		return new SuccessDataResult<Reason>(this.reasonDao.findById(id),"Data listelendi.");
	}

	@Override
	public Result update(Reason reason) {
		this.reasonDao.save(reason);
		return new SuccessResult("Data güncellendi.");
	}

	@Override
	public Result delete(Reason reason) {
		this.reasonDao.delete(reason);
		return new SuccessResult("Data silindi.");
	}

}
