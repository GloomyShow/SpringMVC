/**
 * 
 * BaseController.java
 * 2014-12-8
 * 596570
 * 
 * Copyright ©2014 顺丰科技有限公司  All rights reserved.
 * 
 */
package com.base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * The Class BaseController.
 */
@SuppressWarnings("unused")
public class BaseController {

	/** The Constant logger. */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(BaseController.class);

	/** The Constant SYSTEM_ERROR. */
	public static final String SYSTEM_ERROR = "系统错误！";

	



}
