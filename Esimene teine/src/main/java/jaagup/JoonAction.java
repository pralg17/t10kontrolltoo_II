package jaagup;


public class JoonAction implements Joon{
	double summa;
	double c;
	public JoonAction(double c){
		this.c=c;
	}
	
	@Override
	public double leiaY(double x){
		summa = x*c; //y=3x
		return summa;
	}
	
	
}