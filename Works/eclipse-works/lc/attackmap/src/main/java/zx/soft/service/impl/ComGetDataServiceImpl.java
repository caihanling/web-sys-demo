package zx.soft.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zx.soft.dao.ComGetDataDao;
import zx.soft.model.Computer;
import zx.soft.service.ComGetDataService;

@Service
public class ComGetDataServiceImpl implements ComGetDataService {

	@Inject
	private ComGetDataDao comGetDataDao;
	
	public List<Computer> getData() {
		return comGetDataDao.getAllData();
	}

}
