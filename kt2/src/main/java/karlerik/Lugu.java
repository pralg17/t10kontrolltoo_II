package karlerik;

public class Lugu {
	
	String taktid = "";
	
	Kolmkola taktijada(Kolmkola takt, String kasNumbrites) {
		taktid += takt.toString(kasNumbrites);
		return null;
	}
	
	public String akordid() {
		return taktid;
	}
	
}