package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardSampleServlet")
public class ForwardSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fortune = "大吉";
		request.setAttribute("ft", fortune);
		String sunny = "晴れ";
		request.setAttribute("wether",sunny);
		int comfortIndex = 85;
		request.setAttribute("ci", comfortIndex);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/forwardSample.jsp");
		rd.forward(request,response);
	}



}
