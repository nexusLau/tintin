package cn.com.tintin.dao.user;

import java.util.List;

import cn.com.tintin.entry.UserLoginInfoEntry;

public interface IUserLoginDao {
	
	public String getUserNameById(String id);
	
	public UserLoginInfoEntry getUserInfoById(long id);
	
	public   List<UserLoginInfoEntry>  getUserInfoPage();

}
