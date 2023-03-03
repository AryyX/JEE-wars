package calculatrice.ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculatrice.bll.CalculatriceManagerImpl;
import calculatrice.bo.Calculatrice;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CalculatriceManagerImpl manager = new CalculatriceManagerImpl();
		int res = 0;
		List<String> histo = manager.historic(null);

		if (request.getParameter("BT_CALC") != null) {
			Integer a = Integer.parseInt(request.getParameter("a"));
			Integer b = Integer.parseInt(request.getParameter("b"));
			String op = request.getParameter("op");
			Calculatrice calculatrice = new Calculatrice(a,b,op);
			res = manager.calcul(calculatrice);
			
		}
		request.setAttribute("resultat", res);
		request.setAttribute("historique", histo);
		
		request.getRequestDispatcher("/WEB-INF/affichage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
