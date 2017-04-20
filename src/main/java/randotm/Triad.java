package randotm;

public class Triad {

    int baseNote;
    
    public Triad(int note) {
        this.baseNote = note;

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

}
