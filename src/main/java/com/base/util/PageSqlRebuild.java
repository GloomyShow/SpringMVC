/**
 * 
 * PageSqlRebuild.java
 * 2014-12-8
 * 596570
 * 
 * Copyright ©2014 顺丰科技有限公司  All rights reserved.
 * 
 */
package com.base.util;


/**
 * @author sfit0353
 *
 */
public interface PageSqlRebuild {

	/**
	 * Builds the page sql.
	 *
	 * @author 596570
	 * @date 2014-12-8 20:38:29
	 * @since 
	 * @param sql the sql
	 * @param page the page
	 * @return the string
	 */
	public String buildPageSql(String sql, PageParameter page);
}
