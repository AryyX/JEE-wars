package majeur.ihm;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import majeur.bll.VoteManagerImpl;
import majeur.bo.Votant;

/**
 * Servlet implementation class MajeurServlet
 */
@WebServlet("/MajeurServlet")
public class MajeurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MajeurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		VoteManagerImpl manager = new VoteManagerImpl();
		String message ="";
		
		//Traitement
		if (request.getParameter("BT_VALID") != null) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			LocalDate ddn = LocalDate.parse(request.getParameter("ddn"));
			String nationalite = request.getParameter("nationalite");
			Votant votant = new Votant(nom, prenom, ddn, nationalite);
			boolean res = manager.peuxVoter(votant);
			
			if(res)
				message = "tu peux voter";
			else
				message= "tu peux pas";
			
		}
		
		
		
		
		
//			response.getWriter().print("<h1>"+res+"</H1>");
		request.setAttribute("resultat", message);
	
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
