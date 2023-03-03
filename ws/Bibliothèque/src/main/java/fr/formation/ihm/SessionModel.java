package fr.formation.ihm;

public class SessionModel {
	private String nom;
	private String prenom;

	public SessionModel() {
	}

	public SessionModel(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAge() {
		return prenom;
	}

	public void setAge(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "LoginModel [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
