package Test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.tabell.TabellSirkulaerKoe;

public class KjedetKoeTest extends KoeADTTest {

	@Override
	protected KjedetKoe<Integer> reset() {
		return new KjedetKoe<Integer>();
	}
}