package fr.formation.pays.dal;

import java.util.List;

import fr.formation.pays.bo.Pays;

public interface PaysDAO {
	List<Pays> getAll() throws DALException;
	List<Pays> random();

}
