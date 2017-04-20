package thetloffline;

public class Geen {
	Alleel alleel1;
	Alleel alleel2;
	boolean avaldub;

	boolean geeniV22rtus() {//kui mõlemad on false -> false
		if (alleel1.v22rtus == false && alleel2.v22rtus == false) {
			return avaldub == false;
		}
		else {
			return avaldub == true;
		}

	}

}