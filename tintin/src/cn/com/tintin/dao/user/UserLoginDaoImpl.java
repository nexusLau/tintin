package cn.com.tintin.dao.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.mapper.IUserLoginMapper;

import com.github.pagehelper.PageHelper;



@Repository
public class UserLoginDaoImpl   implements IUserLoginDao {
	
	
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactory;
	
	
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
	
	@Override
	public List<UserLoginInfoEntry> getUserInfoPage(){
		SqlSession sqlSession = null;
			try {
				sqlSession=sqlSessionFactory.getObject().openSession();
				IUserLoginMapper userLoginMapper=sqlSession.getMapper(IUserLoginMapper.class);
				PageHelper.startPage(1,20);
			    List<UserLoginInfoEntry> list = userLoginMapper.selectAll();
			    return list;
			} catch (Exception e) {
				e.printStackTrace();
			}
	    finally {
            sqlSession.close();
        }
			return null;
	}

	

}
