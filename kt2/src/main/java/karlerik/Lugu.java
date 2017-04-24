package karlerik;

public class Lugu {
	
	String taktid = "";
	
	Kolmkola taktijada(Kolmkola takt) {
		taktid += takt.toString();
		return null;
	}
	
	public String akordid() {
		return taktid;
	}
	
}