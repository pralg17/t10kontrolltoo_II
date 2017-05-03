package thetloffline;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

public class RakendusTests {

	@Autowired
	//private TestRestTemplate restTemplate;

	@Test
	public void geeniAvaldumineTrueTest() {
		Geen s6bralik = new Geen(new Alleel("reesus", false), new Alleel("reesus", true));
		//Alleel reesus1 = new Alleel("reesus", false);
		//Alleel reesus2 = new Alleel("reesus", true);
		assertEquals(true, s6bralik.geeniV22rtus());
	}

	@Test
	public void geeniAvaldumineFalseTest() {
		Geen s6bralik2 = new Geen(new Alleel("reesus", false), new Alleel("reesus", false));
		//Alleel reesus1 = new Alleel("reesus", false);
		//Alleel reesus2 = new Alleel("reesus", false);
		assertEquals(false, s6bralik2.geeniV22rtus());
	}
	
}
