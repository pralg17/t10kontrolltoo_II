package johan;
import org.junit.*;
import static org.junit.Assert.*;

public class Automaattest{
	@Test
	public void Yvaartus(){
		Rakendus r = new Rakendus();
		/*assertEquals("Sirgel y=3x, kus x=5 on y-i v22rtus: 15", r.yVaartuseleidja("5"));*/
		Assert.assertEquals("15=3*5",r.yVaartuseleidja("5"));
		
	}
	
}