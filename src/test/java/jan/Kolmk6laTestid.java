package jan;

import org.junit.*;
import static org.junit.Assert.*;


public class Kolmk6laTestid{
	
	
	@Test
	public void Kolmk6la() {
		
		Kolmk6la k = new Kolmk6la(60);
		assertEquals(60, k.getPotoon());
		assertEquals(64, k.getSuurTerts());
		assertEquals(67, k.getKvint());
	}
	
	@Test
	public void akordideTest1() {
		
		String pohitoonid = "cdefg";
		String akordideString = "";
		String akordJadast = "";
		
		for(int i = 0; i < pohitoonid.length(); i++) {
			
			akordJadast = pohitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmk6la p6hiheli = new CKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(akordJadast.equals("f")) {
				Kolmk6la p6hiheli = new FKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(akordJadast.equals("g")) {
				Kolmk6la p6hiheli = new GKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(!akordJadast.equals("c") && !akordJadast.equals("f") && !akordJadast.equals("g")) {
				akordideString += "Akordi " + akordJadast.toUpperCase() + " ei saa kuvada<br>";
			}
		}
		
		assertEquals("60 64 67<br>Akordi D ei saa kuvada<br>Akordi E ei saa kuvada<br>65 69 72<br>67 71 74<br>", akordideString);
	}
	
}