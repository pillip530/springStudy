package kr.co.km.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.km.dao.UserDAO;
import kr.co.km.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDao;
	
	public List<UserVo> selectList(){
		
		return userDao.selectList();
	}
	
	
}
