package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{
	
	private int antall;
	private LinearNode<Film> start;
	
	@Override
	public Film finnFilm(int filmnr) {
		Film[] filmer = new Film[antall];
		
		LinearNode<Film> neste = start;
		for(int i =0; i<antall && neste != null; i++) {
			filmer[i] = neste.getElement();
			neste = neste.getNeste();
		}
		return filmnr;
	}
	@Override
	public boolean leggTilFilm(Film nyFilm) {
		LinearNode<Film> nynode = new LinearNode<>(nyFilm);
		nynode.setNeste(start);
		start = nynode;
		antall++;
		
		return true;
	}
	
	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> neste = start;
		LinearNode<Film> forrige = start;
		
		if (neste == null) {
			return false;
		}
		if(neste.getElement().getFilmnr()==filmnr) {
			neste = neste.getNeste();
			antall--;
			return true;
		} else {
			neste = neste.getNeste();
			for(int i=1; i<antall && neste !=null; i++) {
				if(neste.getElement().getFilmnr()==filmnr) {
					if(neste.getNeste()==null) {
						neste = null;
						return true;
					}
					forrige.setNeste(neste.getNeste());
					antall--;
					return true;
				}
				forrige = neste;
				neste = neste.getNeste();
			}
			forrige = neste;
			neste = neste.getNeste();
		}
	
	return false;
	}
	
	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] filmer = new Film[antall];
		LinearNode<Film> neste = start;
		int pos = 0;
		
		for(int i = 0; i<antall; i++) {
			if(neste.getElement().getTittel().contains(delstreng)) {
				filmer[pos] = neste.getElement();
				pos++;
			}
			neste = neste.getNeste();
		}
		return trimTab(filmer, pos);
	}
	
	private Film[] trimTab(Film[] filmer, int n) {
		Film[] filmtab2 = new Film[n];
		int i = 0;
		while (i<n) {
			filmtab2[i] = tab[i];
			i++;
		}
		return filmtab2;
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmer = new Film[antall];
		LinearNode<Film> neste = start;
		int pos = 0;
		
		for(int i = 0; i<antall; i++) {
			if(neste.getElement().getTittel().contains(delstreng)) {
				filmer[pos] = neste.getElement();
				pos++;
			}
			neste = neste.getNeste();
		}
		return trimTab(filmer, pos);
	}
	@Override
	public int antall(Sjanger sjanger) {
		LinearNode<Film> neste = start;
		int antallFilmer = 0;
		
		for(int i = 0; i<antall; i++) {
			if(neste.getElement().getTittel().contains(delstreng)) {
				antallFilmer++;
				
				}
			
			neste = neste.getNeste();
		}
		
		return antallFilmer;
	}
	
	@Override
	public int antall() {
		
		return antall;
	}
	
	//ønsker å skrive ut filmarkiv
	public String skrivUt() {
		String svar="";
		LinearNode<Film> neste = start;
		
		for(int i=0; i<antall && neste != null; i++) {
			svar += neste.getElement().toString() + "\n";
			neste = neste.getNeste();
		}
		return svar;
	}
	
	
	

}
