package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//@WebServlet("/sq")
public class Squareserv extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

//		Object k= req.getAttribute("k");
//		String l=k.toString();
//		int s=Integer.parseInt(l);
//		s=s*s;
	//	int k=Integer.parseInt(req.getParameter("k"));
		
		///////getting values using session
//		HttpSession sess=req.getSession();
//		Object k= sess.getAttribute("k");
//		String k1=k.toString();
//		int l=Integer.parseInt(k1);
//		PrintWriter out=res.getWriter();
//		out.println("Sq called "+l*l);
	//	out.println("Result of square "+s);
		int k=0;
		Cookie coo[]=req.getCookies();
		for(Cookie c:coo) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println(k);
		}
}
