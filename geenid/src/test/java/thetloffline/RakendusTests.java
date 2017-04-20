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
	private TestRestTemplate restTemplate;

	@Test
	public void alleeliTest() {
		Alleel alleel1 = new Alleel("reesus", true);
		assertEquals("Alleeli nimetus on: reesus ja v22rtus on: true", alleel1.Alleel("reesus", true));
	}
	
}
