package Chris;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class SalatApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void lisamine(){
		assertEquals("Andmebaasi lisati uus toiduaine Hapukoor 20.0 30.0 50.0", this.restTemplate.getForObject("/lisa_toiduaine?nimetus=Hapukoor&valkude_p=20&rasvade_p=30&sysivesikute_p=50", String.class));
	}
	
	@Test
	public void kustutamine(){
		assertEquals("Andmebaasist eemaldati toiduaine id-ga 7", this.restTemplate.getForObject("/eemalda_toiduaine?id=7", String.class));
	}
}
