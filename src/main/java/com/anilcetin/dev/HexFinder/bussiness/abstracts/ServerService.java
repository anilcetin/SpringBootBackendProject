package com.anilcetin.dev.HexFinder.bussiness.abstracts;

import java.util.List;

import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.entities.concretes.Server;

public interface ServerService {
	DataResult<List<Server>> getAll();
	Result add(Server server);
}
