public class ToiduAine{
	String nimetus;
	
	// %-des
	double valgud;
	double rasvad;
	double susivesikud;
	
	public ToiduAine(String nimetus, double valgud, double rasvad, double susivesikud){
		//kontroll kas % on yle 100
		if(valgud + rasvad + susivesikud > 100){
			throw new RuntimeException("Koostisosade protsent ei saa olla suurem kui 100%");
		}	
		
		//this - current object
		this.nimetus=nimetus; 
		this.valgud=valgud;
		this.rasvad=rasvad;
		this.susivesikud=susivesikud;
	}

}