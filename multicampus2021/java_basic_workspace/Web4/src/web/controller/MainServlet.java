package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {       
  
    public MainServlet() {
        System.out.println("MainServlet 객체 생성");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출됨");
	}

	
	public void destroy() {
		System.out.println("destroy() 호출됨");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 호출됨");
		super.service(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출됨");
		login(request,response);
	}


	protected void doPost(HttpServletRequest r, HttpServletResponse re) throws ServletException, IOException {
		System.out.println("doPost() 호출됨");
		login(r,re);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		RequestDispatcher rd=request.getRequestDispatcher("login_ok.jsp");
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		rd.forward(request, response);
	}

}