package fr.formation.pays.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.formation.pays.bo.Pays;
import fr.formation.pays.dal.tools.ConnectionFactory;

public class PaysDAOImpl implements PaysDAO{
	private final String SELECT = "SELECT id, nom_fr_fr FROM pays";

	@Override
	public List<Pays> getAll() throws DALException {
		List<Pays> lstPays = new ArrayList<>();
		try(Connection con = ConnectionFactory.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Pays pays = new Pays();
				pays.setId(rs.getInt("id"));
				pays.setNom(rs.getString("nom_fr_fr").trim());

				lstPays.add(pays);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
			throw new DALException("problème dans le select");
		}
		return lstPays;
	}

	@Override
	public List<Pays> random() {
		// TODO Auto-generated method stub
		return null;//getAll().stream().filter(null);
	}

}
