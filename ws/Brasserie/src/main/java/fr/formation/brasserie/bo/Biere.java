package fr.formation.brasserie.bo;

import java.sql.Date;

public class Biere {

	private int id;
	private String nom;
	private Brasserie brasserie;
	private String type;
	private int note;
	private String date;
	public Biere(int id, String nom, Brasserie brasserie, String type, int note, String date) {
		super();
		this.id = id;
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.note = note;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Brasserie getBrasserie() {
		return brasserie;
	}
	public void setBrasserie(Brasserie brasserie) {
		this.brasserie = brasserie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Biere [id=" + id + ", nom=" + nom + ", brasserie=" + brasserie + ", type=" + type + ", note=" + note
				+ ", date=" + date + "]";
	}
	
	
	
}
