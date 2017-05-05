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
		 assertEquals("60, 64, 67", proov2.toString());
		 assertEquals("65, 69, 72", proov3.toString());
		 assertEquals("67, 71, 74", proov4.toString());
    }
	
	@Test
	public void test3(){
		Kolmkõla proov5 = new Kolmkõla("F#");
		assertEquals("66, 70, 73", proov5.toString());
	}
	
	@Test
	public void test4(){
		Kolmkõla noodinumber = new Kolmkõla(60);
		assertEquals("C",noodinumber.nooditäheks(60));
		assertEquals("C",noodinumber.nooditäheks(72));
		assertEquals("E",noodinumber.nooditäheks(76));
		assertEquals("F#",noodinumber.nooditäheks(54));
		assertEquals("F#",noodinumber.nooditäheks(66));
		assertEquals("60, 64, 67", noodinumber.toString());
		assertEquals("C, E, G", noodinumber.toString2());
		Kolmkõla nooditäht = new Kolmkõla("G#");
		assertEquals(60,nooditäht.noodinumbriks("C"));
		assertEquals("68, 72, 75", nooditäht.toString());
		assertEquals("G#, C, EB", nooditäht.toString2());
		Kolmkõla nooditäht2 = new Kolmkõla("");  //jms vigane sisestus
		assertEquals("0, 0, 0", nooditäht2.toString());
		assertEquals("0, 0, 0", nooditäht2.toString2());
	}
	
	
	@Test
	public void test5(){
      Veebirakendus r = new Veebirakendus();
      assertEquals("65, 69, 72", r.teeKolmk6la("f"));
      assertEquals("60, 64, 67", r.teeKolmk6la("C"));
      assertEquals("Sisesta C, F või G", r.teeKolmk6la("lallalaa"));
	}
	
	@Test
    public void test6(){
        Veebirakendus r = new Veebirakendus();
        assertEquals("60, 64, 67, 67, 71, 74", r.väljastaNoodid("c,g", ""));
		assertEquals("0, 0, 0, 67, 71, 74", r.väljastaNoodid("vigane,g", ""));
		assertEquals("C#, F, G#, G, H, D", r.väljastaNoodid("c#,g", "jah"));
    }	
	
}
