package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/addAlien")
public class filterex1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("aname");
		out.print("Welcome" +name +id);
	}

}
