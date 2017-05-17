package jan;

import org.junit.*;
import static org.junit.Assert.*;

public class Kolmk6laTestid{

@Test
	public void test1() {
		Kolmk6la c1 = new Kolmk6la(60);
		assertEquals("60 64 67<br>", c1.toString());
	}
	
	@Test
	public void akordideTest1() {
		
		String P6hitoonid = "cdefg";
		String akordideString = "";
		String akordJadast = "";
		
		for(int i = 0; i < P6hitoonid.length(); i++) {
			
			akordJadast = P6hitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmk6la noot = new CKolmk6la();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("f")) {
				Kolmk6la noot = new FKolmk6la();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("g")) {
				Kolmk6la noot = new GKolmk6la();
				akordideString += noot.toString();
			}
			
			if(!akordJadast.equals("c") && !akordJadast.equals("f") && !akordJadast.equals("g")) {
				akordideString += "Akordi " + akordJadast.toUpperCase() + " ei saa kuvada<br>";
			}
		}
		
		assertEquals("60 64 67<br>Akordi D ei saa kuvada<br>Akordi E ei saa kuvada<br>65 69 72<br>67 71 74<br>", akordideString);
	}
	
}