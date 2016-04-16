package cn.com.tintin.mapper;

import org.springframework.stereotype.Repository;

import cn.com.tintin.entry.UserLoginInfoEntry;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IUserLoginMapper  extends Mapper<UserLoginInfoEntry> {
	
	public String getUserNameById(String id);

}
