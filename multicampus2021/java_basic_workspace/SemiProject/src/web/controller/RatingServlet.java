package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.model.MemberDAO;
import web.model.SongDAO;
import web.util.MyException;
import web.vo.MemberVO;
import web.vo.SongVO;

/**
 * Servlet implementation class RatingServlet
 */
@WebServlet("/rate")
public class RatingServlet extends HttpServlet {

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
			String rate=sDao.getRate(new SongVO("너랑 나", 1));
			RequestDispatcher disp=request.getRequestDispatcher("image1.jsp");
			request.setAttribute("rate", rate);
			disp.forward(request, response);
			
		} catch(MyException e) {
			RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
			disp.forward(request, response);
		}
	}
}
