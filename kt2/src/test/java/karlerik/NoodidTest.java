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
	
}