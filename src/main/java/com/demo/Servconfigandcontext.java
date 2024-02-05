package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class Servconfigandcontext extends HttpServlet {

	//ServletConfig ServletContext
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("Hi Welecome Servlet <br/>");
		ServletContext con=getServletContext();//Java provides getServletContext method
		String str=con.getInitParameter("name");
		out.println(str);
		String str1=con.getInitParameter("mobile");
		out.println(str1);
		ServletConfig conf =getServletConfig();
		String str2=conf.getInitParameter("name");
		out.println(str2);
	}
	
}
