package baas;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


public class KontrollTest{

	Alleel a1 = new Alleel("Nimetus1", true);
	Alleel a2 = new Alleel("Nimetus1", true);
	Alleel a3 = new Alleel("Nimetus2", false);
	Geen geen1 = new Geen(a1, a2);
	Geen geen2 = new Geen(a1, a3);

	@Test
	public void KontrollTestVale() {
		assertEquals(geen1.Kontroll(), true);
	}

	@Test
	public void KontrollTestOige() {
		assertEquals(geen2.Kontroll(), false);
	}
}
