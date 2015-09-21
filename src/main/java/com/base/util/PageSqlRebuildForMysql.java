/**
 * 
 * PageSqlRebuildForMysql.java
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
public class PageSqlRebuildForMysql implements PageSqlRebuild {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sf.oms.page.PageSqlRebuild#buildPageSql(java.lang.String,
	 * com.sf.oms.common.base.PageParameter)
	 */
	@Override
	public String buildPageSql(String sql, PageParameter page) {
		StringBuilder pageSql = new StringBuilder(100);
		String beginrow = String.valueOf((page.getCurPage() - 1)
				* page.getPageSize());
		pageSql.append(sql);
		pageSql.append(" limit ?, ? ");

		return pageSql.toString();
	}

}
