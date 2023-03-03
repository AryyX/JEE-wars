package fr.formation.brasserie.bll;

import java.util.List;

import fr.formation.brasserie.bo.Biere;
import fr.formation.brasserie.bo.Brasserie;

public interface BrasserieManager {

	//Brasserie
	public String ajoutBrasserie(Brasserie brasserie);
	public void deleteBrasserie(Brasserie brasserie);
	public void updateBrasserie(Brasserie brasserie);
	public List<Brasserie> getHistoryBrasserie();
	
	//Bière
	public String ajoutBiere(Biere biere) throws BrasserieException;
	public void deleteBiere(Biere biere);
	public void updateBiere(Biere biere);
	public List<Biere> getHistoryBiere();
	
	public List<Biere> lstNoire();
}
