package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.CountsBuss;
import win.wangshengan.hotelhousing.dao.CountsDao;
import win.wangshengan.hotelhousing.dao.impl.CountsDaoImpl;
import win.wangshengan.hotelhousing.entity.Counts;

public class CountsBussImpl implements CountsBuss {

	CountsDao countsDao = new CountsDaoImpl();
	@Override
	public boolean addCount(Counts counts) {
		// TODO Auto-generated method stub
		int i = countsDao.insertCount(counts);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public boolean updateCount(Counts counts) {
		// TODO Auto-generated method stub
		int i = countsDao.updateCount(counts);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public boolean delCount(String id) {
		// TODO Auto-generated method stub
		int i = countsDao.deleteCount(id);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public List<Counts> getAllCounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counts getCount(Counts counts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counts getCountById(String id) {
		// TODO Auto-generated method stub
		return countsDao.selectCountById(id);
	}

}
