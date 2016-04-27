package zx.soft.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import zx.soft.model.Computer;

@Repository
public interface ComGetDataDao {

	List<Computer> getAllData();
}
