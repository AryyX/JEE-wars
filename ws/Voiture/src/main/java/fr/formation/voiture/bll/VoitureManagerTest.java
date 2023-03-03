package fr.formation.voiture.bll;

import fr.formation.voiture.bo.Voiture;

public class VoitureManagerTest {
	static VoitureManager manager = VoitureManagerSing.getInstance(); 

	public static void main(String[] args) throws VoitureManagerException {
		Voiture audi = new Voiture("Audi","A5","oui", 5000);
		Voiture audi2 = new Voiture("Audi","A7","oui2", 15000);
		
		manager.add(audi);
		manager.add(audi2);
		
		manager.getAll().forEach(System.out::println);
		
		//manager.delete(audi2);
		
		manager.getAll().forEach(System.out::println);
		
		
		Voiture audi3 = new Voiture("Audi","A5","oui", 5000);
		try {
			//manager.delete(audi2);
			manager.add(audi3);
		} catch (VoitureManagerException e) {
			System.out.println("erreur : "+e.getMessage());
		}

	}

}
