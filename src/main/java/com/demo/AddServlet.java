package com.demo;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
//@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		String l=Integer.toString(k);
	//	int k=Integer.parseInt(k);
		//System.out.print(k);
		//req.setAttribute("k", l);
		
	//	res.sendRedirect("sq?k="+l);//url rewriting
	///////Sending data using HTTP session
//		HttpSession sess=req.getSession();
//		sess.setAttribute("k", l);
//		res.sendRedirect("sq");
		
		
		PrintWriter out=res.getWriter();
		out.print("Result is" +k);
		//Req Dis and Redirect these are two methods to connect servlet to servlet
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		//Session Management is used send data from one servlet to another servlet
		//req.setAttribute("k", k);
		
		Cookie coo=new Cookie("k",k+"");
		res.addCookie(coo);
		res.sendRedirect("sq");
	}

}
