package karlerik;

import org.junit.*;
import static org.junit.Assert.*;

public class NoodidTest {
	
	@Test
	public void nooditest1() {
		Kolmkola c1 = new Kolmkola(60);
		assertEquals("60 64 67", c1.toString());
	}
	
}