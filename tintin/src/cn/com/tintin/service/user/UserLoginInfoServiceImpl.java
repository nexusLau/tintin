package cn.com.tintin.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.tintin.dao.user.IUserLoginDao;

@Service
public class UserLoginInfoServiceImpl implements IUserLoginInfoService{
	
	@Autowired
	private IUserLoginDao userLoginDao;
	
	@Override
	public String getUserNameById(String id) {
		return userLoginDao.getUserNameById(id);
	}
	
}
