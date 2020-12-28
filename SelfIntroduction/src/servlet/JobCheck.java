package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hero;
import model.Job;

@WebServlet("/JobCheck")
public class JobCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String job = request.getParameter("job");
		int hp = Integer.parseInt(request.getParameter("hp"));
		int mp = Integer.parseInt(request.getParameter("mp"));
		int power = Integer.parseInt(request.getParameter("power"));
		int tech = Integer.parseInt(request.getParameter("tech"));
		int speed = Integer.parseInt(request.getParameter("speed"));
		int[] vals = {hp,mp,power,tech,speed};

		Hero hero = new Hero();
		hero.setName(name);
		hero.setJob(job);
		hero.setVals(vals);

		Job classes = new Job();
		int[] classVal = classes.job(hero);
		hero.setVals(classVal);

		request.setAttribute("hero",hero);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/tribe.jsp");
		rd.forward(request, response);
	}

}
