package com.anilcetin.dev.HexFinder.bussiness.abstracts;

import java.util.List;

import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Reason;

public interface ReasonService {
	DataResult<List<Reason>> getAll();
	DataResult<Reason>findById(int id);
	Result add(Reason reason);
	Result update(Reason reason);
	Result delete(Reason reason);
}
