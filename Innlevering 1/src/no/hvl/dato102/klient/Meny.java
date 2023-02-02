package no.hvl.dato102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;  
	 private FilmarkivADT filmarkiv;  
	  
	 public Meny(FilmarkivADT filmarkiv){ 
	  tekstgr = new Tekstgrensesnitt();  
	  this.filmarkiv = filmarkiv;
	 } 
	  
	 public void start(){ 
		 // Legger inn fillmer
		 String[] filmtittel = {
				 "Mean girla", 
				 "Leagally blond",
				 "Bring it on, All or nothing",
				 "American pie",
				 "The notebook"
				 "Titanic",
				 "Frozen",
		 };
		 String[] filmprodusent = {
			"Universal",
			"Disney",
			"Warner Brothers",
			"21th fox",
		 };
		 String[] filmselskap = {
				 "Amy Poller",
				 "Walt Dinsney",
				 "Jamer Cameron",
				 "Quentin Taration",
		 };
		 int nr = 0;
		 for(String film : filmtittel) {
			 Sjanger sjanger = no.hvl.data102.Sjanger.values()[nr % Sjanger.values()length];
			 Film nyfilm = new Film(nr++, filmprodusent[nr % filmprodusent.length], film (2001 + nr), sjanger, filmselskap[nr % produsenter.length]);
			 filmarkiv.leggTilFilm(nyfilm);
		 }
				 
	 }
}
