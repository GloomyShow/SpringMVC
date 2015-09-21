package com.base.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.BaseController;
import com.base.dto.User;
import com.base.service.UserService;
import com.base.util.ResultJson;


@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

		/** The Constant logger. */
		private static final Logger LOGGER = LoggerFactory
				.getLogger(UserController.class);

		/** The user service. */
		@Autowired
		private UserService userService;

		/**
		 * Adds the.
		 *
		 * @author 596570
		 * @since
		 * @date 2014-12-5 9:22:58
		 * @param user
		 *            the user
		 * @param result
		 *            the result
		 * @return the result json
		 */
		@RequestMapping(value = "/add")
		@ResponseBody
		public ResultJson add(User user) {
			ResultJson json = new ResultJson();
			try{
				json = this.userService.insertUser(user);
			} catch (Exception e) {
				LOGGER.error(e.getMessage(), e);
				json = new ResultJson(false, SYSTEM_ERROR);
			}
			return json;
		}
}
