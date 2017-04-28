package mart;

public class Geen{
	public Alleel alleel1;
	public Alleel alleel2;
	
	public Geen(Alleel alleel1,Alleel alleel2){
		this.alleel1 = alleel1;
		this.alleel2 = alleel2;
	}
	public boolean Kontroll(){
		if(alleel1.onPositiivne() || alleel2.onPositiivne()){
			return true;
		}
		else{
		return false;
		}
	}
	public static void main(String argumendid[]){
		Alleel al1 = new Alleel("Esimine", false);
		Alleel al2 = new Alleel("Teine", true);
		Alleel al3 = new Alleel("Kolmas", false);
		Geen geen1 = new Geen(al1,al2);
		Geen geen2 = new Geen(al3,al2);
		Geen geen3 = new Geen(al1,al3);
		System.out.println(geen1.Kontroll());
		System.out.println(geen2.Kontroll());
		System.out.println(geen3.Kontroll());
	}	
}
