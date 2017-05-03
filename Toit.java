public class Toit{
	
	String nimetus;
	Toidukomponent k;
	double rasvakogus;
	double valkudekogus;
	double sysivesikutekogus;
	
	public Toit(String nimetus, Toidukomponent k){
		
		this.nimetus = nimetus;
		this.k = k;
		this.rasvakogus = k.rasvakogus();
		this.valkudekogus = k.valkudekogus();
		this.sysivesikutekogus = k.sysivesikutekogus();
		
	}
	
	
	
}