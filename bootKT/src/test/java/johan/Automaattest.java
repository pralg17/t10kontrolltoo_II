
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
		Funktsioon v=new Tehe(2);
		Assert.assertEquals(6.0,r.arvuta(v,3));

	}
	
	@Test
	public void tehteTest2(){
		Rakendus r=new Rakendus();
		Funktsioon t=new Tehe2(4, 2);
		Assert.assertEquals(12.0,r.arvuta(t,3));
	}
	@Test
	public void massiiviTest(){
		Rakendus r=new Rakendus();
		Funktsioon x1=new Tehe(3);
		Funktsioon x2=new Tehe(5);
		Funktsioon x3=new Tehe(7);
		Assert.assertEquals(6.0,r.arvuta(x1,3));
		Assert.assertEquals(10.0,r.arvuta(x2,3));
		Assert.assertEquals(14.0,r.arvuta(x3,3));
	}

}
