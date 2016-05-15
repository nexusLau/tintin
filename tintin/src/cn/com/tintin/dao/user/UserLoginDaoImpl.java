package cn.com.tintin.dao.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.mapper.IUserLoginMapper;
import cn.com.tintin.vo.common.PageInfo;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
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
		final IUserLoginMapper userLoginMapper=sqlSession.getMapper(IUserLoginMapper.class);
			   Page<UserLoginInfoEntry> page=PageHelper.startPage(1, 20).doSelectPage(new ISelect() {
				
				@Override
				public void doSelect() {
					  userLoginMapper.selectAll();
				}
			});
			   System.out.println(page.getTotal());
				return null;
			} catch (Exception e) {
				e.printStackTrace();
			}
	    finally {
            sqlSession.close();
        }
			return null;
	}

	

}
