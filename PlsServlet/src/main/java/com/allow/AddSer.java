package com.allow;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddSer extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("u1"));
		int j=Integer.parseInt(req.getParameter("u2"));
		PrintWriter out= res.getWriter();
		out.println(i+j);
		
	}
}
