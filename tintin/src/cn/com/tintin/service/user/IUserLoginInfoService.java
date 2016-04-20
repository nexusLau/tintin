package cn.com.tintin.service.user;

import cn.com.tintin.entry.UserLoginInfoEntry;

public interface IUserLoginInfoService {
	
	public String getUserNameById(String id);
	
	public UserLoginInfoEntry getUserInfoById(long id);
	

}
