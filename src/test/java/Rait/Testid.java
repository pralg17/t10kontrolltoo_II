package Rait;

import org.junit.*;
import static org.junit.Assert.*;

public class Testid{
	
    @Test
    public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("Ahoi! Tere tulemast k10-le", r.tervitusfunktsioon());
	}	
	/* @Test
	public void tervituseTest2(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, kodanik Juurikas J", r.tervitusfunktsioon4("Juku", "Juurikas"));
	} */
}