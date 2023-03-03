package majeur.bll;

import java.time.LocalDate;
import java.time.Period;

import majeur.bo.Votant;

public class VoteManagerImpl implements VoteManager {

	private final Integer MAJORITE = 18;
	
	@Override
	public boolean peuxVoter(Votant votant) {
		boolean result = true;
		LocalDate now = LocalDate.now();
		int age = Period.between(votant.getDdn(), now).getYears();
		if(age<MAJORITE)
			result = false;
		if(!"FRANCAIS".equals(votant.getNationalite()))
			result = false;
		
		return result;
	}

}
