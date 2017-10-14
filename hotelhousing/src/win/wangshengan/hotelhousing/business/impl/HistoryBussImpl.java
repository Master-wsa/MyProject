package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.HistoryBuss;
import win.wangshengan.hotelhousing.dao.HistoryDao;
import win.wangshengan.hotelhousing.dao.impl.HistoryDaoImpl;
import win.wangshengan.hotelhousing.entity.History;

public class HistoryBussImpl implements HistoryBuss {

	HistoryDao historyDao = new HistoryDaoImpl();
	@Override
	public boolean addHistory(History history) {
		// TODO Auto-generated method stub
		int i = historyDao.insertHistory(history);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public int updateHistory(History history) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delHistory(History history) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<History> getAllHistoryByCondition(History history) {
		// TODO Auto-generated method stub
		return historyDao.selectAllHistoryByCondition(history);
	}

}
