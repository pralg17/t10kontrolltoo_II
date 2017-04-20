package alari;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class RakendusTest {
	@Test
	public void vorrandiTest(){
		Rakendus r=new Rakendus();
		Assert.assertEquals("12=3*4",r.vorrand("4"));
	}

}
