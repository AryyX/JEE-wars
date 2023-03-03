package fr.formation.voiture.bll;


public class VoitureManagerSing {
	private static VoitureManager instance;

	public static VoitureManager getInstance() {
		if (instance == null) {
			instance = new VoitureManagerImpl();
		}
		return instance;
	}

}
