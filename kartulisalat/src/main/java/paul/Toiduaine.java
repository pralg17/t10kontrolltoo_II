public class Toiduaine{
	
	String nimetus;
	double valgud;
	double rasvad;
	double sysivesikud;
	
	public Toiduaine(String nimetus,
	double valgud,
	double rasvad,
	double sysivesikud){
		
		if(valgud+rasvad+sysivesikud>100){
			throw new RuntimeException("Viga, üle 100%");
		}
		this.nimetus=nimetus; 
		this.valgud=valgud;
		this.rasvad=rasvad;
		this.sysivesikud=sysivesikud;
	}
	
}