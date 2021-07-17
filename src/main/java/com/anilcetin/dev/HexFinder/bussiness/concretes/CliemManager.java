package com.anilcetin.dev.HexFinder.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.CliemService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessDataResult;
import com.anilcetin.dev.HexFinder.dataAccess.abstracts.CliemDao;
import com.anilcetin.dev.HexFinder.entities.concretes.Cliem;

@Service
public class CliemManager implements CliemService {
	
	private CliemDao cliemDao;
	
	@Autowired
	public CliemManager(CliemDao cliemDao) {
		super();
		this.cliemDao = cliemDao;
	}

	@Override
	public DataResult<List<Cliem>> getAll() {
		return new SuccessDataResult<List<Cliem>>(this.cliemDao.findAll(), "Tüm yetkiler listelendi");
	}

	@Override
	public Result add(Cliem cliem) {
		this.cliemDao.save(cliem);
		return new SuccessDataResult<Cliem>(cliem, "Yetki kaydedildi");
	}

}
