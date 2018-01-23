package com.eduask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduask.mapper.UserMapper;
import com.eduask.model.User;
@Service("service")
public class UserServiceImple implements UserService {

	@Autowired
	private UserMapper userMapper;

	public int insert(User record) {
		return userMapper.insert(record);
	}

}
