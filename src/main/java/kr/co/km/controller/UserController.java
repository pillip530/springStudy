package kr.co.km.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.km.service.UserService;
import kr.co.km.vo.UserVo;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//@RequestMapping(value = "/users", method = RequestMethod.GET)
	@PostMapping("/users")
	public @ResponseBody List<UserVo> selectList(){
		return userService.selectList();
	}
	
	@GetMapping("/user/{userName}")
	public @ResponseBody UserVo select(UserVo userVo, @PathVariable String userName){
		userVo.setName(userName);
		return userService.select(userVo);
	}
}
