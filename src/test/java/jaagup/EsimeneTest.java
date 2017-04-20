package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse(){
		//Kasutus1 abi=new Kasutus1();
		Kasutus1 abi = new Kasutus1();
		assertEquals(12,abi.kolmega(4));
		assertNotEquals(7,abi.kolmega(4));
		
	}
	@Test
	public void katse2(){
		Kasutus1 abi = new Kasutus1();
		assertEquals(21,abi.kolmega(7));
	}
	
}