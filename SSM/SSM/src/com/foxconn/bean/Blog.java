/**
 * 在线学习平台 
 * com.foxconn.bean
 * Blog.java
 * 创建人:feng
 * 时间：2018/3/1-下午4:08:57 
 * 2018Tm公司-版权所有
 */
package com.foxconn.bean;

import java.sql.Date;

/**
 * 
 * Blog 创建人:feng 时间：2018/3/1-下午4:08:57
 * 
 * @version 1.0.0
 * 
 */
public class Blog {
	private Integer id;
	private String title;
	private String description;
	private Integer categoryId;
	private String img;
	private Date createTime;
	private Date updateTime;
	private String musictor;
	private String musiclink;
	private String musictitle;
	private Integer musicsize;
	private String musictime;
	private Integer hits;
	private Integer comments;
	private Integer status;
	private Integer isDelet;
	private Integer userId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public String getMusictor() {
		return musictor;
	}
	public void setMusictor(String musictor) {
		this.musictor = musictor;
	}
	public String getMusiclink() {
		return musiclink;
	}
	public void setMusiclike(String musiclink) {
		this.musiclink = musiclink;
	}
	public String getMusictitle() {
		return musictitle;
	}
	public void setMusictitle(String musictitle) {
		this.musictitle = musictitle;
	}
	public Integer getMusicsize() {
		return musicsize;
	}
	public void setMusicsize(Integer musicsize) {
		this.musicsize = musicsize;
	}
	public String getMusictime() {
		return musictime;
	}
	public void setMusictime(String musictime) {
		this.musictime = musictime;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getComments() {
		return comments;
	}
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsDelet() {
		return isDelet;
	}
	public void setIsDelet(Integer isDelet) {
		this.isDelet = isDelet;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

}
