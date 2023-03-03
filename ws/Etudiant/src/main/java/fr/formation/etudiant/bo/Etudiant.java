package fr.formation.etudiant.bo;

public class Etudiant {
	private Long idEtudiant;
	private String nom;
	private String prenom;
	private int note;
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etudiant(String nom, String prenom, int note) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}


	public Long getIdEtudiant() {
		return idEtudiant;
	}


	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
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


	public int getNote() {
		return note;
	}


	public void setNote(int note) {
		this.note = note;
	}


	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", note=" + note + "]";
	}
	
	

}
