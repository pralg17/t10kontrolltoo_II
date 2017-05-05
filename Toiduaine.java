public class Toiduaine{

	String toiduaine_nimetus;
	double valkude_protsent;
	double rasvade_protsent;
	double sysivesikute_protsent;

	public Toiduaine(String toiduaine_nimetus, double valkude_protsent, double rasvade_protsent, double sysivesikute_protsent){


		this.toiduaine_nimetus = toiduaine_nimetus;
		this.valkude_protsent = valkude_protsent;
		this.rasvade_protsent = rasvade_protsent;
		this.sysivesikute_protsent = sysivesikute_protsent;

		if(toiduaine_nimetus == null || toiduaine_nimetus.length() == 0){
			throw new RuntimeException("VIGA andmetes: Toiduaine nimetus puudub");
		}

		if(valkude_protsent + rasvade_protsent + sysivesikute_protsent > 100){
			throw new RuntimeException("VIGA andmetes: Kogu protsent ei saa olla suurem, kui 100");
		}


		}

		}
