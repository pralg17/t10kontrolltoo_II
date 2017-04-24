package karlerik;

public class Kolmkola {
	
	int pohitoon;
	
	public Kolmkola(int pohitoon) {
		this.pohitoon = pohitoon;
	}
	
	public String toString() {
		return leiaNoodiArvudArvudest();
	}
	
	
	
	
	// ette on antud arvud
	
	public String leiaNoodiArvudArvudest() {
		int suurTerts = pohitoon + 4;
		int kvint = pohitoon + 7;
		String html = "<br>";
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurTerts) + " " + String.valueOf(kvint) + html;
	}
	
	
	
}