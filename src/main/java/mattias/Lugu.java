package mattias;

public class Lugu {
	
	String taktid = ""; 
	
	Kolmkola taktirida(Kolmkola takt, String kuidas){
		//NII TÖÖTAB
		taktid = taktid + takt.vastus2(kuidas);
		return null;	
	}
	
	public String akordid(){
		return taktid;
	}
}