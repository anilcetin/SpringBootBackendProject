package com.anilcetin.dev.HexFinder.bussiness.abstracts;

import java.util.List;

import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.DataEntity;

public interface DataService {
	DataResult<List<DataEntity>> getAll();
	Result add(DataEntity data);
	DataResult<List<DataEntity>> getByHexIdStartsWith(String hexId);
}
