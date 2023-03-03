package fr.formation.brasserie.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.formation.brasserie.bo.Biere;
import fr.formation.brasserie.bo.Brasserie;

public class BrasserieModel {
	
	private String message ="";
	private List<Brasserie> historiqueBr= new ArrayList<>();
	private List<Biere> historiqueBi= new ArrayList<>();
	
	public BrasserieModel() {
		super();
	}
	
	public BrasserieModel(String message, List<Brasserie> historiqueBr, List<Biere> historiqueBi) {
		super();
		this.message = message;
		this.historiqueBr = historiqueBr;
		this.historiqueBi = historiqueBi;
	}


	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<Brasserie> getHistoriqueBr() {
		return historiqueBr;
	}
	
	public void setHistoriqueBr(List<Brasserie> historiqueBr) {
		this.historiqueBr = historiqueBr;
	}

	public List<Biere> getHistoriqueBi() {
		return historiqueBi;
	}

	public void setHistoriqueBi(List<Biere> historiqueBi) {
		this.historiqueBi = historiqueBi;
	}

	@Override
	public String toString() {
		return "BrasserieModel [message=" + message + ", historiqueBr=" + historiqueBr + ", historiqueBi="
				+ historiqueBi + "]";
	}
	
	
	
	
	
}
