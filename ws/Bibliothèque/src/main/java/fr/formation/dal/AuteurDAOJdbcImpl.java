package fr.formation.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.formation.bo.Auteur;
import fr.formation.dal.tools.ConnectionFactory;
import fr.formation.dal.tools.JdbcTools;

public class AuteurDAOJdbcImpl implements AuteurDAO {
	private final String SELECT = "SELECT nom, prenom FROM Auteur";
	private final String SELECTBYID = "SELECT idAuteur, nom, prenom FROM Auteur WHERE idAuteur = ?";

	@Override
	public List<Auteur> selectAll() throws DALException {
		List<Auteur> lstAuteurs = new ArrayList<>();
		try(Connection con = JdbcTools.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Auteur auteur = new Auteur();
				auteur.setNom(rs.getString("nom").trim());
				auteur.setPrenom(rs.getString("prenom").trim());
				lstAuteurs.add(auteur);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DALException("problème dans le select");
		}
		return lstAuteurs;
	}

	@Override
	public Auteur getById(Integer idAuteur) {
		Auteur auteur = new Auteur();
		try(Connection con = ConnectionFactory.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECTBYID);
			stmt.setInt(1, idAuteur);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				auteur.setIdAuteur(rs.getInt("idAuteur"));
				auteur.setNom(rs.getString("nom").trim());
				auteur.setPrenom(rs.getString("prenom").trim());

			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return auteur;
	}

}
