package mattias;

import org.junit.*;
import static org.junit.Assert.*;


public class PohitooniTest{
	
	//1.punkt
	Kolmkola nootC = new Kolmkola(60);
	//2.punkt
	Kolmkola nootCC = new Kolmkola(60);
	Kolmkola nootF = new Kolmkola(65);
	Kolmkola nootG = new Kolmkola(67);
	//3.punkt
		//Kolmkola nootE = new Kolmkola("E");//Peab olema suur täht
		//Kolmkola nootEE = new Kolmkola(64);
	Lugu song = new Lugu();
	String akordid = "cgf";
	String eraldiakord = "";
	
	//1.punkt
	@Test
	public void pohitoonitest(){
		//Peavad olema jutumärgid ümber
		assertEquals("60 64 67", nootC.vastus());
	}	
	//2.punkt
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
	/*
	@Test
	public void pohitoonitest2(){
		assertEquals("64 68 71", nootE.noodiNumberTahest());
	}
	*/
	//3.punkt
	@Test
	public void luguTest() {
		String kuidas = "arv";
		//TÜKELDAN
		for(int i=0; i<akordid.length(); i++) {
			eraldiakord = akordid.substring(i, i+1);
			if(eraldiakord.equals("c")) {
				Kolmkola akord = new CKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
			if(eraldiakord.equals("g")) {
				Kolmkola akord = new FKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
			if(eraldiakord.equals("f")) {
				Kolmkola akord = new GKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
		}
		assertEquals("60 64 6765 69 7267 71 74", song.akordid());
	}
	
	@Test
	public void luguTest2() {
		String kuidas = "täht";
		//TÜKELDAN
		for(int i=0; i<akordid.length(); i++) {
			eraldiakord = akordid.substring(i, i+1);
			if(eraldiakord.equals("c")) {
				Kolmkola akord = new CKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
			if(eraldiakord.equals("g")) {
				Kolmkola akord = new FKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
			if(eraldiakord.equals("f")) {
				Kolmkola akord = new GKolmkola();
				Kolmkola looTakt = song.taktirida(akord, kuidas);
			}
		}
		assertEquals("C E GF A CG H D", song.akordid());
	}
}
