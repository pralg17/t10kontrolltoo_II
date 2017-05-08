package kent;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class LauseTest{
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void TestYks(){
		assertEquals("2", this.restTemplate.getForObject("/tähed?tekst=Tere mina olen Kalle",String.class));
	}


}
