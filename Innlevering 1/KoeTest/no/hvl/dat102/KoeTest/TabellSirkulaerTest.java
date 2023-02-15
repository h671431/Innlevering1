package no.hvl.dat102.KoeTest;

import no.hvl.data102.KoeADT;
import no.hvl.data102.KoeADTTest;
import no.hvl.data102.tabell.*;

public abstract class TabellSirkulaerTest extends KoeADTTest {
	
	@Override
	protected KoeADT<Character> reset() {
		return new TabellSirkulaerKoe<Character>();
	}

}
