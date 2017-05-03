package thetloffline;

public class Geen {
	private Alleel alleel1;
	private Alleel alleel2;

	public Geen(Alleel alleel1, Alleel alleel2) {
		this.alleel1 = alleel1;
		this.alleel2 = alleel2;
	}

	public Geen(){}

	boolean geeniV22rtus() {
		if (alleel1.v22rtus == false && alleel2.v22rtus == false) {
			return false;
		} else {
			return true;
		}
	}

	Alleel getRandomAlleel() {
	 if (Math.random() > 0.5) {
            return alleel1;
        } else {
            return alleel2;
        }
 	}

}