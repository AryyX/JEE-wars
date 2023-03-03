package calculatrice.bll;

import java.util.List;

import calculatrice.bo.Calculatrice;

public interface CalculatriceManager {
	
	/**
	 * permet de réaliser une opération
	 * @param calculatrice 
	 * @return le résultat de l'opération
	 */
	
	public int calcul(Calculatrice calculatrice);
	//public List<String> historic();
	public List<String> historic(List<String> histo);
	
}
