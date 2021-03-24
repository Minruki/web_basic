package chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/registerServlet3")
public class RegisterServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");	
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		String file = request.getParameter("file");
		String userColor = request.getParameter("userColor");
		
		String classGubun = request.getParameter("class");
		
		String cls = null;
		switch(classGubun) {
			case "archi" : cls = "건축공학과"; break;
			case "mechanic" : cls = "기계공학과"; break;
			case "indust" : cls = "산업공학과"; break;
			case "elec" : cls = "전기전자공학과"; break;
			case "computer" : cls = "컴퓨터공학과"; break;
			case "chemical" : cls = "화학공학과"; break;
		}
		
		String subj = request.getParameter("subj");
		String intro = request.getParameter("intro");
		String subs = intro.replace("\r\n", "<br>");
		
		
		PrintWriter out = response.getWriter();
		out.printf("<html>가입정보2<br>");
		out.printf("id %s<br>name %s<br>", id, name);
		out.printf("file %s<br>", file);
		out.printf("userColor %s<br>", userColor);
		out.printf("학과 %s %s<br>", classGubun, cls);
		out.printf("수강과목 %s <br>", subj);
		out.printf("하고 싶은 말 %s <br>", subs);
		out.printf("</html>");
		
	}
}
