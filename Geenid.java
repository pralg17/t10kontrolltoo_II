public class Geenid{
	alleel Alleel1;
	alleel Alleel2;

public Geenid(alleel Alleel1, alleel Alleel2){
	this.Alleel1 = Alleel1;
	this.Alleel2 = Alleel2;
}

public boolean Test(){
	if (Alleel1.positiivne || Alleel2.positiivne){
		return true;
	}
	return false;
}

public static void main(String[] argumendid){
	alleel Alleel1 = new alleel("Nimetus1", true);
	alleel Alleel2 = new alleel("Nimetus2", true);
	alleel Alleel3 = new alleel("Nimetus3", false);
	Geenid geen1 = new Geenid (Alleel1, Alleel2);
	Geenid geen2 = new Geenid (Alleel1, Alleel3);
	Geenid geen3 = new Geenid (Alleel3, Alleel2);
	System.out.println(geen1.Test());
	System.out.println(geen2.Test());
	System.out.println(geen3.Test());
	}
}

