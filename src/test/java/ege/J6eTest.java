package ege;

import org.junit.*;
import static org.junit.Assert.*;

public class J6eTest{
	@Test
	public void test1(){
		J6gi j1= new J6gi("Keila", 120, 6.5, null, 0);
		J6gi j2=new J6gi("Vihula", 40, 4.5, j1, 80);
		J6gi j3=new J6gi("Harku", 70, 1.6, j2, 35);
		J6gi j4=new J6gi("Pedja", 100, 10.9, j3, 40);
		
		assertEquals(155.0, j4.sihtj6eAsukoht+j3.sihtj6eAsukoht+j2.sihtj6eAsukoht, 0.1);
	}
	@Test
	public void test2(){
		J6gi j1= new J6gi("Keila", 120, 6.5, null, 0);
		J6gi j2=new J6gi("Vihula", 40, 4.5, j1, 0);
		J6gi j3=new J6gi("Harku", 70, 1.6, j2, 0);
		J6gi j4=new J6gi("Pedja", 100, 10.9, j3, 0);
		
		assertEquals(0, j4.sihtj6eAsukoht+j3.sihtj6eAsukoht+j2.sihtj6eAsukoht, 0.1);
	}
	/*@Test
	public void test3(){
		J6gi j1= new J6gi("Keila", 120, 6.5, null, 0);
		J6gi j2=new J6gi("Vihula", 40, 4.5, j1, 80);
		J6gi j3=new J6gi("Harku", 70, 1.6, j2, 35);
		J6gi j4=new J6gi("Pedja", 100, 10.9, j3, 40);
		
		assertEquals(560.0, j4.sihtj6eAsukoht+j3.sihtj6eAsukoht+j2.sihtj6eAsukoht, 0.1);
	}
	Failed tests:
	J6eTest.test3:32 expected:<560.0> but was:<155.0>*/

}