package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();

		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		// 클라이언트가 웹 서버에 서비스를 요청할 때 사용한 프로토콜 이름 반환
		out.print("Request Scheme: " + req.getScheme() + "<br/>");
		// 클라이언트로부터 서비스를 요청받아 처리하는 서버의 호스트 이름 반환
		// 별도의 호스트 이름이 없을 때는 IP 주소 반환
		out.print("Server Name: " + req.getServerName() + "<br/>");
		// 클라이언트의 서비스를 요청받아 처리하는 서버의 IP 주소 반환
		out.print("Server Address: " + req.getLocalAddr() + "<br/>");
		// 클라이언트의 서비스를 요청받아 처리하는 서버의 포트 번호 반환
		out.print("Server Port: " + req.getServerPort() + "<br/>");
		out.print("Client Address: " + req.getRemoteAddr() + "<br/>");
		out.print("Client Address: " + req.getRemoteHost() + "<br/>");
		out.print("Client Port: " + req.getRemotePort() + "<br/>");
		out.print("</body></html>");
		out.close();
		
	}
	
	
	
}
