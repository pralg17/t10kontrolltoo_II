package randotm;

import org.junit.*;
import static org.junit.Assert.*;

public class autoTest {
    
    @Test
    public void triadC() {
    	Triad note = new Triad(60);
    	assertEquals(60, note.base());
    	assertEquals(64, note.bigTert());
    	assertEquals(67, note.quint());
    }

    @Test
    public void CTriad() {
    	Triad note = new CTriad();
    	assertEquals(60, note.base());
    	assertEquals(64, note.bigTert());
    	assertEquals(67, note.quint());
    }

    @Test
    public void FTriad() {
    	Triad note = new FTriad();
    	assertEquals(65, note.base());
    	assertEquals(69, note.bigTert());
    	assertEquals(72, note.quint());
    }

    @Test
    public void GTriad() {
    	Triad note = new GTriad();
    	assertEquals(67, note.base());
    	assertEquals(71, note.bigTert());
    	assertEquals(74, note.quint());
    }


}