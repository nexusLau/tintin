package cn.com.tintin.dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.mapper.IUserLoginMapper;

@Repository
public class UserLoginDaoImpl  implements IUserLoginDao{

	@Autowired
	private IUserLoginMapper userLoginMapper;
	
	@Override
	public String getUserNameById(String id) {
		return userLoginMapper.getUserNameById(id);
	}

	@Override
	public UserLoginInfoEntry getUserInfoById(long id) {
		return userLoginMapper.selectByPrimaryKey(id);
	}

}
