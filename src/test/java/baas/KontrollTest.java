package baas;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class KontrollTest{

	Alleel a1 = new Alleel("Nimetus1", true);
	Alleel a2 = new Alleel("Nimetus1", true);
	Alleel a3 = new Alleel("Nimetus1", false);
	Alleel a4 = new Alleel("Nimetus1", false);
	Geen geen1 = new Geen(a1, a2);
	Geen geen2 = new Geen(a1, a3);
	Geen geen3 = new Geen(a3, a4);

	@Test
	public void KontrollTestOige1() {
		Assert.assertEquals(geen1.Kontroll(), true);
	}

	@Test
	public void KontrollTestOige2() {
		Assert.assertTrue(geen2.Kontroll());
	}
	@Test
	public void KontrollTestVale() {
		Assert.assertEquals(geen3.Kontroll(), false);
	}
}
