package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ap = this.getServletContext();
		SiteEV siteEV = (SiteEV)ap.getAttribute("siteEV");

		if(siteEV == null) {
			siteEV = new SiteEV();
		}
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");

		SiteEVLogic logic = new SiteEVLogic();
		if(action != null && action.equals("like")) {
			logic.like(siteEV);
		}else if(action != null && action.equals("dislike")) {
			logic.dislike(siteEV);
		}

		ap.setAttribute("siteEV", siteEV);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/minatoIndex.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
