package fr.formation.dal;

import fr.formation.bo.Auteur;

public interface AuteurDAO extends DAO<Auteur>{

	public Auteur getById(Integer idAuteur);

}
