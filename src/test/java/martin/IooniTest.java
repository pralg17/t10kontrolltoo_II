package martin;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class IooniTest {
	
	@Test
   public void nimeTest(){
		Rakendus r=new Rakendus();
		assertEquals("Iooninimi koos laengutega on Na1+ F1- ", r.IooniNimi());
	}
	
	@Test
	public void massiTest(){
		Rakendus r=new Rakendus();
		assertEquals("Nende kahe molekuli masside summa on: 42", r.MolekulideMass());
	}
	
	
}