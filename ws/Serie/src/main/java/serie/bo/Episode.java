package serie.bo;

public class Episode {
	private int numero;
	private Serie serie;
	private int duree;
	private String resume;
	
	

	public Episode(int numero, Serie serie, int duree, String resume) {
		super();
		this.numero = numero;
		this.serie = serie;
		this.duree = duree;
		this.resume = resume;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}
