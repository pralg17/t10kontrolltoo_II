package com.example;

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
public class SalatApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
    public void lisamiseTest(){
	    assertEquals("Lisatud kartul10.020.010.0", this.restTemplate.getForObject("/lisa?nimetus=kartul&valgud=10&rasvad=20&sysivesikud=10", String.class));

    }

    @Test
    public void kustutamiseTest(){
        assertEquals("Kartul  on kustutatud", this.restTemplate.getForObject("/kustuta?id=1" , String.class));

    }

}
