
public class Toiduained{
	String nimetus;
	double rasvaprotsent;
	double valguprotsent;
	double sysivesikuteprotsent;
	public Toiduained(String nimetus, double rasvaprotsent, double valguprotsent, double sysivesikuteprotsent){
		if(rasvaprotsent+valguprotsent+sysivesikuteprotsent>100){
			throw new RuntimeException("protsent yle 100%!");
		}
		this.nimetus=nimetus;
		this.rasvaprotsent=rasvaprotsent;
		this.valguprotsent=valguprotsent;
		this.sysivesikuteprotsent=sysivesikuteprotsent;
	}

}
