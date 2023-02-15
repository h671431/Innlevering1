package Test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.tabell.*;

public class TabellSirkulaerKoeTest extends KoeADTTest {

	@Override
	protected KoeADT<Integer> reset() {
		return new KjedetKoe<Integer>();
	}
}
