/**
 * 
 * ResultJson.java
 * 2014-12-8
 * 596570
 * 
 * Copyright ©2014 顺丰科技有限公司  All rights reserved.
 * 
 */
package com.base.util;

import java.io.Serializable;

/**
 * The Class ResultJson.
 */
public class ResultJson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The success. */
	private boolean success = false;
	
	/** The msg. */
	private String msg = null;
	
	/** The data. */
	private Object data = null;
	
	/**
	 * Instantiates a new result json.
	 */
	public ResultJson() {
	}
	
	/**
	 * Instantiates a new result json.
	 *
	 * @param msg the msg
	 */
	public ResultJson(String msg){
		this.msg = msg;
	}
	
	/**
	 * Instantiates a new result json.
	 *
	 * @param success the success
	 * @param msg the msg
	 */
	public ResultJson(boolean success, String msg){
		this.msg = msg;
		this.success = success;
	}

	/**
	 * Checks if is success.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return true, if is success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the success.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param success the new success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Gets the msg.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * Sets the msg.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param msg the new msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * Gets the data.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param data the new data
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
}
