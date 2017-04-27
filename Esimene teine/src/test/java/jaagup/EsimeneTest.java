package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse(){
		//Kasutus1 abi=new Kasutus1();
		JoonAction abi = new JoonAction(4.0);
		assertEquals(16.0,abi.leiaY(4.0),0.1);
		
		
	}
	@Test
	public void katse2(){
		JoonAction2 abi = new JoonAction2(3.0,5.0);
		assertEquals(26.0,abi.leiaY(7.0),0.1);
	}
	
	@Test
	public void katse3(){
		JoonAction2 abi=new JoonAction2(3.0,2.0);
		assertEquals(8.0,abi.leiaY(2),0.1);
	}
	
	@Test
	public void katse4(){
		double[] expectedResult = new double[]{14.0,17.0,20.0};
		double[] iksid = {3.0,4.0,5.0};
		JoonAction2 abi= new JoonAction2(3.0,5.0);
		assertArrayEquals(expectedResult,Kasutus1.massiiv(iksid,abi),0.1 );
	}
	
}