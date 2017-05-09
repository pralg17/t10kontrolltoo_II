package mattias;

import org.junit.*;
import static org.junit.Assert.*;


public class PohitooniTest{
	
	Kolmkola nootC = new Kolmkola(60);
	Kolmkola nootCC = new Kolmkola(60);
	Kolmkola nootF = new Kolmkola(65);
	Kolmkola nootG = new Kolmkola(67);
	Kolmkola nootE = new Kolmkola("E");//Peab olema suur täht
	Kolmkola nootEE = new Kolmkola(64);
	//Lugu akord = new Lugu("cfg");
	
	
	@Test
	public void pohitoonitest(){
		//Peavad olema jutumärgid ümber
		assertEquals("60 64 67", nootC.vastus());
	}	
	
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
	
	
	@Test
	public void pohitoonitest2(){
		assertEquals("64 68 71", nootE.noodiNumberTahest());
	}
	
	@Test
	public void pohitoonitest3(){
		assertEquals("E G# H", nootEE.noodiTahtNumbrist());
		//assertEquals("E", nootEE.noodiTahtNumbrist());
	}
	
	/*
	@Test
 	public void lugutest() {
	}
	*/
}
