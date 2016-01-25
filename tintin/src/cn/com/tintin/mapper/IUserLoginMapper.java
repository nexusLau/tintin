package cn.com.tintin.mapper;

import org.springframework.stereotype.Component;

@Component
public interface IUserLoginMapper {
	
	public String getUserNameById(String id);

}
