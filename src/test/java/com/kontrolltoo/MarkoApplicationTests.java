package com.kontrolltoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkoApplicationTests {
	MarkoApplication r = new MarkoApplication();

	@Test
	public void accessData() {
		assertEquals(r.vesinik.getLaeng(), 1);
	}

	@Test
	public void checkCreation(){
		assertEquals(true, r.vesinik != null);
	}

}
