package majeur.bll;

import java.time.LocalDate;

import majeur.bo.Votant;

public class VoteManagerTest {

	private static VoteManager manager = VoteManagerSing.getInstance();
	
	public static void main(String[] args) {
		System.out.println(manager.peuxVoter(new Votant("Cérien", "Jean", LocalDate.now().minusYears(20), "FRANCAIS")));
		System.out.println(manager.peuxVoter(new Votant("Airienafaire", "Jean", LocalDate.now().minusYears(16), "FRANCAIS")));
		System.out.println(manager.peuxVoter(new Votant("Terrieur", "Alain", LocalDate.now().minusYears(20), "ESPAGNOL")));
		
		
	}

}
