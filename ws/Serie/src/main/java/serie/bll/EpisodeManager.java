package serie.bll;

import java.util.List;

import serie.bo.Episode;
import serie.bo.Serie;

public interface EpisodeManager {

	public void creeEpisode(int numero, Serie serie, int duree, String resume) throws EpisodeException;
	public List<Episode> listeEpisode();
}
