package fr.formation.voiture.bo;

public class Voiture {
	private Long id;
	private String marque;
	private String modele;
	private String nom;
	private int prix;
	
	
	
	public Voiture() {
		super();
	}

	public Voiture(String marque, String modele, String nom, int prix) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.nom = nom;
		this.prix = prix;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", modele=" + modele + ", nom=" + nom + ", prix=" + prix
				+ "]";
	}
	
	
	
	
	
	

}
