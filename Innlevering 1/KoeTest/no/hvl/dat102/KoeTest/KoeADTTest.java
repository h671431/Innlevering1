package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;

public abstract class KoeADTTest {

	public KoeADT<Integer> koe;

	public Integer testint0 = 0;
	public Integer testint1 = 1;
	public Integer testint2 = 2;
	public Integer testint3 = 3;
	public Integer testint4 = 4;

	protected abstract KoeADT<Integer> reset();
	
	@BeforeEach
	public void setup() {
		koe = reset();
	}
	
	@BeforeEach
	public void nyKoeErTom() {
		assertTrue(koe.erTom());
	} 
	
	@Test 
	public void testInnKoe() {
		koe.innKoe(testint0);
		assertEquals(0, koe.foerste());
	}
	
	@Test
	public void testUtKoe() {
		koe.innKoe(testint0);
		koe.innKoe(testint1);
		koe.innKoe(testint3);
		Integer uttest = koe.utKoe();
		assertEquals(uttest, testint0);
	}
	
	@Test
	public void testTom() {
		koe.innKoe(testint0);
		assertFalse(koe.erTom());
		koe.utKoe();
		assertTrue(koe.erTom());		
	}
	
	@Test
	public void testFoerste() {
		koe.innKoe(testint0);
		assertEquals(testint0, koe.foerste());
	}
}
