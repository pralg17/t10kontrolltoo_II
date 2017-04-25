public class Jogi{
	
	String nimetus; //Jqe nimetus
	double pikkus; // (km)
	double vool; // (l/s) potok v reke
	String sihtkoht; // Kui jogi jquab mereni siis tema vaartis on NULL
	double lqpmatus; // jqgi lqpmatu koht, kuhu ta suudub
	
	public Jogi(String nimetus, double pikkus, double vool, String sihtkoht, double lqpmatus){
		
		if( nimetus == null || nimetus.length() == 0 ) {
			throw new RuntimeException("Joe nimetus puudub!");
		}
		
		this.nimetus = nimetus;
		this.pikkus = pikkus;
		this.vool = vool;
		this.sihtkoht = sihtkoht;
		this.lqpmatus = lqpmatus;
		
		if(sihtkoht == null || sihtkoht.length() == 0 ){
			throw new RuntimeException("Joe on saabuv mere otsa");
		}
	
	}
}