package majeur.bo;

import java.time.LocalDate;

public class Votant {
	private String nom;
	private String prenom;
	private LocalDate ddn;
	private String nationalite;
	//private String sexe;
	
	public Votant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Votant(String nom, String prenom, LocalDate ddn, String nationalite/*, String sexe*/) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ddn = ddn;
		this.nationalite = nationalite;
		//this.sexe = sexe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	/*public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}*/
	

}
