package fr.formation.etudiant.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.formation.etudiant.bo.Etudiant;

public class EtudiantManagerImpl implements EtudiantManager{
	private List<Etudiant> lstEtudiant = new ArrayList<>();
	private static Long cptID = 0L;

	@Override
	public Etudiant add(Etudiant etudiant) {
		etudiant.setIdEtudiant(cptID++);
		lstEtudiant.add(etudiant);
		return etudiant;
	}

	@Override
	public List<Etudiant> list() {
		// TODO Auto-generated method stub
		return lstEtudiant;
	}

	@Override
	public int moyenne(int note) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String meilleur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant listRattrapage() {
		return lstEtudiant.stream()
				.filter(b->b.getNote()< 10)
				.collect(Collectors.toList()).get(0);
	}

}
