package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.TurnoverBuss;
import win.wangshengan.hotelhousing.dao.TurnoverDao;
import win.wangshengan.hotelhousing.dao.impl.TurnoverDaoImpl;
import win.wangshengan.hotelhousing.entity.Turnover;

public class TurnoverBussImpl implements TurnoverBuss {
	TurnoverDao turnoverDao = new TurnoverDaoImpl();
	@Override
	public boolean addTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		int i = turnoverDao.insertTurnover(turnover);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public boolean updateTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		int i = turnoverDao.updateTurnover(turnover);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public int delTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Turnover> getAllTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		return turnoverDao.selectAllTurnover(turnover);
	}

	@Override
	public Turnover getTurnover(Turnover turnover) {
		// TODO Auto-generated method stub
		return turnoverDao.selectTurnover(turnover);
	}

}
