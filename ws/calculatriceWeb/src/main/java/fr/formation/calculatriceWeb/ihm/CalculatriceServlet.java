package fr.formation.calculatriceWeb.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatriceServlet
 */
@WebServlet("/CalculatriceServlet")
public class CalculatriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatriceServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("BT_CALC") != null) {
			Integer a = Integer.parseInt(request.getParameter("a"));
			Integer b = Integer.parseInt(request.getParameter("b"));
			String op = request.getParameter("op");

			Integer res = 0;
			switch (op) {
			case "plus":
				res = a + b;
				break;
			case "moins":
				res =  a - b;
				break;
			case "fois":
				res =  a * b;
				break;
			case "div":
				res = a / b;
				break;

			default:
				break;
			}
			
//			response.getWriter().print("<h1>"+res+"</H1>");
			request.setAttribute("resultat", res);
		}
		request.getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
