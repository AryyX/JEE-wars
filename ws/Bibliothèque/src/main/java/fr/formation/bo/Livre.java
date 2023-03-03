package fr.formation.bo;

public class Livre {
	private Long idLivre;
	private String titre;
	private String resume;
	private Auteur auteur;
	
	public Livre() {
		super();
	}

	public Livre(String titre, String resume, Auteur auteur) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.auteur = auteur;
	}

	public Long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String type) {
		this.titre = type;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titre=" + titre + ", resume=" + resume + ", auteur=" + auteur + "]";
	}
	
	
	

}
