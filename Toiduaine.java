public class Toiduaine{
	
	String nimetus;
	double valkude_p;
	double rasvade_p;
	double sysivesikute_p;
	
	
	public Toiduaine(String nimetus, double valkude_p, double rasvade_p, double sysivesikute_p){
		
		if(nimetus == null || nimetus.length() == 0){
			throw new RuntimeException("Toiduaine nimetus puudub");
		}
		
		this.nimetus = nimetus;
		this.valkude_p = valkude_p;
		this.rasvade_p = rasvade_p;
		this.sysivesikute_p = sysivesikute_p;
		
		if(valkude_p + rasvade_p + sysivesikute_p > 100){
			throw new RuntimeException("Protsent ei saa ületada arvu 100");
		}
		
	}
	
}