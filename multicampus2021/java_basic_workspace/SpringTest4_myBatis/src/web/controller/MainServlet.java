package web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.p;
import web.dao.MemberDAO;
import web.vo.MemberVO;


@WebServlet("/main")
public class MainServlet extends HttpServlet {
	MemberDAO dao;
	
	@Override
	public void init() throws ServletException {
		 dao=new MemberDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String sign=request.getParameter("sign");
		if(sign==null) {
			return;
		}else if(sign.equals("listMembers")) {
		
			List<MemberVO> memberList=dao.selectAllMemberList();
		
			request.setAttribute("memberList", memberList);
			RequestDispatcher disp=request.getRequestDispatcher("listMembers.jsp");
			disp.forward(request, response);
			
		}else if(sign.equals("login")) {
			String id=request.getParameter("id1");
			String pw=request.getParameter("pw1");
			MemberVO m=new MemberVO(id, pw);
			String name=dao.login(m);
			
			request.setAttribute("name", name);
			RequestDispatcher disp=request.getRequestDispatcher("login_ok.jsp");
			disp.forward(request, response);
			
		}else if(sign.equals("selectMemberById")) {
			String id=request.getParameter("id2");
			
			MemberVO m=new MemberVO(id, 0);
			List<MemberVO> memberList=dao.selectMemberById(m);
			
			request.setAttribute("memberList", memberList);
			RequestDispatcher disp=request.getRequestDispatcher("selectId_ok.jsp");
			disp.forward(request, response);
			
		}else if(sign.equals("selectMemberByPw")) {
			String pw=request.getParameter("pw2");
			
			MemberVO m=new MemberVO(pw, 1);
			List<MemberVO> memberList=dao.selectMemberByPw(m);
			
			request.setAttribute("memberList", memberList);
			RequestDispatcher disp=request.getRequestDispatcher("selectPw_ok.jsp");
			disp.forward(request, response);
		}else if(sign.equals("memberInsert")) {
			
			String id=request.getParameter("id3");
			String pw=request.getParameter("pw3");
			String name=request.getParameter("name");
			
			Date date=new Date();
			MemberVO m=new MemberVO(id, pw, name, date);
			
			dao.memberInsert(m);
			
			RequestDispatcher disp=request.getRequestDispatcher("login_ok.jsp");
			disp.forward(request, response);
		}else if(sign.equals("memberUpdate")) {
			
			String id=request.getParameter("id3");
			String pw=request.getParameter("pw3");
			String name=request.getParameter("name");
			
			Date date=new Date();
			MemberVO m=new MemberVO(id, pw, name, date);
			
			dao.memberInsert(m);
			
			RequestDispatcher disp=request.getRequestDispatcher("login_ok.jsp");
			disp.forward(request, response);
		}

	}

}
