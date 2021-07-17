package com.anilcetin.dev.HexFinder.bussiness.abstracts;

import java.util.List;

import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Cliem;

public interface CliemService {
	DataResult<List<Cliem>> getAll();
	Result add(Cliem cliem);
}
