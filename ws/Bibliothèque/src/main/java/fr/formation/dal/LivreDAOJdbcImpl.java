package fr.formation.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.formation.bo.Auteur;
import fr.formation.bo.Livre;
import fr.formation.dal.tools.JdbcTools;

public class LivreDAOJdbcImpl implements LivreDAO {
	private final String SELECT = "SELECT idLivre, titre, resume, auteur FROM Livre";
	
	private AuteurDAO auteurDAO = DAOFact.getAuteurDAO();
	
	@Override
	public List<Livre> selectAll() throws DALException {
		List<Livre> lstLivres = new ArrayList<>();
		try(Connection con = JdbcTools.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Livre livre = new Livre();
				livre.setTitre(rs.getString("titre").trim());
				livre.setResume(rs.getString("resume").trim());
				Integer idAuteur = rs.getInt("auteur");
				if(idAuteur!=null) {
					Auteur auteur = auteurDAO.getById(idAuteur);
					livre.setAuteur(auteur);
				}
				lstLivres.add(livre);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DALException("problème dans le select");
		}
		return lstLivres;
	}

}
