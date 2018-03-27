/**
 * 在线学习平台 
 * com.test
 * ApplicationContextTest.java
 * 创建人:feng
 * 时间：2018/2/27-下午3:39:05 
 * 2018Tm公司-版权所有
 */
package com.test;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.logicalcobwebs.proxool.ProxoolDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.org.mozilla.javascript.internal.Context;

import com.foxconn.bean.User;
import com.foxconn.dao.blog.IBlogDao;
import com.foxconn.dao.user.IUserDao;
import com.mysql.jdbc.Connection;

/**
 * 
 * ApplicationContextTest 创建人:feng 时间：2018/2/27-下午3:39:05
 * 
 * @version 1.0.0
 * 
 */
public class ApplicationContextTest {
	@Test
	public void testApplicationContext() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");
		// SqlSessionFactory data =context.getBean(SqlSessionFactory.class);
		// SqlSession session=data.openSession(true);
		// List<User>
		// users=session.selectList("com.foxconn.dao.user.IUserDao.findUsers");
		//			
		//		IUserDao userDao = (IUserDao) context.getBean("IUserDao");
		//		User user = new User();
		//		user.setId(10);
		//		user.setUsername("ss");
		//		user.setPassword("ssss");
		//		userDao.saveUser(user);
		// System.out.println(userDao);
		// List<User> users=userDao.findUsers();
		// for (User user : users) {
		// System.out.println(user.getId()+"  "+user.getUserName()+"  "+user.getPassword());
		// }

		// String [] names =context.getBeanDefinitionNames();
		//			
		// for (String string : names) {
		// System.out.println(string);
		// }
		
		IBlogDao blogDao = (IBlogDao) context.getBean("IBlogDao");
		List<HashMap<String , Object>> blogs = blogDao.findBlogs();

		System.out.println(blogs.get(0));
		
	}
	
}
