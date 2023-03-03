package fr.formation.dal;

import java.util.List;

public interface DAO<E> {
	public List<E> selectAll() throws DALException;

}
