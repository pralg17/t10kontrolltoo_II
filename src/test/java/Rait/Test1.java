package Rait;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;


public class Test1{
	
	
	@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}
	
    @Test
    public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("Ahoi! Tere tulemast k10-le", r.tervitusfunktsioon());
	}	

}