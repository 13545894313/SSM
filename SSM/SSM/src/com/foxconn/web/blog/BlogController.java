/**
 * 在线学习平台 
 * com.foxconn.web.blog
 * BlogController.java
 * 创建人:feng
 * 时间：2018/2/28-下午5:14:24 
 * 2018Tm公司-版权所有
 */
package com.foxconn.web.blog;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.foxconn.dao.blog.IBlogDao;

/**
 * 
 * BlogController
 * 创建人:feng 
 * 时间：2018/2/28-下午5:14:24 
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private IBlogDao blogDao;
	
	@RequestMapping("index")
	public ModelAndView index(){
		List<HashMap<String, Object>> blogs = blogDao.findBlogs();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("blogs",blogs);
		modelAndView.setViewName("blog/index");
		return modelAndView;
	}
	
	@RequestMapping("/detail/{id}")
	public ModelAndView index(@PathVariable("id")Integer id){
		HashMap<String, Object> blog = blogDao.getBlogById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("blog",blog);
		modelAndView.setViewName("blog/detail");
		return modelAndView;
	}
	

	
	
	
	
	
	
	
}
