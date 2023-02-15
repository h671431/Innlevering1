package no.hvl.dat102.KoeTest;

public abstract class KjedetKoeTest extends KoeADTTest {

	@Override
	protected KoeADT<Character> reset() {
		return new KjedetKoe<Character>();
	}
	
}
