

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eat
 */
@WebServlet("/Eat")
public class Eat extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int food = Integer.parseInt(request.getParameter("food"));
		String mes = "";
		switch(food){
		case 1:
			mes += "やっぱ寿司ですよね!";
			break;
		case 2:
			mes += "バリエーション豊富だし、ラーメン最高!";
			break;
		case 3:
			mes += "やっぱ肉ですよね!";
			break;
		default:
			mes += "選択肢なし";
		}


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>food</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + mes +"</p>");
		out.println("<a href='form7.jsp'>戻る</a>");
		out.println("</body>");
	}

}
