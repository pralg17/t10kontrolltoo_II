package georg;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;



public class IoonApplicationTests {

	
	@Test
	public void leheTest1(){
		ioon i1=new ioon("Prooton", 1.01, 1);
		//ioon i2=new ioon("Nitraatioon", 14.01);
		//ioon i3=new ioon("Hapnik", 16);
		assertEquals(i1.nimetus, "Prooton");
		assertEquals(i1.aatommass, 1.01, 0.01);
		assertEquals(i1.laeng, 1, 0.01);
	}
}