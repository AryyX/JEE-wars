package fr.formation.brasserie.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.brasserie.bll.BrasserieManager;
import fr.formation.brasserie.bll.BrasserieSing;
import fr.formation.brasserie.bo.Biere;
import fr.formation.brasserie.bo.Brasserie;

/**
 * Servlet implementation class BrasserieServlet
 */
@WebServlet("/BrasserieServlet")
public class BrasserieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BrasserieManager brasserie = BrasserieSing.getInstance();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrasserieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		BrasserieModel model = new BrasserieModel();
		
		Integer idBr = 0;
		Integer cp = 0;
		String nomBr= "";
		String region= "";
		String adresse= "";
		
		Integer idBi = 0;
		Integer note = 0;
		String nomBi= "";
		Brasserie brass =null;
		String type= "";
		String dateIns= "";
		
		
		if (request.getParameter("idBr") != null) {
			idBr = Integer.parseInt(request.getParameter("idBr"));
			nomBr = request.getParameter("nomBr");
			region = request.getParameter("region");
			cp = Integer.parseInt(request.getParameter("cp"));
			adresse = request.getParameter("adresse");
		}
		
		if (request.getParameter("BT_VALIDBR") != null) {
			brasserie.ajoutBrasserie(new Brasserie(idBr, cp, nomBr, region, adresse));
			
		
		}
		
	/*	if (request.getParameter("idBi") != null) {
			idBi = Integer.parseInt(request.getParameter("idBi"));
			nomBi = request.getParameter("nomBi");
			//brass = Brasserie.class.forName(request.getParameter ("c")) ;
			type = request.getParameter("type");
			note = Integer.parseInt(request.getParameter("note"));
			dateIns = request.getParameter("dateIns");
		}
		
		if (request.getParameter("BT_VALIDBI") != null) {
			//brasserie.ajoutBiere(new Biere(idBi, nomBi, brass, type, note, dateIns));
			
		}*/
		model.setHistoriqueBr(brasserie.getHistoryBrasserie());
		
		model.setHistoriqueBi(brasserie.getHistoryBiere());


		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/brasserie.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
