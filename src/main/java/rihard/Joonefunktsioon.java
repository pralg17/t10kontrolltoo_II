package rihard;

public class Joonefunktsioon implements JooneVorrand{
	
	double kordaja;
	
	public Joonefunktsioon(double kordaja){
		
		this.kordaja=kordaja;
		
	}
	
	public double f(double x){
		
		return (x*kordaja);
		
	}
	
}