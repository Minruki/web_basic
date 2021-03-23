package web_basic.jsp_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/jsp_03/memReg")
public class MemberRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		if (request.getMethod().equals("GET")) {
//			doGet(request, response);
			out.printf("get method call");
		}else {
//			doPost(request, response);
			out.printf("post method call");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		if (request.getMethod().equalsIgnoreCase("GET")) {
			PrintWriter out = response.getWriter();
			String name=request.getParameter("name");
			out.println("이름  = "+name );
		}else {
			PrintWriter out = response.getWriter();
			String name=request.getParameter("name");
			String addr = request.getParameter("addr");
			String tel = request.getParameter("tel");
			String hobby = request.getParameter("hobby");
			
			out.println("이름  = "+name + "<br>");
			out.println("이름  = "+addr + "<br>");
			out.println("이름  = "+tel + "<br>");
			out.println("이름  = "+hobby + "<br>");
		}
	}

}
