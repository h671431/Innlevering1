package no.hvl.dato102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}

	public void start(){ 
		 // Legger inn fillmer
		 
		// Lag testdata med å opprette objekter:
		//public Film(int filmnr, String produsent, String tittel, Sjanger sjanger, int aar, String filmselskap) {
		 Film film1 = new Film(1, "Amy Poller", "Mean Girls", Sjanger.DRAMA, 2004, "Universal");
		 Film film2 = new Film(2, "Walt Disney", "Frozen", Sjanger.ACTION, 2013, "Disney");
		 Film film3 = new Film(3, "James Cameron", "Titanic", Sjanger.DRAMA, 1997, "Paramount Pictures");
		 Film film4 = new Film(4, "Walt Disney", "Beauty and the beast", Sjanger.DRAMA, "Disney");
		 
		 
		 String[] filmtittel = {
				 "Mean girla", 
				 "Leagally blond",
				 "Bring it on, All or nothing",
				 "American pie",
				 "The notebook",
				 "Titanic",
				 "Frozen",
				 "Beauty and the beast"
		 };
		 String[] filmprodusent = {
			"Universal",
			"Disney",
			"Warner Brothers",
			"21th fox",
			"Paramount Pictures"
		 };
		 String[] filmselskap = {
				 "Amy Poller",
				 "Walt Dinsney",
				 "James Cameron",
				 "Quentin Taration",
		 };				 
	 }
}