package cn.com.tintin.service.console;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import cn.com.tintin.vo.console.PlantformFunctionVo;


/**
 * 
 * 作者： liumaoyang
 *
 * 创建时间：2016-4-29 下午2:38:32
 * 
 * 实现功能：后台控制的service
 */
@Service
public class ConsoleService implements IConsoleService {
	
	public List<PlantformFunctionVo> getFunctionList(String parentId){
		
		return null;
	}
	
}
