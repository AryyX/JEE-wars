package age.ihm;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgeServlet
 */
@WebServlet("/AgeServlet")
public class AgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("BT_CALC") != null) {
			LocalDate age = LocalDate.parse(request.getParameter("a"));

			LocalDate localDate = LocalDate.now();
			System.out.println(localDate);
			
			Integer res = Period.between(age, localDate).getYears();
			System.out.println(res);
			System.out.println(age.getDayOfMonth());
			System.out.println(age.getMonthValue());
			System.out.println(Period.between(age, localDate).getDays());
			System.out.println(Period.between(age, localDate).getMonths());
			String resTxt ="";
			
			if(res<18) {
				resTxt = "Vous êtes mineur";
			}else if (res == 18) {
				if((localDate.getDayOfMonth()< age.getDayOfMonth()) && (Period.between(age, localDate).getMonths()< age.getMonthValue())) {
					resTxt = "Vous êtes mineur";
				}else {
					resTxt = "Vous êtes majeur";
				}
			}else {
				resTxt = "Vous êtes majeur";
			}
			
			
			
//			response.getWriter().print("<h1>"+res+"</H1>");
			request.setAttribute("resultat", resTxt);
		}
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
