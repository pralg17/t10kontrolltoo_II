package rihard;

import org.junit.*;
import static org.junit.Assert.*;


public class EsimeneTest{

	
	@Test
	public void x3funktsioon(){
		
		Rakendus r=new Rakendus();
		assertEquals("Y = 9.0", r.x3funktsioon(3));
		
	}
	
	@Test
	public void vabaliige(){
		
		Rakendus r=new Rakendus();
		assertEquals("Y = 11.0", r.vabaliige(3, 2));
		
	}
	
}	
