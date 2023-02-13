package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public abstract class Filmarkiv implements FilmarkivADT {

	private Film[] filmTab;
	private int antall;

	public Filmarkiv(int antall) {
		this.antall = 0;
		filmTab = new Film[antall];
	}

	public Film finnFilm(int nr) {
		boolean filmFunnet = false;
		Film funnetFilm = null;
		while (!filmFunnet) {
			for (int i = 0; i < filmTab.length; i++) {
				if (filmTab[i].getFilmnr() == nr) {
					filmFunnet = true;
					funnetFilm = filmTab[i];
				}
			}
		}
		return funnetFilm;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == filmTab.length) {
			utvid();
		} else {
			filmTab[antall] = nyFilm;
			antall++;
		}
	}

	private void utvid() {
		Film[] hjelptab = new Film[(int) Math.ceil(2 * filmTab.length)];

		for (int i = 0; i < filmTab.length; i++) {
			hjelptab[i] = filmTab[i];
		}
		filmTab = hjelptab;
	}

	private boolean erTom() {
		return (antall == 0);
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean slettet = false;
		int i = 0;
		if (!erTom()) {
			while (slettet != true && antall > i) {
				if (filmTab[i].getFilmnr() == filmnr) {
					filmTab[i] = filmTab[antall - 1];
					filmTab[antall - 1] = null;
					slettet = true;
				} else {
					i++;
				}
			}
		}
		return slettet;
	}

	@Override
	public Film[] soekTittel(String delstring) {
		Film[] hjelptab = new Film[antall];
		int i = 0;
		for (int j = 0; j < antall; j++) {
			if (filmTab[j].getTittel().contains(delstring)) {
				hjelptab[i] = filmTab[j];
				i++;
			}
		}
		hjelptab = trimTab(hjelptab, i);
		return hjelptab;
	}

	private Film[] trimTab(Film[] tab, int n) {
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < 0) {
			nytab[i] = tab[i];
			i++;
		}
		return nytab;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int totall = 0;
		for (int i = 0; i < antall; i++) {
			if (filmTab[i].getSjanger() == sjanger) {
				totall++;
			}
		}
		return totall;
	}

	@Override
	public int antall() {
		return antall;
	}

	public Film[] soekProdusent(String delstreng) {
		Film[] funnetFilm = new Film[this.antall];
		int treff = 0;
		Film[] returnertFilm = null;
		for (int i = 0; i < filmTab.length; i++) {
			if (filmTab[i].getProdusent().contains(delstreng)) {
				funnetFilm[treff] = filmTab[i];
				treff++;
			}
		}

		returnertFilm = new Film[treff];
		System.arraycopy(funnetFilm, 0, funnetFilm, 0, treff);
		return returnertFilm;
	}
}