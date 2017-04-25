package baas;

public class Geen{
	public Alleel alleel1;
	public Alleel alleel2;

	public Geen(Alleel alleel1, Alleel alleel2){
		super();
		this.alleel1 = alleel1;
		this.alleel2 = alleel2;
	}

	public boolean Kontroll(){
		if(alleel1.isPositiivne() && alleel2.isPositiivne()){
			return true;
		}
		return false;

	}

	public static void main(String[] args){
		Alleel a1 = new Alleel("Nimetus1", true);
		Alleel a2 = new Alleel("Nimetus2", true);
		Alleel a3 = new Alleel("Nimetus3", false);
		Geen geen1 = new Geen(a1, a2);
		Geen geen2 = new Geen(a1, a3);
		System.out.println(geen1.Kontroll());
		System.out.println(geen2.Kontroll());
	}

}
