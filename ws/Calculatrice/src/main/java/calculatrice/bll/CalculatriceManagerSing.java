package calculatrice.bll;

public class CalculatriceManagerSing {
	private static CalculatriceManager instance;
	public static CalculatriceManager getInstance() {
		if(instance==null) {
			instance = new CalculatriceManagerImpl();
		}
		return instance;
	}

}
