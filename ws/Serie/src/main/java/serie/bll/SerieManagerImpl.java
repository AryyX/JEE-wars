package serie.bll;

import java.util.ArrayList;
import java.util.List;
import serie.bo.Serie;

public class SerieManagerImpl implements SerieManager {
	
	private List<Serie> listSerie= new ArrayList<>();

	@Override
	public String creeSerie(String nom, String auteur, String resume, String type, String plateforme) throws SerieException{
		if(type.equals("horreur")) {
			throw new SerieException("Le type n'est pas valide");
		}
		for(Serie element : listSerie) {
			if (listSerie.contains(element)){
				throw new SerieException("La série existe déjà");
			}
			else {
				listSerie.add(new Serie(nom, auteur, resume, type, plateforme));
				return "La série a été ajoutée à la liste !";
			}
		}
		return "Ca marche pas";

	}

	@Override
	public List<Serie> listeSerie() {
		return listSerie;
	}

}
