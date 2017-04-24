package thetloffline;

public class Geen {
	Alleel alleel1; //kas teha massiiv, et saaks lihtsamini juhusliku alleeli tagastada
	Alleel alleel2;
	boolean avaldub;

	boolean geeniV22rtus(Alleel alleel1, Alleel alleel2) {//kui mõlemad on false -> false
		if (alleel1.v22rtus == false && alleel2.v22rtus == false) {
			return avaldub == false;
		}
		else {
			return avaldub == true;
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