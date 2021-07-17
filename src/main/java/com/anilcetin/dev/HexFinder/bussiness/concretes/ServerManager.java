package com.anilcetin.dev.HexFinder.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anilcetin.dev.HexFinder.bussiness.abstracts.ServerService;
import com.anilcetin.dev.HexFinder.core.utilities.results.DataResult;
import com.anilcetin.dev.HexFinder.core.utilities.results.Result;
import com.anilcetin.dev.HexFinder.core.utilities.results.SuccessDataResult;
import com.anilcetin.dev.HexFinder.dataAccess.abstracts.ServerDao;
import com.anilcetin.dev.HexFinder.entities.concretes.Server;

@Service
public class ServerManager implements ServerService{
	
	private ServerDao serverDao;
	
	@Autowired
	public ServerManager(ServerDao serverDao) {
		super();
		this.serverDao = serverDao;
	}

	@Override
	public DataResult<List<Server>> getAll() {
		return new SuccessDataResult<List<Server>>(this.serverDao.findAll(),"Tüm serverlar listelendi");
	}

	@Override
	public Result add(Server server) {
		this.serverDao.save(server);
		return new SuccessDataResult<Server>(server, "Server eklendi");
	}

}
