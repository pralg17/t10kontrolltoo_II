public class ristkylik{
	double a, b;
	public ristkylik(double pikkus, double laius){
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius<=0){throw new RuntimeException("Sobimatu laius");}
		a=pikkus;
		b=laius;
	}
	public double pindala(){
		return a*b;
	}
	public double ymbermoot(){
		return 2*(a+b);
	}
	public String toString(){
		return "Ristkylik "+a+"x"+b+", ymbermoot"+ymbermoot()+"m, pindala "+pindala()+" ruutmeetrit.";
	}
}