package Stivo;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class kolmkolaTest{
	@Test
	public void kolmkolaTest(){
		Kolmkola k = new Kolmkola(60);
		assertEquals(60, k.pohitoon());
		assertEquals(64, k.suurTerts());
		assertEquals(67, k.kvint());
	}
	
	@Test
	public void CkolmkolaTest(){
		Kolmkola k = new CKolmkola();
		assertEquals("60 64 67", k.kolmkolaNoodid());
	}
	
	@Test
	public void FkolmkolaTest(){
		Kolmkola k = new FKolmkola();
		assertEquals("65 69 72", k.kolmkolaNoodid());
	}
	
	@Test
	public void GkolmkolaTest(){
		Kolmkola k = new GKolmkola();
		assertEquals("67 71 74", k.kolmkolaNoodid());
	}
}