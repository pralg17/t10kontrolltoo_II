package randotm;

import org.junit.*;
import static org.junit.Assert.*;

public class autoTest {
    
    @Test
    public void testC() {
    	Triad note = new Triad(60);
    	assertEquals(60, note.base());
    	assertEquals(64, note.bigTert());
    	assertEquals(67, note.quint());
    }


}