package kristel;

import org.junit.*;
import static org.junit.Asserts.*;

public class T2heTest{
  T2heLugeja lugeja = new HarilikLugeja("tere");

  @Test
  public void paljuT2hti(){
    assertEquals(0, lugeja.paljuT2hti('a'));
    assertEquals(2, lugeja.paljuT2hti('e'));
    assertEquals(1, lugeja.paljuT2hti('t'));
  }
}
