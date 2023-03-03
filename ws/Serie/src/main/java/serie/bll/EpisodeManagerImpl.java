package serie.bll;

import java.util.ArrayList;
import java.util.List;

import serie.bo.Episode;
import serie.bo.Serie;

public class EpisodeManagerImpl implements EpisodeManager {

	private List<Episode> listEpisode= new ArrayList<>();
	
	@Override
	public void creeEpisode(int numero, Serie serie, int duree, String resume) throws EpisodeException{
		if(!listEpisode.contains(numero)) {
			listEpisode.add(new Episode(numero, serie, duree, resume));
		}
		else {
			throw new EpisodeException("L'épisode existe déjà");
		}
		
	}

	@Override
	public List<Episode> listeEpisode() {
		return listEpisode;
	}

	

}
