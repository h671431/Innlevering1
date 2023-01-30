package no.hvl.data102;

public class Film {

	int filmnr;
	String produsent;
	String tittel;
	int aar;
	Sjanger sjanger;
	String filmselskap;

	public Film(int filmnr, String produsent, String tittel, Sjanger sjanger, int aar, String filmselskap) {
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.sjanger = sjanger;
		this.aar = aar;
		this.filmselskap = filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

// Overkjøring av equals-metoden
	@Override
	public boolean equals(Object andre) {
		if (andre == null) {
			return false;
		}
		if (this == andre) {
			return true;
		}
		if (getClass() != andre.getClass()) {
			return false;
		}
		Film denAndre = (Film) andre;
		boolean like = this.filmnr == denAndre.getFilmnr();
		return like;
	}

	@Override
	public int hashCode() {
		Integer tempnr = filmnr;
		return tempnr.hashCode();
	}
}

