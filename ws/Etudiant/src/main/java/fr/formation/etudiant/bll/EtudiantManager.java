package fr.formation.etudiant.bll;

import java.util.List;

import fr.formation.etudiant.bo.Etudiant;

public interface EtudiantManager {
	public Etudiant add(Etudiant etudiant);
	public List<Etudiant> list();
	public int moyenne(int note);
	public String meilleur();
	public String pire();
	public Etudiant listRattrapage();
	

}
