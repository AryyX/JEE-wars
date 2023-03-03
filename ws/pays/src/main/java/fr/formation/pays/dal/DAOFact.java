package fr.formation.pays.dal;


public class DAOFact {
	public static PaysDAO getPaysDAO() {
		return new PaysDAOImpl();
	}

}
