package fr.formation.pays.bo;

public class Pays {
	private Integer id;
	private String nom;
	public Pays() {
		super();
	}
	public Pays(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + "]";
	}
	

}
