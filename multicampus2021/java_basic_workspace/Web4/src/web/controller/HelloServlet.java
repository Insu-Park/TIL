package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class HelloServlet extends HttpServlet {
	
	@Override
	public void destroy() {
		System.out.println("deGet() 호출됨");
		super.destroy();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doGet() 호출됨");
		login(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doPost() 호출됨");
		login(request, response);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.append("id="+id+" pw="+pw);
		out.close();

	}

}
