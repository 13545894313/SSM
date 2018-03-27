/**
 * 在线学习平台 
 * com.foxconn.web.user
 * UserController.java
 * 创建人:feng
 * 时间：2018/2/28-下午4:08:26 
 * 2018Tm公司-版权所有
 */
package com.foxconn.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * UserController
 * 创建人:feng 
 * 时间：2018/2/28-下午4:08:26 
 * @version 1.0.0
 * 
 */
@Controller
public class UserController {
	@RequestMapping("/index")
	public String index(){
		System.out.println("jinlai");
		return "index";
	}
	
}
