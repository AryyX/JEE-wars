package serie.bll;

public class SerieEpisodeSing {
	private static SerieManager instanceS;
	private static EpisodeManager instanceE;
	
	
	public static SerieManager getInstanceS() {
		if(instanceS==null) {
			instanceS = new SerieManagerImpl();
		}
		return instanceS;
	}
	
	public static EpisodeManager getInstanceE() {
		if(instanceE==null) {
			instanceE = new EpisodeManagerImpl();
		}
		return instanceE;
	}

}
