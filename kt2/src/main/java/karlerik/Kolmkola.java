package karlerik;

public class Kolmkola {
	
	int pohitoon;
	String pohitoonTahena;
	
	int[] pohitoonidMassiivNumbrid = {60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72};
	String[] pohitoonidMassiivTahed = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C"};
	
	
	//konstruktorid
	public Kolmkola(int pohitoon) {
		this.pohitoon = pohitoon;
	}
	
	public Kolmkola(String pohitoonTahena) {
		this.pohitoonTahena = pohitoonTahena.toUpperCase();
	}
	
	
	//toString funktsioonid
	public String toString() {
		return leiaNoodiArvudArvudest();
	}
	
	public String toString(String kasNumbrites) {
		if(kasNumbrites.equals("0")) {
			return leiaNoodiTahedArvudest();
			
		} else {
			return leiaNoodiArvudArvudest();
		}
	}
	
	public String toString2(String kasNumbrites) {
		if(kasNumbrites.equals("0")) {
			return leiaNoodiTahedTahest();
			
		} else {
			return leiaNoodiArvudTahest();
		}
	}
	
	
	
	
	//ette on antud arv
	public String leiaNoodiArvudArvudest() {
		int suurTerts = pohitoon + 4;
		int kvint = pohitoon + 7;
		String html = "<br>";
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurTerts) + " " + String.valueOf(kvint) + html;
	}
	
	public String leiaNoodiTahedArvudest() {
		String pohitooniTaht = null;
		String suurTertsTaht = null;
		String kvintTaht = null;
		String html = "<br>";
		
		for(int i = 0; i < pohitoonidMassiivNumbrid.length; i++) {
			
			if(pohitoonidMassiivNumbrid[i] == pohitoon) {
				pohitooniTaht = pohitoonidMassiivTahed[i];
				
				if(i > 5) {
					kvintTaht = pohitoonidMassiivTahed[7-(12-i)];
					
					if(i > 8) {
						suurTertsTaht = pohitoonidMassiivTahed[4-(12-i)];
					} else {
						suurTertsTaht = pohitoonidMassiivTahed[i+4];
					}
				} else {
					suurTertsTaht = pohitoonidMassiivTahed[i+4];
					kvintTaht = pohitoonidMassiivTahed[i+7];
				}
				break;
			}
		}
		return pohitooniTaht + " " + suurTertsTaht + " " + kvintTaht + html;
	}
	
	//ette on antud taht
	public String leiaNoodiArvudTahest() {
		int pohitoon = 0;
		int suurTerts = 0;
		int kvint = 0;
		String html = "<br>";
		
		for(int i = 0; i < pohitoonidMassiivTahed.length; i++) {
			
			if(pohitoonidMassiivTahed[i].equals(pohitoonTahena)) {
				pohitoon = pohitoonidMassiivNumbrid[i];
				
				if(i > 5) {
					kvint = pohitoonidMassiivNumbrid[7-(12-i)];
					
					if(i > 8) {
						suurTerts = pohitoonidMassiivNumbrid[4-(12-i)];
					} else {
						suurTerts = pohitoonidMassiivNumbrid[i+4];
					}
				} else {
					suurTerts = pohitoonidMassiivNumbrid[i+4];
					kvint = pohitoonidMassiivNumbrid[i+7];
				}
				break;
			}
		}
		return String.valueOf(pohitoon) + " " + String.valueOf(suurTerts) + " " + String.valueOf(kvint) + html;
	}
	
	public String leiaNoodiTahedTahest() {
		String pohitooniTaht = null;
		String suurTertsTaht = null;
		String kvintTaht = null;
		String html = "<br>";
		
		for(int i = 0; i < pohitoonidMassiivTahed.length; i++) {
			
			if(pohitoonidMassiivTahed[i].equals(pohitoonTahena)) {
				pohitooniTaht = pohitoonidMassiivTahed[i];
				
				if(i > 5) {
					kvintTaht = pohitoonidMassiivTahed[7-(12-i)];
					
					if(i > 8) {
						suurTertsTaht = pohitoonidMassiivTahed[4-(12-i)];
					} else {
						suurTertsTaht = pohitoonidMassiivTahed[i+4];
					}
				} else {
					suurTertsTaht = pohitoonidMassiivTahed[i+4];
					kvintTaht = pohitoonidMassiivTahed[i+7];
				}
				break;
			}
		}
		return pohitooniTaht + " " + suurTertsTaht + " " + kvintTaht + html;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}