package com.rd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.rd.mapper.UserMapper;
import com.rd.pojo.User;
import com.rd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper usersMapper;
	@Override
	public List<User> show() {
		return usersMapper.selAll();
	}

	@Override
	public int updUser(User user) {
		return usersMapper.updateTutor(user);
	}

}
