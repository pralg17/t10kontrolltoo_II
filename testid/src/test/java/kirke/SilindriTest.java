package kirke;

import org.junit.*;
import static org.junit.Assert.*;
public class SilindriTest{
  Silinder s1=new Silinder(3, 5);
  @Test
  public void pindala(){
    assertEquals(28.2743339, s1.pohjaPindala(), 0.01);
  }
  @Test
  public void ruumala(){
    assertEquals(6.28, new Silinder(1, 2).ruumala(), 0.01);
}
}
