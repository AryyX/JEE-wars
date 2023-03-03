package fr.formation.pays.bll;

public class PaysManagerSing {
	private static PaysManager instance;

	public static PaysManager getInstance() {
		if (instance == null) {
			instance = new PaysManagerImpl();
		}
		return instance;
	}

}
