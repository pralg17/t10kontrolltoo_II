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
		Alleel aleel1 = new Alleel("Esimine", false);
		Alleel aleel2 = new Alleel("Esimene", true);
		Geen geen1 = new Geen(aleel1,aleel2);
		Geen geen2 = new Geen(aleel1,aleel1);
		System.out.println(geen1.Kontroll());
		System.out.println(geen2.Kontroll());
		System.out.println(geen1.RandomGeen(geen1, geen2));
	}	
	public Alleel AlRng(){
        if(Math.random() < 0.51){
			return alleel1;
		}
		else{
			return alleel2;
		}
	}
	public Geen RandomGeen(Geen geen1, Geen geen2){
        System.out.println(geen1.AlRng().onPositiivne()+" " + geen2.AlRng().onPositiivne());
		return new Geen geenrambo;
    }


}

