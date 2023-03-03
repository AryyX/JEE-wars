package fr.formation.bo;

public class Auteur {
	private int idAuteur;
	private String nom;
	private String prenom;
	
	public Auteur() {
		super();
	}
	
	public Auteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int i) {
		this.idAuteur = i;
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

	@Override
	public String toString() {
		return "Auteur [idAuteur=" + idAuteur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	

}
