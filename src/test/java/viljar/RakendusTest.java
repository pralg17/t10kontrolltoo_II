package viljar;
import org.junit.*;
import java.io.IOException;
import static org.junit.Assert.*;

public class RakendusTest{
	@Test
	public void kasPositiivneAlleel() throws IOException{
		Geen1[] sisu=new Geen1[2];
		sisu[0]= new Geen1("x", 0);
		sisu[1]= new Geen1("x", 0);
		assertEquals("Alleelide nimetused ei kattunud või polnud positiivseid alleele",(new PositiivneAlleel().PositiivneAlleel(sisu)));
	}
	/*@Test
	public void kasJook() throws IOException{
		String x="plast";
		assertEquals(1,(Joogipudel.valueOf(x).getPudeliMaht()),0.02);
	}
	@Test
	public void kasPudelisse()throws IOException{
		assertEquals("Sellist jooki või pudelit pole olemas",
		new JookPudelisse().JookPudelisse("kivi","plast","2"));
	}*/
	/*@Test
	public void kasMituLiitritKastis()throws IOException{
		assertEquals(24.0,
		new VaadistKasti().MituLiitritKastis("plast", "k24"));
	}*/
	/*@Test
	public void kasJaakkastis()throws IOException{
		assertEquals(10.0,
		new VaadistKasti().Jaagileidja("plast", "olu", "k24"),0.02);
	}*/
	/*@Test
	public void VaadistKasti()throws IOException{
		assertEquals("10.0",
		new VaadistKasti().VaadistKasti("plast", "olu", "k24"),0.02);
	}*/
}
