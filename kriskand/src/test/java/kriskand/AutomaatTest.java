package kriskand;
import org.junit.*;
import static org.junit.Assert.*;

 public class AutomaatTest{
 	@Test
 	public void Yvaartus(){
 		Rakendus r = new Rakendus();
 		Assert.assertEquals("30=3*10",r.yVaartuseleidja("10"));
 		
 	}
 	
} 