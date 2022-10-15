package kr.co.km.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.km.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDao;
	
	public List<Map<String, Object>> selectList(){
		
		return userDao.selectList();
	}
	
	
}
