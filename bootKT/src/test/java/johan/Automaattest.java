
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class Automaattest {
	@Test
	public void tehteTest(){
		Rakendus r=new Rakendus();
		Funktsioon v=new Tehe(4);
		Assert.assertEquals(16.0,r.arvuta(v,4),0.01);
	}

}
