package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.model.SongDAO;
import web.util.MyException;

@WebServlet("/song")
public class SongListServlet extends HttpServlet {

	SongDAO sDao;
	HttpSession session;
	
	@Override
	public void init() throws ServletException {		
		super.init();
		try {
			sDao=new SongDAO();
		} catch (MyException e) {			
			System.out.println(e.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			
			List<String> list=sDao.rateList();
			RequestDispatcher disp=request.getRequestDispatcher("index.jsp");		
			request.setAttribute("list", list);
			disp.forward(request, response);
			
		} catch(MyException e) {
			RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
			disp.forward(request, response);
		}
	}
}
