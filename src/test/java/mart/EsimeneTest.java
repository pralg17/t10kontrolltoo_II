package mart;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void test1(){
		assertEquals("Esimene","Esimene");
	}
	@Test
	public void test2(){
		Alleel testal1 = new Alleel("testal", false);
		Alleel testal2 = new Alleel("testa2", false);
		Geen r=new Geen(testal1,testal2);
		assertEquals(false, r.Kontroll());
	}	
}	