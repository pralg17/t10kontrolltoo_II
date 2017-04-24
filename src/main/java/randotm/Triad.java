package randotm;

import java.util.*;

public class Triad {

    int baseNote;
    String[] noteLetters = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"};
    int[] noteTones = {60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73};
    HashMap<Integer, String> notes = new HashMap<Integer, String>() {{
        for (int i=0;i<noteTones.length-1;i++) {
            put(noteTones[i], noteLetters[i]);
        }
        
    }};
    
    public Triad(int note) {
        this.baseNote = note;
    }

    public Triad(String letter) {

        HashMap<String, Integer> notes1 = new HashMap<String, Integer>();
        for (int i=0;i<noteLetters.length-1;i++) {
            notes1.put(noteLetters[i], noteTones[i]);
        }

        this.baseNote = notes1.get(letter);
    }

    public int base() {
        return baseNote;
    }

    public int bigTert() {
        return baseNote+4;
    }

    public int quint() {
        return baseNote+7;
    }

    public String noteLetter(int tone, HashMap tones) {
        return String.valueOf(tones.get(tone));
    }

    public String tonesToPlay() {
        return "Mängi toonid: " + String.valueOf(base()) + " " + String.valueOf(bigTert()) + " " + String.valueOf(quint()) + ".";
    }

    public String lettersToPlay() {
        return "Mängi noodid: " + noteLetter(base(), notes) + " " + noteLetter(bigTert(), notes) + " " + noteLetter(quint(), notes) + ".";
    }

}
