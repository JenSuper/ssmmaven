package com.rd.service;

import com.rd.pojo.User;

import java.util.List;


public interface UserService {
	List<User> show();
	int updUser(User user);
}
