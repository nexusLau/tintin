package cn.com.tintin.dao.user;

import org.springframework.stereotype.Repository;

@Repository
public interface IUserLoginMapper {
	
	public String getUserNameById(String id);

}
