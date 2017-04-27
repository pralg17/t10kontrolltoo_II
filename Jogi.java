public class Jogi {
	String nim;
	double pikk;
	double vool;
	String siht;
	double suubum;
	double koos;
	
	public Jogi(String nimi, double pikkus, double vooluhulk, String sihtjogi, double suubumisKm, double koosSuubutavaga) {
		nim=nimi;
		pikk=pikkus; 
		vool=vooluhulk;
		siht=sihtjogi;
		suubum=suubumisKm;
		koos=koosSuubutavaga;
	}
	
	public String getNimi() {
		return nim;
	}
	
	public double GetPikkus() {
		return pikk;
	}
	
	public double pikkusKokku() {
		return pikk + koos;
	}
	
	
	public String toString() {
		
		if (siht==null) {
			return "Jõe '" + nim +  "' pikkus on " + GetPikkus() + "km ja see suubub merre";
		}
		
		
		return "Jõe '" + nim +  "' pikkus on " + GetPikkus() + "km ja see suubub jõkke '" + siht + "', pikkus kokku " + pikkusKokku();
	}
}