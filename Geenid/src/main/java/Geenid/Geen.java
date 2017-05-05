package Geenid;

public class Geen{
	Alleel Alleel1;
	Alleel Alleel2;

public Geen(Alleel Alleel1, Alleel Alleel2){
	this.Alleel1 = Alleel1;
	this.Alleel2 = Alleel2;
}

public boolean test(){
	if (Alleel1.onPositiivne || Alleel2.onPositiivne){
		return true;
	}
	return false;
}

public static void main(String[] argumendid){
	Alleel esimenealleel = new Alleel("Nimetus1", true);
	Alleel teinealleel = new Alleel("Nimetus2", false);
	Alleel kolmasalleel = new Alleel("Nimetus3", false);
	Geen esimenegeen = new Geen (esimenealleel, teinealleel);
	Geen teinegeen = new Geen (esimenealleel, kolmasalleel);
	Geen kolmasgeen = new Geen (kolmasalleel, teinealleel);
	System.out.println(esimenegeen.test());
	System.out.println(teinegeen.test());
	System.out.println(kolmasgeen.test());
	}
}

