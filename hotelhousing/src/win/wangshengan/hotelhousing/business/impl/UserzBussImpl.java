/**
 * 
 */
package win.wangshengan.hotelhousing.business.impl;

import java.util.List;

import win.wangshengan.hotelhousing.business.UserzBuss;
import win.wangshengan.hotelhousing.dao.UserzDao;
import win.wangshengan.hotelhousing.dao.impl.UserzDaoImpl;
import win.wangshengan.hotelhousing.entity.Userz;

/**
 * 客户业务实现类
 * @author AnJia
 *
 */
public class UserzBussImpl implements UserzBuss {

	UserzDao userzDao = new UserzDaoImpl();
	@Override
	public boolean addUserz(Userz userz) {
		// TODO Auto-generated method stub
		int i = userzDao.insertUserz(userz);
		if(i > 0)	return true;
		return false;
	}

	@Override
	public boolean updateUserz(Userz userz) {
		// TODO Auto-generated method stub
		int i = userzDao.updateUserz(userz);
		if(i>0)	return true;
		return false;
	}

	@Override
	public boolean delUserz(Userz userz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Userz> getAllUserz() {
		// TODO Auto-generated method stub
		return userzDao.selectAllUserz();
	}

	@Override
	public Userz getUserzById(String id) {
		// TODO Auto-generated method stub
		return userzDao.selectUserzById(id);
	}

	@Override
	public boolean getUserzByIdPsw(Userz userz) {
		// TODO Auto-generated method stub
		Userz user = userzDao.selectUserzByIdPsw(userz);
		if(user != null) return true;
		return false;
	}

}
