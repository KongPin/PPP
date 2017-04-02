package edu.ynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController {
	@RequestMapping("/project")
	public void index(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("index‘⁄÷¥––....");
		response.sendRedirect("");
		
	}

}
