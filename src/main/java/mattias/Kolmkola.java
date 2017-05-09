package mattias;

public class Kolmkola{
	
	//Mazoorkolmkõla nootide arvutamine
	
	int pohitoon, i;
	String pohitoonTaht;
	String[] helikorgusTahed = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"};
	int[] helikorgusNumber = {60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84};
	
	
	public Kolmkola(int pohitoon){
		this.pohitoon = pohitoon;
	}
	
	public Kolmkola(String pohitoonTaht){
		this.pohitoonTaht = pohitoonTaht.toUpperCase();
	}
	
	public String vastus(){
		
		int suurterts = pohitoon + 4;
		int kvint = pohitoon + 7;
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurterts) + " " + String.valueOf(kvint);
	}
	
	public String vastus2(String kuidas){
		if(kuidas.equals("arv")){
			return noodiNumberTahest();
		} else if(kuidas.equals("täht")){
			return noodiTahtTahest();
		} else {
			return "?";
		}
	}
	
	//SISESTAN TÄHE JA SAAN NUMBRID
	public String noodiNumberTahest(){
		
		for(i=0; i<helikorgusTahed.length; i++){
			if(helikorgusTahed[i].equals(pohitoonTaht)){
				pohitoon = helikorgusNumber[i];
			}
		}
		
		int suurterts = pohitoon + 4;
		int kvint = pohitoon + 7;
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurterts) + " " + String.valueOf(kvint);
	}
	
	//SISESTAN NUMBRI JA SAAN TÄHED
	public String noodiTahtNumbrist(){
		
		String suurtertsTaht = "";
		String kvintTaht = "";
		
		for(i=0; i<helikorgusNumber.length; i++){
			if(helikorgusNumber[i] == pohitoon){
				pohitoonTaht = helikorgusTahed[i];
				suurtertsTaht = helikorgusTahed[i+4];
				kvintTaht = helikorgusTahed[i+7];
			}
		}
		return pohitoonTaht + " " + suurtertsTaht + " " + kvintTaht;
	}
	//SISESTAN TÄHE JA SAAN TÄHED
	public String noodiTahtTahest(){
		
		String suurtertsTaht = "";
		String kvintTaht = "";
		
		for(i=0; i<helikorgusTahed.length; i++){
			if(helikorgusTahed[i].equals(pohitoonTaht)){
				pohitoonTaht = helikorgusTahed[i];
				suurtertsTaht = helikorgusTahed[i+4];
				kvintTaht = helikorgusTahed[i+7];
			}
		}
		return pohitoonTaht + " " + suurtertsTaht + " " + kvintTaht;
	}
}