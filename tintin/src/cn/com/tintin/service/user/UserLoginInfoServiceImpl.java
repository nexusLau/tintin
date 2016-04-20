package cn.com.tintin.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.tintin.dao.user.IUserLoginDao;
import cn.com.tintin.entry.UserLoginInfoEntry;

@Service
public class UserLoginInfoServiceImpl implements IUserLoginInfoService{
	
	@Autowired
	private IUserLoginDao userLoginDao;
	
	@Override
	public String getUserNameById(String id) {
		return userLoginDao.getUserNameById(id);
	}

	@Override
	public UserLoginInfoEntry getUserInfoById(long id) {
		return userLoginDao.getUserInfoById(id);
	}
	
}
