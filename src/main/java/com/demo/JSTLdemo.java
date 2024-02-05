package com.demo;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/JSTLdemo")
public class JSTLdemo extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		//Students s=new Students(1,"Srikanth");
		List<Students> s=Arrays.asList(new Students(1,"Srikanth"),new Students(2,"Sriramulu"),new Students(3,"Savithri"));
		req.setAttribute("label", s);
		RequestDispatcher rd=req.getRequestDispatcher("Profile.jsp");
		rd.forward(req, res);
	}

}
