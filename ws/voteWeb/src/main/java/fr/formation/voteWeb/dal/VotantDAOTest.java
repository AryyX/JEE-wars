package fr.formation.voteWeb.dal;import java.time.LocalDate;

import fr.formation.voteWeb.bo.Votant;

public class VotantDAOTest {
	private static VotantDAO dao = DAOFact.getVotantDAO();

	public static void main(String[] args) throws DALException {
		dao.insert(new Votant("Cérien","Jean",LocalDate.now().minusYears(20),"Française"));
		
		dao.getAll().forEach(System.out::println);
	}
}
