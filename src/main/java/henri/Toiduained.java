public class Toiduained{
	
	String nimetus;
	double valkudeProtsent;
	double rasvadeProtsent;
	double sysivesikuteProtsent;
	
	public Toiduained(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent){
		
		if(valkudeProtsent+rasvadeProtsent+sysivesikuteProtsent>100){
			throw new RuntimeException("Ei saa uletada 100%");
		}

		this.nimetus=nimetus; 
		this.valkudeProtsent=valkudeProtsent;
		this.rasvadeProtsent=rasvadeProtsent;
		this.sysivesikuteProtsent=sysivesikuteProtsent;
	}
	
}