package rauntege;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void test1(){
		Main m = new Main();
		assertEquals("Name: Hydrogen", m.giveNameHydrogen());
	}
}