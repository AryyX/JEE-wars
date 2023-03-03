package fr.formation.verifAge.ihm;

import java.io.IOException;
import java.time.Year;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifAgeServlet
 */
@WebServlet("/VerifAgeServlet")
public class VerifAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VerifAgeServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("BT_CALC") != null) {
			Integer age = Integer.parseInt(request.getParameter("a"));
			Integer date = Year.now().getValue();

			Integer res = date - age;
			
			String resTxt ="";
			
			if(res<18) {
				resTxt = "Vous êtes mineur";
			}else {
				resTxt = "Vous êtes majeur";
			}
			
			
			
//			response.getWriter().print("<h1>"+res+"</H1>");
			request.setAttribute("resultat", resTxt);
		}
		request.getRequestDispatcher("/WEB-INF/affichage.jsp").forward(request, response);

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
