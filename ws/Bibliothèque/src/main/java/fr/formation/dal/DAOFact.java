package fr.formation.dal;

public class DAOFact {
	public static LivreDAO getLivreDAO() {
		return new LivreDAOJdbcImpl();
	}
	public static AuteurDAO getAuteurDAO() {
		return new AuteurDAOJdbcImpl();
	}
}
