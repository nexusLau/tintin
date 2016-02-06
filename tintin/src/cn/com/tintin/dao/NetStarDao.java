package cn.com.tintin.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface NetStarDao<T>  extends Mapper<T> ,MySqlMapper<T>{
	
}
