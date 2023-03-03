package serie.bll;

public class SerieEpisodeTest {
	
	public static SerieManager serie = SerieEpisodeSing.getInstanceS();
	public static EpisodeManager ep = SerieEpisodeSing.getInstanceE();

	public static void main(String[] args) throws SerieException {
		System.out.println(serie.creeSerie("oui", "ouioui", "ouiouioui", "ui", "netflix"));
		System.out.println(serie.creeSerie("poui", "nono", "ouiouioui", "ui", "netflix"));
		//System.out.println(serie.creeSerie("non", "ouioui", "ouiouioui", "horreur", "netflix"));
		
		serie.listeSerie().forEach(System.out::println);
		
		
	}

}
