package web_basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/registerServlet2")
public class RegisterServlet2 extends HttpServlet {
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
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String homepage = request.getParameter("homepage");
		
		String member = request.getParameter("member");
		String stuffs = request.getParameter("stuffs");
		int satis = Integer.parseInt(request.getParameter("satis"));
		
		String subject = request.getParameter("subject");
		String[] mailing = request.getParameterValues("mailing");
				
		System.out.println(satis);
		PrintWriter out = response.getWriter();
		out.printf("<html>가입정보<br>");
		out.printf("id %s<br>password %s<br>", id, (pwd1.equals(pwd2)?"일치":"불일치"));
		out.printf("name %s<br>", name);
		out.printf("email %s<br>", email);
		out.printf("phone %s<br>", phone);
		out.printf("homepage %s<br>", homepage);
		
		out.printf("member %s 명<br>", member);
		out.printf("stuffs %s 개<br>", stuffs);
		out.printf("satis %s <br>", satis==1?"하":(satis==2?"중":"상"));
		
		String t = null;
		if (subject.equals("eng")) {
			t = "회화";
		}else if (subject.equals("ch")) {
			t = "문법";
		}else {
			t = "작문";
		}
		out.printf("subject %s<br>", t);
		
		if (mailing == null) {
			out.println("선택한 수강분야가 없음");
		} else {
			for(String gubun : mailing) {
				if (gubun.equals("news")) {
					out.printf("메일링  = %s<br>", "해외 단신");
				}
				if (gubun.equals("dialog")) {
					out.printf("메일링  = %s<br>", "5분 회화");
				}
				if (gubun.equals("pops")) {
					out.printf("메일링  = %s<br>", "모닝 팝스");
				}
			}
		}
		out.printf("</html>");

	}
}
