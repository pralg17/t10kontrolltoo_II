package jaagup;

public class JoonAction2 implements Joon{
	double c;
	double vaba;
	double igrek;
	public JoonAction2(double c, double vaba){
		this.c=c;
		this.vaba=vaba;
	}
	
	@Override
	public double leiaY(double x){
		igrek = c*x+vaba;
		return igrek;
	}
}