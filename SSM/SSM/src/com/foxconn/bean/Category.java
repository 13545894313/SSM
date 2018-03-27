/**
 * 在线学习平台 
 * com.foxconn.bean
 * Category.java
 * 创建人:feng
 * 时间：2018/3/1-下午4:17:56 
 * 2018Tm公司-版权所有
 */
package com.foxconn.bean;

import java.sql.Date;

/**
 * 
 * Category
 * 创建人:feng 
 * 时间：2018/3/1-下午4:17:56 
 * @version 1.0.0
 * 
 */
public class Category {
	
	private Integer id;
	private String nameString;
	private Integer status;
	private Date createTime;
	private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
