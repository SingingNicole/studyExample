package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/context1")
public class ServletContextTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext sc;

	public void inint(ServletConfig config) throws ServletException {
		sc = config.getServletContext();
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		out.print("Context: " + sc);
		out.close();
	}
}
