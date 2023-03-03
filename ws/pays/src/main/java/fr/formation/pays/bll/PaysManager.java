package fr.formation.pays.bll;

import java.util.List;

import fr.formation.pays.bo.Pays;
import fr.formation.pays.dal.DALException;

public interface PaysManager {
	public List<Pays> random ();
	public List<Pays> getAll () throws DALException;

}
