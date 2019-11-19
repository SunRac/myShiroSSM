package com.myshiro.service.impl;

import com.myshiro.mapper.UserMapper;
import com.myshiro.pojo.User;
import com.myshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUser(String name) {
		User u  = userMapper.getByName(name);
		if(null==u)
			return null;
		return u;
	}

}
