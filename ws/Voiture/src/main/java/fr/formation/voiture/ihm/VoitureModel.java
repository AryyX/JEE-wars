package fr.formation.voiture.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.formation.voiture.bo.Voiture;

public class VoitureModel {
	private Voiture current;
	private List<Voiture> list= new ArrayList<>();
	private String erreur;
	private Long idModify;
	
	
	public VoitureModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoitureModel(Voiture current, String erreur) {
		super();
		this.current = current;
		this.erreur = erreur;
	}

	public String check() {
		if("".equals(this.current.getNom())) {
			return "Il faut saisir le nom";
		}
		
		return null;
	}

	public Voiture getCurrent() {
		return current;
	}

	public void setCurrent(Voiture current) {
		this.current = current;
	}

	public List<Voiture> getList() {
		return list;
	}

	public void setList(List<Voiture> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "VoitureModel [current=" + current + ", list=" + list + "]";
	}

	public String getErreur() {
		return erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public Long getIdModify() {
		return idModify;
	}

	public void setIdModify(Long idModify) {
		this.idModify = idModify;
	}
	
	

}
