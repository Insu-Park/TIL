package web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import web.dao.MemberDAO;
import web.util.MyException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	MemberDAO mdao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);		
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resJson=new JSONObject();
		
		request.setCharacterEncoding("utf-8");
		BufferedReader br=request.getReader();
		JSONObject jsonObject=(JSONObject)JSONValue.parse(br);
		
		String sign=(String) jsonObject.get("sign");
		
		if(sign==null) {
			return ;			
		}else if(sign.equals("login")) {			
			String id=(String) jsonObject.get("id");
			String pw=(String) jsonObject.get("pw");
			
			try {
				String name=mdao.login(id,pw);
				resJson.put("name",  name);
			} catch(MyException e) {
				resJson.put("msg",  e.getMessage());
				
			}
		}
		out.append(resJson.toJSONString());
	}
}
