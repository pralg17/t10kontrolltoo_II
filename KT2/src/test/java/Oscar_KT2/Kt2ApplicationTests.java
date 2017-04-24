package Oscar_KT2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Kt2ApplicationTests {

	@Test
	public void riverTest1() {
        River river1 = new River();
        river1.River("koeru", 12, 6);

        River river2 = new River();
        river2.River("narva", 10, river1, 10);
        
        River river3 = new River();
        river3.River("isa", 7, river2, 12);

        River river4 = new River();
        river4.River("kana", 4, river3, 5);
		assertEquals(33.0, river4.getLenghtToSea(),0.01);
	}
	@Test
	public void riverTest2() {
        River river1 = new River();
        river1.River("koeru", 12, 6);
		assertEquals(6.0, river1.getLenghtToSea(),0.01);
	}

}
