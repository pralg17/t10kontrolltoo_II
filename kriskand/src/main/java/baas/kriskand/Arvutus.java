package baas.kriskand;
public class Arvutus implements Funktsioon{
	double x;
	
	public Arvutus(double x){
		this.x=x;
	}
	
	public double f(double k){
		return k*x;
	}
}
