package fr.formation.brasserie.bo;

public class Brasserie {

	
	private int id;
	private int cp;
	private String region;
	private String adresse;
	private String nom;
	public Brasserie(int id, int cp, String nom, String region, String adresse) {
		super();
		this.id = id;
		this.cp = cp;
		this.region = region;
		this.adresse = adresse;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Brasserie [id=" + id + ", cp=" + cp + ", region=" + region + ", adresse=" + adresse + ", nom=" + nom
				+ "]";
	}
	
	
	
	
	
}
