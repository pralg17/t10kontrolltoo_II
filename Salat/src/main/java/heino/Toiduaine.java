
//package ee.tlu.if16.jaagup;
public class Toiduaine{

			String toiduaine_nimetus;
			double valgud_protsent;
			double rasvad_protsent;
			double sysivesikud_protsent;

	public Toiduaine(String toiduaine_nimetus, double valgud_protsent, double rasvad_protsent, double sysivesikud_protsent){

				this.toiduaine_nimetus = toiduaine_nimetus;
				this.valgud_protsent = valgud_protsent;
				this.rasvad_protsent = rasvad_protsent;
				this.sysivesikud_protsent = sysivesikud_protsent;

					if(toiduaine_nimetus == null || toiduaine_nimetus.length() == 0){
						throw new RuntimeException("VIGA andmetes: Toiduaine nimetus puudub");
					}

					if(valgud_protsent + rasvad_protsent + sysivesikud_protsent > 100){
						throw new RuntimeException("VIGA andmetes: Kogu protsent ei saa olla suurem, kui 100");
					}


		  }

		}
