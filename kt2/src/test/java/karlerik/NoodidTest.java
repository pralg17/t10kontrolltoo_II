package karlerik;

import org.junit.*;
import static org.junit.Assert.*;

public class NoodidTest {
	
	@Test
	public void nooditest1() {
		Kolmkola c1 = new Kolmkola(60);
		assertEquals("60 64 67<br>", c1.toString());
	}
	
	@Test
	public void akordideTest1() {
		
		String pohitoonid = "cdefg";
		String akordideString = "";
		String akordJadast = "";
		
		for(int i = 0; i < pohitoonid.length(); i++) {
			
			akordJadast = pohitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmkola noot = new CKolmkola();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("f")) {
				Kolmkola noot = new FKolmkola();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("g")) {
				Kolmkola noot = new GKolmkola();
				akordideString += noot.toString();
			}
			
			if(!akordJadast.equals("c") && !akordJadast.equals("f") && !akordJadast.equals("g")) {
				akordideString += "Akordi " + akordJadast.toUpperCase() + " ei saa kuvada<br>";
			}
		}
		
		assertEquals("60 64 67<br>Akordi D ei saa kuvada<br>Akordi E ei saa kuvada<br>65 69 72<br>67 71 74<br>", akordideString);
	}
	
	@Test
	public void akordideTest2() {
		
		Kolmkola noot1Arvudena = new GKolmkola();
		assertEquals("67 71 74<br>", noot1Arvudena.toString("1"));
		
		Kolmkola noot1Tahtedena = new GKolmkola();
		assertEquals("G B D<br>", noot1Tahtedena.toString("0"));
	}
	
	@Test
	public void akordideTest3() {
		
		Kolmkola noot2Arv = new Kolmkola(72);
		assertEquals("72 76 79<br>", noot2Arv.toString("1"));
		
		Kolmkola noot2Taht = new Kolmkola(72);
		assertEquals("C E G<br>", noot2Taht.toString("0"));
		
		Kolmkola noot3Arv = new Kolmkola("c");
		assertEquals("60 64 67<br>", noot3Arv.toString2("1"));
		
		Kolmkola noot3Taht = new Kolmkola("c");
		assertEquals("C E G<br>", noot3Taht.toString2("0"));
	}
	
	@Test
	public void luguTest() {
		
		Lugu mingilugu = new Lugu();
		String pohitoonid = "c";
		akordJadast = "";
		
		for(int i = 0; i < pohitoonid.length(); i++) {
			
			akordJadast = pohitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmkola akord = new CKolmkola();
				Kolmkola looTakt = mingilugu.taktijada(akord, kasNumbrites);
			}			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}