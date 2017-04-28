package karin;

import java.util.*; 
import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{

    @Test
    public void test1(){
        assertEquals(3, 2+1);
    }
	
	@Test                            
    public void test2(){
	     Kolmkõla proov1 = new Kolmkõla(60);
		 CKolmkõla proov2 = new CKolmkõla();
		 FKolmkõla proov3 = new FKolmkõla();
		 GKolmkõla proov4 = new GKolmkõla();
		 assertEquals(60, proov1.põhitoon);
		 assertEquals(64, proov1.terts);
		 assertEquals(67, proov1.kvint);
         assertEquals(65, proov3.põhitoon);
		 assertEquals(67, proov4.põhitoon);
		 assertEquals(74, proov4.kvint);
		 assertEquals("Noodid: 60, 64, 67", proov2.toString());
		 assertEquals("Noodid: 65, 69, 72", proov3.toString());
		 assertEquals("Noodid: 67, 71, 74", proov4.toString());
    }
	
	@Test
	public void test3(){
		Kolmkõla proov5 = new Kolmkõla("F#");
		assertEquals("Noodid: 66, 70, 73", proov5.toString());
	}
	
	@Test
	public void test4(){
		Kolmkõla noodinumber = new Kolmkõla(60);
		assertEquals("C",noodinumber.nooditäheks(60));
		assertEquals("C",noodinumber.nooditäheks(72));
		assertEquals("E",noodinumber.nooditäheks(76));
		assertEquals("F#",noodinumber.nooditäheks(54));
		assertEquals("F#",noodinumber.nooditäheks(66));
	}
	
	
	
}