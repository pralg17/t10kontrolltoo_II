package melissa;


import org.junit.*;
import static org.junit.Assert.*;

public class IooniTest{

    @Test
    public void Test(){
      String vastus= ("Nitraatiooni mass: 62 ja laeng: -1");
      assertEquals("Nitraatioon mass:",vastus.substring(14,16));
      assertEquals(62, Double.parseDouble(vastus.substring(16,3)),1);
      assertEquals(1, Double.parseDouble(vastus.substring(1,2)));

    }
}