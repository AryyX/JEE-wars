package serie.bo;

public class Serie {
	private String nom;
	private String auteur;
	private String resume;
	private String type;
	private String plateforme;
	
	public Serie(String nom, String auteur, String resume, String type, String plateforme) {
		super();
		this.nom = nom;
		this.auteur = auteur;
		this.resume = resume;
		this.type = type;
		this.plateforme = plateforme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlateforme() {
		return plateforme;
	}

	public void setPlateforme(String plateforme) {
		this.plateforme = plateforme;
	}

	@Override
	public String toString() {
		return "Serie [nom=" + nom + ", auteur=" + auteur + ", resume=" + resume + ", type=" + type + ", plateforme="
				+ plateforme + "]";
	}
	
	

}
