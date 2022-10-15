package kr.co.km.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.km.vo.UserVo;

@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<UserVo> selectList(){
		
		return sqlSession.selectList("UserDao.selectList");
	}
	public UserVo select(UserVo userVo){
		return sqlSession.selectOne("UserDao.select", userVo);
	}
}
