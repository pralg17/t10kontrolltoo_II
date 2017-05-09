import org.junit.*;
import static org.junit.Assert.*;

public class T2htedeTest{
    T2htedeLoendur loendur = new HarilikT2htedeLoendur("tere");
    @Test
    public void mituT2hte(){
      assertEquals(0, loendur.mituT2hte('a'));
      assertEquals(2, loendur.mituT2hte('e'));
      assertEquals(1, loendur.mituT2hte('t'));
    }




    }
