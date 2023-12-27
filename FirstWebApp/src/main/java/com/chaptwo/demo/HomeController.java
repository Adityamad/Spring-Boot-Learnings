package com.chaptwo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//this will accept the request from jsp for perticular mapping for that we use this annotation. 
public class HomeController 
{
	@RequestMapping("home")//this will define when and for which request we have map/call this method.(here it will call for "home" only)
	public String home()
	{
		System.out.println("Hi request accepted");
		
		return "home.jsp";
	}
}
