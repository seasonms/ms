package com.cs.servlet;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs.pojo.Flower;
import com.cs.service.FlowerService;
import com.cs.service.impl.FlowerServiceImpl;



public class FlowerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -957837083251704997L;

	FlowerService flowerService = new FlowerServiceImpl();
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException{
		List<Flower> list = flowerService.show();
		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
