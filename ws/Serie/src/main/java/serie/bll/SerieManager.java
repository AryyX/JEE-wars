package serie.bll;

import java.util.List;

import serie.bo.Serie;

public interface SerieManager {

	public String creeSerie(String nom, String auteur, String resume, String type, String plateforme) throws SerieException;
	public List<Serie> listeSerie();
}
