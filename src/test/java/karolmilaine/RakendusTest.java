package karolmilaine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class RakendusTest{

@Autowired
private TestRestTemplate restTemplate;

    @Test
    public void addingTest(){
      assertEquals("Lisatud hapukoor3203", this.restTemplate.getForObject("/lisa?nimetus=hapukoor&valgud=3&rasvad=20&susivesikud=3", String.class));
    }

    @Test
    public void deletionTest(){
        assertEquals("hapukoor 3 20 3 on kustutatud", this.restTemplate.getForObject("/kustuta?id=1", String.class));
    }
	
}
