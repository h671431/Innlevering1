package no.hvl.dat102.KoeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat201.exceptions.EmptyCollectionException;
import org.junit.Test;

public abstract class KoeADTTest {
	
	private KoeADT<Character>koe;
	
	private Character e0 = 1;
	private Character e1 = 2;
	private Character e2 = 3;
	private Character e3 = 4;
	private Character e4 = 5;
	
	protected abstract KoeADT<Character>reset();
	
	@BeforeEach
	public void nyKoeErTom() {
		assertTrue(koe.erTom());
	}
	@Test
	public void innKoeogutKoe() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e2);
		koe.innKoe(e3);
		koe.innKoe(e4);
		
		try {
			assertEquals(e2, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e0, koe.utKoe());
			assertEquals(e3, koe.utKoe());
		} catch (EmptyCollectionException e) {
			fail("Koe ut feilet" + e.getMessage());
		}
	}
	
	@Test 
	public void innKoeutKoeinnKoeinnKoeutKoefoerste() {
		try {
			koe.innKoe(e2);
			koe.utKoe();
			koe.innKoe(e3);
			koe.innKoe(e4);
			koe.utKoe();
			assertEquals(e3, koe.foerste());
		}catch (EmptyColletcionException e) {
			fail("Koe inn eller første feilet" + e.getMessage());
		}
	}
	
	@Test
	public void innKoeutKoeerTom() {
		try {
			koe.innKoe(e0);
			koe.utKoe();
			assertTrue(koe.erTom());
		}catch (EmptyCollectionException e) {
			fail("Koeonn eller koeut feilet" + e.getMessage());
		}
	}
	
	@Test
	public void popFromEmptyIsUnderflowed() {
		Assertions.assertThrows(EmptyCollectionException.class, () -> {
			koe.utKoe();
			
		});
	}
}
