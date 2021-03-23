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


@WebServlet("/main")
public class MainServlet extends HttpServlet {

	MemberDAO mDao;
	SongDAO sDao;
	HttpSession session;
	
	@Override
	public void init() throws ServletException {		
		super.init();
		try {
			mDao=new MemberDAO();
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
			String key=request.getParameter("key");
			
			String id="", pw="";
			if(key==null) {
				throw new MyException("요청을 구별할 수 없습니다.");
			}else if(key.equalsIgnoreCase("login")) {
				id=request.getParameter("id");
				pw=request.getParameter("pw");
				String name=mDao.login(id,pw);
				
				if(name!=null) {
					RequestDispatcher disp=request.getRequestDispatcher("song");
					session=request.getSession();
					request.setAttribute("name", name);
					session.setAttribute("id", id);
					session.setAttribute("pw", pw);
					session.setAttribute("name", name);
					
					disp.forward(request, response);
				}else {
					RequestDispatcher disp=request.getRequestDispatcher("login_fail.jsp");
					disp.forward(request, response);	
				}
			}else if(key.equalsIgnoreCase("join")) {
				id=request.getParameter("id");
				pw=request.getParameter("pw");
				String name=request.getParameter("name");
				String nick=request.getParameter("nick");
				String email=request.getParameter("email");
				
				MemberVO m=new MemberVO(id, pw, name, nick, email);
				System.out.println(m.getName()+":"+m.getNick());
				mDao.memberInsert(m);
				RequestDispatcher disp=request.getRequestDispatcher("join_ok.jsp");
				request.setAttribute("name", name);
				disp.forward(request, response);
			}else if(key.equalsIgnoreCase("ratesong")) {
				double rate=Double.parseDouble(request.getParameter("rating"));
				id=(String)session.getAttribute("id");
				pw=(String)session.getAttribute("pw");
				
				MemberVO m=new MemberVO(id, pw);
				SongVO s=new SongVO("너랑 나", 1, rate);
				String msg=sDao.rateInsert(m, s);
				request.setAttribute("msg", msg);
				System.out.println(msg);
				RequestDispatcher disp=request.getRequestDispatcher("rate");
				disp.forward(request, response);
			}
			
			
		} catch(MyException e) {
			RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
			disp.forward(request, response);
		}
	}
}
