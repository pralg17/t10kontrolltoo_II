package com.kontrolltoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkoApplicationTests {
	private MarkoApplication r = new MarkoApplication();

	@Test
	public void accessData() {
		assertEquals(r.vesinik.getCharge(), 1);
	}

	@Test
	public void checkCreation(){
		assertEquals(true, r.vesinik != null);
	}


	@Test
	public void checkName(){
		assertEquals(r.vesiniknitraat.getName(), "HNO3");
	}

	@Test
	public void checkChargeFailure(){assertEquals(r.makeFailure(), "You don goofed");}

	@Test
    public void checkNameOrder(){assertEquals(r.vesinikfloriid.getName(), "HF");}



}
