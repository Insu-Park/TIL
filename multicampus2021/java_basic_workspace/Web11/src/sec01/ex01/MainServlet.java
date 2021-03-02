package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		String sign=request.getParameter("sign");
		if(sign==null) {
			return;
		} else if(sign.equals("login")) {
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			PrintWriter out=response.getWriter();
			out.write(id+":"+pw);
		} else if(sign.equals("memberInsert")) {
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("name");
			
			String [] all_subject=request.getParameterValues("subject");
			PrintWriter out=response.getWriter();
			out.write(id+":"+pw+":"+name+"<br>");
			for(String s:all_subject) {
				out.write(s+" &nbsp; ");
			}

		}
	}
}
