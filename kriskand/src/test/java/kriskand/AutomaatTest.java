package baas.kriskand;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class AutomaatTest {
	@Test
	public void Test(){
		Rakendus r=new Rakendus();
		Funktsioon a=new Arvutus(2.0);
		Assert.assertEquals(6.0,r.arvuta(a,3.0), 0.01);
		Assert.assertEquals(8.0,r.arvuta(a,4.0), 0.01);
		
	}
	
	@Test
	public void Test2(){
		Rakendus r=new Rakendus();
		Funktsioon a=new Arvutus2(3.0, 2.0);
		Assert.assertEquals(11.0,r.arvuta(a,3.0), 0.01);
		
		
	}
	
	

}