/**
 * 在线学习平台 
 * com.foxconn.dao.user
 * IUserDao.java
 * 创建人:feng
 * 时间：2018/2/28-上午10:44:44 
 * 2018Tm公司-版权所有
 */
package com.foxconn.dao.user;

import java.util.List;

import com.foxconn.bean.User;


/**
 * 
 * IUserDao
 * 创建人:feng 
 * 时间：2018/2/28-上午10:44:44 
 * @version 1.0.0
 * 
 */
public interface IUserDao {
	
	public List<User> findUsers();
	
	public void saveUser(User user);

}
