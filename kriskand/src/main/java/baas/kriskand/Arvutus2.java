package baas.kriskand;

public class Arvutus2 implements Funktsioon{
	double x;
	double b;
	
	public Arvutus2(double x, double b){
		this.x = x;
		this.b = b;
	}
	
	public double f(double k){
		return k*x+b;
	}
}