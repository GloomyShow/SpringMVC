package com.base;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The Class BaseEntity.
 */
public class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private String id;
	
	/** The created by. */
	private String createdBy;
	
	/** The created time. */
	private Timestamp createdTime;
	
	/** The updated by. */
	private String updatedBy;
	
	/** The updated time. */
	private Timestamp updatedTime;
	
	/** The is enable. */
	private Integer isEnable;
	
	/** The is validity. */
	private Integer isValidity;
	
	/**
	 * Gets the created by.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the created by
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * Sets the created by.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the id.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the checks if is validity.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the checks if is validity
	 */
	public Integer getIsValidity() {
		return isValidity;
	}

	/**
	 * Sets the checks if is validity.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param isValidity the new checks if is validity
	 */
	public void setIsValidity(Integer isValidity) {
		this.isValidity = isValidity;
	}

	/**
	 * Gets the checks if is enable.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the checks if is enable
	 */
	public Integer getIsEnable() {
		return isEnable;
	}

	/**
	 * Sets the checks if is enable.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param isEnable the new checks if is enable
	 */
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}


	/**
	 * Gets the updated by.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the updated by
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * Sets the updated by.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param updatedBy the new updated by
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * Gets the created time.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the created time
	 */
	public Timestamp getCreatedTime() {
		return createdTime;
	}

	/**
	 * Sets the created time.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param createdTime the new created time
	 */
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * Gets the updated time.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @return the updated time
	 */
	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * Sets the updated time.
	 *
	 * @author 596570
	 * @date 2014-12-5 13:51:18
	 * @since 
	 * @param updatedTime the new updated time
	 */
	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

}
