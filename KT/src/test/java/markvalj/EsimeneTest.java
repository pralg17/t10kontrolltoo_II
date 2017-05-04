package markvalj;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void test1(){
	assertEquals(3, 3);
	}
	

	//automaattest, mis annab x-le v��rtuse valemis  y=3x ning kontrollib vastust
	@Test 
	public void test2(){
		
	v6rrand v6rrand1 = new v6rrand();
	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht näitab vea range-i
		assertEquals(9.0, v6rrand1.arvuta2(3), 0.5);
	}

	@Test 
	public void test3(){
		
	v6rrand v6rrand1 = new v6rrand();
	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht näitab vea range-i
		assertEquals(0, v6rrand1.arvuta2(0), 0.5);
	}


	@Test 
	public void test4(){
		
	v6rrand v6rrand1 = new v6rrand();
	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht näitab vea range-i
		assertEquals(3, v6rrand1.arvuta2(1), 0.5);
	}

	@Test 
	public void test5(){
		
	v6rrand v6rrand1 = new v6rrand();
	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht näitab vea range-i
		assertEquals(6, v6rrand1.arvuta2(2), 0.5);
	}


	
}