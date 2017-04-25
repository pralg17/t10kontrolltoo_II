package kirke;

import org.junit.*;
import static org.junit.Assert.*;
public class S6nadeTest{

  @Test
  public void S6na(){
    S6na t1=new S6na("tere");
    assertEquals(0, t1.T2heesinemine('a'));
  }


@Test
  public void S6na1(){
    S6na t1=new S6na("tere");
    assertEquals(1, t1.T2heesinemine('t'));
  }


@Test
  public void S6na2(){
    S6na t1=new S6na("tere");
    assertEquals(2, t1.T2heesinemine('e'));
  }

}
