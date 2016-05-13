package cn.com.tintin.mapper;

import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.vo.common.PageInfo;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IUserLoginMapper  extends Mapper<UserLoginInfoEntry> {
	
	public String getUserNameById(String id);
	
	public PageInfo<UserLoginInfoEntry> getUserInfoPage();

}
