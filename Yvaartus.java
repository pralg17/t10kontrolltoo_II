public class Yvaartus implements Funktsioon{
	double Xvaartus;
	public Yvaartus(double Xvaartus){
		this.Xvaartus=Xvaartus;
	}
	public double f(double x){
		return x*Xvaartus;
	}
}