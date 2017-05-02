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

    @Test
    public void tonesFromSong() {
    	Song s = new Song(4);
		Triad cChord = new CTriad();
		Triad gChord = new Triad(67);
		Triad fChord = new Triad("F");
		Triad aChord = new Triad("A");
    	s.addTact(cChord);
    	s.addTact(gChord);
    	s.addTact(fChord);
    	s.addTact(aChord);
    	assertEquals("Mängi toonid: 60 64 67.<br>Mängi toonid: 67 71 74.<br>Mängi toonid: 65 69 72.<br>Mängi toonid: 69 73 76.<br>", s.writeOutTones());
    }

    @Test
    public void lettersFromSong() {
    	Song s = new Song(4);
		Triad cChord = new CTriad();
		Triad gChord = new Triad(67);
		Triad fChord = new Triad("F");
		Triad aChord = new Triad("A");
    	s.addTact(cChord);
    	s.addTact(gChord);
    	s.addTact(fChord);
    	s.addTact(aChord);
    	assertEquals("Mängi noodid: C E G.<br>Mängi noodid: G H null.<br>Mängi noodid: F A C.<br>Mängi noodid: A null null.<br>", s.writeOutLetters());
    }

}