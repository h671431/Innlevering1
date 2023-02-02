package no.hvl.dat102.KoeTest;

import no.hvl.dat102.KoeADT;
import no.hvl.dat102.KoeADTTest;
import no.hvl.dat102.tabell.*;

public abstract class TabellSirkulaerTest extends KoeADTTest {
	
	@Override
	protected KoeADTTest<Character> reset() {
		return new TabellSirkulaerKoe<Character>();
	}

}
