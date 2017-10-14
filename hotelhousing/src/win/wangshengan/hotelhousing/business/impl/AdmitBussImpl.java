package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.AdmitBuss;
import win.wangshengan.hotelhousing.dao.AdmitDao;
import win.wangshengan.hotelhousing.dao.impl.AdmitDaoImpl;
import win.wangshengan.hotelhousing.entity.Admit;

public class AdmitBussImpl implements AdmitBuss {

	AdmitDao admitDao = new AdmitDaoImpl();
	@Override
	public int addAdmit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean updateAdmit(Admit admit) {
		// TODO Auto-generated method stub
		int i = admitDao.updateAdmit(admit);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public int delAdmit(Admit admit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admit> getAllAdmits() {
		// TODO Auto-generated method stub
		return admitDao.selectAllAdmits();
	}

	@Override
	public Admit getAdmit(Admit admit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getAdmitByIdPsw(Admit admit) {
		// TODO Auto-generated method stub
		Admit ad = admitDao.selectAdmitByIdPsw(admit);
		if(ad != null)	return true;
		return false;
	}

	

}
