package web_basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String subject = request.getParameter("subject");
		String[] gubuns = request.getParameterValues("gubun");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.printf("아이디 %s<br>비밀번호 %s<br>", id, pw);
		out.println("<h2>수강과목</h2>");
		String t = null;
		if (subject.equals("eng")) {
			t = "영어";
		} else if (subject.equals("ch")) {
			t = "중국어회화";
		} else {
			t = "일어회화";
		}
		out.printf("subject  = " + t + "<br>");

		out.println("<h2>수강분야</h2>");
		if (gubuns == null) {
			out.println("선택한 수강 분야가 없음");

		} else {
			for (String gubun : gubuns) {
				if (gubun.equals("grm")) {
					out.printf("분야  = %s<br>", "문법");
				}
				if (gubun.equals("wr")) {
					out.printf("분야  = %s<br>", "작문");
				}
				if (gubun.equals("rd")) {
					out.printf("분야  = %s<br>", "독해");
				}
			}
			out.println("</html>");

		}
	}
}
