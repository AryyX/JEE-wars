package fr.formation.pays.bll;

import java.util.List;

import fr.formation.pays.bo.Pays;
import fr.formation.pays.dal.DALException;
import fr.formation.pays.dal.DAOFact;
import fr.formation.pays.dal.PaysDAO;

public class PaysManagerImpl implements PaysManager {
	
	PaysDAO dao = DAOFact.getPaysDAO();

	
	@Override
	public List<Pays> random() {
		// TODO Auto-generated method stub
		return dao.random();
	}

	@Override
	public List<Pays> getAll() throws DALException {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
