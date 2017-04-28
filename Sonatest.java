package brigitta;
import org.junit.*;
import static org.junit.Assert.*;
public class Sonatest{

  @Test
  public void Sona(){
    Sona t1=new Sona("tere");
    assertEquals(0, t1.Tahtesineb('a'));
  }


@Test
  public void S6na1(){
    Sona t1=new Sona("tere");
    assertEquals(1, t1.Tahtesineb('t'));
  }


@Test
  public void Sona2(){
    Sona t1=new Sona("tere");
    assertEquals(2, t1.Tahtesineb('e'));
  }

}