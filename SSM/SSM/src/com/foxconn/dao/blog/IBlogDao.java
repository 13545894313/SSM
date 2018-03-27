/**
 * 在线学习平台 
 * com.foxconn.dao.blog
 * IBlogDao.java
 * 创建人:feng
 * 时间：2018/3/1-下午4:40:19 
 * 2018Tm公司-版权所有
 */
package com.foxconn.dao.blog;

import java.util.HashMap;
import java.util.List;

import com.foxconn.bean.Blog;

/**
 * 
 * IBlogDao
 * 创建人:feng 
 * 时间：2018/3/1-下午4:40:19 
 * @version 1.0.0
 * 
 */
public interface IBlogDao {
	
	public List<HashMap<String, Object>> findBlogs();
	
	
	public HashMap<String, Object> getBlogById(Integer id);
	
	public void saveBlog(Blog blog);
	
	
	
	
	

}
