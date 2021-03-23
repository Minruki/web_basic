package web_basic.jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_03/login") //http://localhost:8080/프로젝트/jsp_03/login?id=1111
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		System.out.println("id : " + id + " passwd : " + passwd);
		
		//한글 깨짐 처리
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.printf("아이디 = %s <br> 비밀번호 = %s", id, passwd);
	}

}
