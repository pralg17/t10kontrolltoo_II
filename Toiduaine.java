public class Toiduaine{
	String nimetus;
	double rasvaprotsent;
	double valguprotsent;
	double sysivesikuteprotsent;
	public Toiduaine(String nimetus, double rasvaprotsent, double valguprotsent, double sysivesikuteprotsent){
		if(rasvaprotsent+valguprotsent+sysivesikuteprotsent>100){
			throw new RuntimeException("Protsent ei saa olla suurem kui 100 ");
		}
		this.nimetus=nimetus; 
		this.rasvaprotsent=rasvaprotsent;
		this.valguprotsent=valguprotsent;
		this.sysivesikuteprotsent=sysivesikuteprotsent;
	}

}