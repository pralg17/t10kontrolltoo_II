package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT	)
public class JoonApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	// punkt 1
	@Test
	public void contextLoads() {
		JoonKlass test = new JoonKlass(3);
		assertEquals(6.0,2 * test.kordaja,0.1);
	}

	@Test
	public void contextLoads2() {
		JoonKlass test = new JoonKlass(3);
		assertEquals(9.0,3 * test.kordaja,0.1);
	}


	// punkt 2 - funktsiooni testimine
	@Test
	public void contextLoads1() {
		JoonKlass2 test = new JoonKlass2(3.0,2);
		assertEquals(9.0,test.lieaY(2),0.1);
	}

	@Test
	public void contextLoads3() {
		JoonKlass test = new JoonKlass(3.0);
		assertEquals(5.0,test.lieaY(2),0.1);
	}

	//punkt 3
	@Test
	public void leheTest1(){  // oiged v22ruted
		assertEquals("y = [4.0, 6.0, 8.0, 10.0, 12.0]",
				this.restTemplate.getForObject("/calc?a=2&b=2&x1=1&x2=5",String.class));
	}
	@Test
	public void leheTest2(){  // valed v22ruted
		assertEquals("y = [2.0, 6.0, 8.0, 10.0, 12.0]",
				this.restTemplate.getForObject("/calc?a=2&b=2&x1=1&x2=5",String.class));
	}

	//Nuud testime kui b on NULL
	@Test
	public void leheTest3(){  // oiged v22ruted
		assertEquals("y = [2.0, 4.0, 6.0, 8.0, 10.0]",
				this.restTemplate.getForObject("/calc?a=2&b=&x1=1&x2=5",String.class));
	}

	@Test
	public void leheTest4(){  // valed v22ruted
		assertEquals("y = [3.0, 4.0, 6.0, 8.0, 10.0]",
				this.restTemplate.getForObject("/calc?a=2&b=&x1=1&x2=5",String.class));
	}

}
