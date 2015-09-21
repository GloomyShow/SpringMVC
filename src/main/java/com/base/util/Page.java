/**
 * 
 * Page.java
 * 2014-12-8
 * 596570
 * 
 * Copyright ©2014 顺丰科技有限公司  All rights reserved.
 * 
 */
package com.base.util;

import java.io.Serializable;
import java.util.List;

/**
 * The Class Page.
 */
public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The total. */
	private long total;
	
	/** The rows. */
	private List<?> rows;

	/**
	 * Gets the total.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @param total the new total
	 */
	public void setTotal(long total) {
		this.total = total;
	}

	/**
	 * Gets the rows.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @return the rows
	 */
	public List<?> getRows() {
		return rows;
	}

	/**
	 * Sets the rows.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @param rows the new rows
	 */
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
