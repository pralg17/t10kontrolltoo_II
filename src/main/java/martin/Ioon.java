package martin;

public class Ioon implements IoonName{
	public String nimetus(){
		return nimetus;
	}
	public String laeng(){
		return laeng;
	}
	public int aatommasside_summa(){
		return aatommasside_summa;
	}
	
	String nimetus;
	String laeng;
	int aatommasside_summa;
	
	public Ioon(String nimetus, int aatommasside_summa, String laeng){
		this.nimetus=nimetus;
		this.laeng=laeng;
		this.aatommasside_summa=aatommasside_summa;
	}
	
}