package jan;


public class Kolmk6la{
	
	int p6hitoon;
	
	public Kolmk6la(int p6hitoon){
		this.p6hitoon = p6hitoon;
	}
	
	public String toString(){
		return NoodiArvudArvudest();
	}
	
	
	public String NoodiArvudArvudest(){
		int suurTerts = p6hitoon + 4;
		int kvint = p6hitoon + 7;
		String html = "<br>";
		
		return String.valueOf(p6hitoon) + " " + String.valueOf(suurTerts) + " " + String.valueOf(kvint) + html;
	}
}

