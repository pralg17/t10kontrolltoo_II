/*package jaagup;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT	)
public class TeineTest{

	@Autowired
	private TestRestTemplate restTemplate;

@Test
 public void TestYks(){  
 	assertEquals("[13.0, 17.0, 21.0]",this.restTemplate.getForObject("/arvutay?iksMin=2&iksMax=3&kordaja=4&vabaliige=5",String.class));
	
}}
*/