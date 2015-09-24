package com.base.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dto.User;
import com.base.mapper.UserMapper;
import com.base.service.UserService;
import com.base.util.ResultJson;


/**
 * The Class UserServiceImpl.
 */

@Service("userService")
public class UserServiceImpl implements UserService {
	
	/** The Constant logger. */
	private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	/** The user mapper. */
	@Autowired
	private UserMapper userMapper;


	@Override
	public ResultJson insertUser(User user) {
		ResultJson json = new ResultJson();
		this.userMapper.insertUser(user);
		json.setSuccess(true);
		
		return json;
	}
}
