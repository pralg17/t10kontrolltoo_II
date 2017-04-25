package mattias;

import org.junit.*;
import static org.junit.Assert.*;

public class PohitooniTest{
	
	Kolmkola nootC = new Kolmkola(60);
	Kolmkola nootCC = new Kolmkola(60);
	Kolmkola nootF = new Kolmkola(65);
	Kolmkola nootG = new Kolmkola(67);
	
	@Test
	public void pohitoonitest(){
		//Peavad olema jutumärgid ümber
		assertEquals("60 64 67", nootC.vastus());
	}
	
	/*
	@Test
	public void pohitoonitestKvint(){
		assertEquals(67, nootC.vastusKvint());
	}
	*/
	
	
	@Test
	public void akorditestC(){
		assertEquals("60 64 67", nootCC.vastus());
	}
	
	@Test
	public void akorditestF(){
		assertEquals("65 69 72", nootF.vastus());
	}
	
	@Test
	public void akorditestG(){
		assertEquals("67 71 74", nootG.vastus());
	}
	
}