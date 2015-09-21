/**
 * 
 * PageParameter.java
 * 2014-12-8
 * 596570
 * 
 * Copyright ©2014 顺丰科技有限公司  All rights reserved.
 * 
 */
package com.base.util;

import java.io.Serializable;

/**
 * 分页参数类
 * 
 */
public class PageParameter implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The Constant DEFAULT_PAGE_SIZE. */
	public static final int DEFAULT_PAGE_SIZE = 10;

    /** The page size. */
    private int pageSize;
    
    /** The cur page. */
    private int curPage;
//    private int prePage;
//    private int nextPage;
//    private int totalPage;
    /** The total count. */
private int totalCount;
    
    /** The data. */
    private Object data;

    /**
     * Instantiates a new page parameter.
     */
    public PageParameter() {
        this.setCurPage(1);
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     * Gets the data.
     *
     * @author 596570
     * @date 2014-12-5 13:51:17
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
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @param data the new data
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
     * 
     * @param currentPage
     * @param pageSize
//     */
    public PageParameter(int curPage, int pageSize) {
    	this.curPage = curPage;
    	this.pageSize = pageSize;
    }
//
//    PUBLIC INT GETCURRENTPAGE() {
//        RETURN CURRENTPAGE;
//    }
//
//    PUBLIC VOID SETCURRENTPAGE(INT CURRENTPAGE) {
//        THIS.CURRENTPAGE = CURRENTPAGE;
//    }

    /**
 * Gets the page size.
 *
 * @author 596570
 * @date 2014-12-5 13:51:17
 * @since 
 * @return the page size
 */
public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the page size.
     *
     * @author 596570
     * @date 2014-12-5 13:51:17
     * @since 
     * @param pageSize the new page size
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
//
//    public int getPrePage() {
//        return prePage;
//    }
//
//    public void setPrePage(int prePage) {
//        this.prePage = prePage;
//    }

//    public int getNextPage() {
//        return nextPage;
//    }
//
//    public void setNextPage(int nextPage) {
//        this.nextPage = nextPage;
//    }
//
//    public int getTotalPage() {
//        return totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }

    /**
 * Gets the total count.
 *
 * @author 596570
 * @date 2014-12-5 13:51:17
 * @since 
 * @return the total count
 */
public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the total count.
     *
     * @author 596570
     * @date 2014-12-5 13:51:17
     * @since 
     * @param totalCount the new total count
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

	/**
	 * Gets the cur page.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @return the cur page
	 */
	public int getCurPage() {
		return curPage;
	}

	/**
	 * Sets the cur page.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:17
	 * @since 
	 * @param curPage the new cur page
	 */
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

}
