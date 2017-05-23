package rihard;

public class Joonefunktsioon2 implements JooneVorrand2{
	
	double kordaja;
	double a;
	
	public Joonefunktsioon2(double kordaja, double a){
		
		this.kordaja=kordaja;
		this.a=a;
		
	}
	
	public double f(double x, double a){
		
		return ((x*kordaja)+a);
		
	}
	
}