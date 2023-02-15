package no.hvl.dato102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.Sjanger;
//import java.util.Scanner;
import javax.swing.JOptionPane;


public class Tekstgrensesnitt  {
	

	// lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
		/* Scanner scan = new Scanner(System.in);
		 Film min = new Film(1, null, null, null, 0, null);
		 try {
			 System.out.println("Tittel ");
			 min.setTittel(scan.nextLine());
			 System.out.println("Produset ");
			 min.setProdusent(scan.nextLine());
			 System.out.println("Film nr ");
			 System.out.println("Filmselskap ");
			 min.setFilmselskap(scan.nextLine());
			 System.out.println("Utgivelsesår ");
			 min.setAar(scan.nextInt());
			 min.setSjanger(no.hvl.data102.Sjanger.valueOf(scan.next().toUpperCase()));
		 } catch (Exception e) {
			 System.out.println("Informasjonen er ikke korrekt");
		 }
		 return min;
		*/ 
		 
		try {
			int filmnr = Integer.parseInt(JOptionPane.showInputDialog("Filmnummer:"));
			int utgivelsesår = Integer.parseInt(JOptionPane.showInputDialog("Når ble filmen utgitt: "));
			
			String produsent = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Produsent: "));
			String tittel = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Skriv inn tittel: "));
			String filselskap = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Filmselskap: "));
			
			String sjangerString = JOptionPane.showInputDialog("Skriv inn sjanger: ");
			Sjanger sjanger = Sjanger.finnSjanger(sjangerString);
			
			Film film = new film(filmnr, produsent, tittel, sjanger, filmselskap);
			
			return film;
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return null;
	 } 
	 
	 // vise en film med alle opplysninger på skjerm (husk tekst for sjanger) 
	 //Viser en film med alle gitt opplysnigner fra bruker
	 public void visFilm(Film film) { 
	/*	 try {
			 String [] min = film.toString().split("#");
			 System.out.println("Tittel: " + min[1]);
			 System.out.println("Produsent " + min[2]);
			 System.out.println("Film nr " + min[3]);
			 System.out.println("Filmselskap " + min[4]);
			 System.out.println("Sjanger " + min[5]);
			 System.out.println("Utgivelses år " + min[6]);
		 } catch (Exception e) {
			 System.out.println("Fant ikke filmen du leter etter");
		 }
	  */
		 
		 System.out.println(film.toString());
	 }
	 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,  
	                                                           String delstreng) { 
		 Film[] filmtab = filma.soekTittel(delstreng);
		 for(Film i : filmtab) {
			 visFilm(i);
		 }
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) { 
		 for (Film filmtab : filma.soekTittel("")) {
			 if (filmtab.getProdusent().contains(delstreng)) {
				 System.out.println(filmtab.toString());
			 }
		 }
	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
		 Sjanger[] sjanger = Sjanger.values();
		 System.out.println("Totalt antall filmer er: " + filma.antall());
		 for(int i = 0; i < sjanger.length; i++) {
			 System.out.println(sjanger[i] + ": " + filma.antall(sjanger[i]));
		 }	 
	 }

}
