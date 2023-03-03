package calculatrice.bll;

import calculatrice.bo.Calculatrice;

public class CalculatriceManagerTest {
	
	private static CalculatriceManager manager = CalculatriceManagerSing.getInstance();

	public static void main(String[] args) {
		System.out.println(manager.calcul(new Calculatrice(10,5,"addition")));
		System.out.println(manager.calcul(new Calculatrice(10,5,"multiplication")));
		System.out.println(manager.calcul(new Calculatrice(10,5,"soustraction")));
		System.out.println(manager.calcul(new Calculatrice(10,5,"division")));

	}

}
