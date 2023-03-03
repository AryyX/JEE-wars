package fr.formation.brasserie.bll;

import java.util.ArrayList;
import java.util.List;

import fr.formation.brasserie.bo.Biere;
import fr.formation.brasserie.bo.Brasserie;

public class BrasserieManagerImpl implements BrasserieManager {
	private List<Brasserie> lstBrasserie= new ArrayList<>();
	private List<Biere> lstBiere= new ArrayList<>();
	private List<Biere> lstNoire= new ArrayList<>();
	

	@Override
	public String ajoutBrasserie(Brasserie brasserie) {
		lstBrasserie.add(brasserie);
		return "Brasserie bien ajoutée";
	}

	@Override
	public void deleteBrasserie(Brasserie brasserie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBrasserie(Brasserie brasserie) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Brasserie> getHistoryBrasserie() {
		// TODO Auto-generated method stub
		return lstBrasserie;
	}

	@Override
	public String ajoutBiere(Biere biere) throws BrasserieException {
		/*int total = getHistoryBiere().size() +1;
		int Btype = (int) getHistoryBiere().stream().filter(b -> b.getType().equals(biere.getType())).count() +1;*/
		
		
		if(!lstNoire().contains(biere)) {
			if(!getHistoryBiere().contains(biere)) {
				//if(Btype < (total / 2 )) {
					lstBiere.add(biere);
					/*System.out.println(total);
					System.out.println(Btype);*/
					return "Bière bien ajoutée";
				/*}
				throw new BrasserieException("Il existe trop de bières de ce type");*/
			}
			throw new BrasserieException("La bière existe déjà");
		}
		
		throw new BrasserieException("La bière est dans la liste noire");
	}

	@Override
	public void deleteBiere(Biere biere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBiere(Biere biere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Biere> getHistoryBiere() {
		return lstBiere;
	}

	public void setLstNoire(List<Biere> lstNoire) {
		this.lstNoire = lstNoire;
	}

	@Override
	public List<Biere> lstNoire() {
		// TODO Auto-generated method stub
		return lstNoire;
	}

}
