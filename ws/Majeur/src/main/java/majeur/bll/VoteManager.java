package majeur.bll;

import majeur.bo.Votant;

public interface VoteManager {
	/**
	 * permet de  savoir si une personne peut voter
	 * 
	 * CT001 : peut voter si majeur
	 * CT002 : peut voter si français
	 * 
	 * @param votant potentiel
	 * @return vrai s'il peut, faux sinon
	 */
	public boolean peuxVoter(Votant votant);
}
