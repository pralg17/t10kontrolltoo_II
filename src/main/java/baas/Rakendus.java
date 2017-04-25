public class Rakendus{
	public static void main(String[] arg){
		//toiduainete loomine
		ToiduAine t1 = new ToiduAine("Kartul",10, 30, 20);
		ToiduAine t2 = new ToiduAine("Hapukoor",20, 50, 10);
		ToiduAine t3 = new ToiduAine("Vorst",60, 30, 10);
		
		//toiduaine nimetus tuleb ToiduAine-st
		ToiduKomponent k1 = new ToiduKomponent();
		ToiduKomponent k2 = new ToiduKomponent();
		ToiduKomponent k3 = new ToiduKomponent();
	
		k1.kogus = 100;
		k2.kogus = 30;
		k3.kogus = 50;
		
		System.out.println("Toiduainete andmed: ");
		System.out.println(t1.nimetus + " [valke: " + t1.valgud + ", rasvu: " + t1.rasvad + ", susivesikuid: " + t1.susivesikud + "] - " + k1.kogus + " g");
		System.out.println(t2.nimetus + " [valke: " + t2.valgud + ", rasvu: " + t2.rasvad + ", susivesikuid: " + t2.susivesikud + "] - " + k2.kogus + " g");
		System.out.println(t3.nimetus + " [valke: " + t3.valgud + ", rasvu: " + t3.rasvad + ", susivesikuid: " + t3.susivesikud + "] - " + k3.kogus + " g");
		
		/*
		Toiduainete andmed:
		Kartul [valke: 10.0, rasvu: 30.0, susivesikuid: 20.0] - 100.0 g
		Hapukoor [valke: 20.0, rasvu: 50.0, susivesikuid: 10.0] - 30.0 g
		Vorst [valke: 60.0, rasvu: 30.0, susivesikuid: 10.0] - 50.0 g

		*/
		
		System.out.println("-----------------------------");
		
		k1.t=t1;
		k2.t=t2;
		k3.t=t3;
		
		System.out.println("Toidukomponentide rasvakogus: ");
		System.out.println(t1.nimetus + " - " + k1.RasvaKogus() + " g");
		System.out.println(t2.nimetus + " - " + k2.RasvaKogus() + " g");
		System.out.println(t3.nimetus + " - " + k3.RasvaKogus() + " g");
		
		/*
		Toidukomponentide rasvakogus:
		Kartul - 30.0 g
		Hapukoor - 15.0 g
		Vorst - 15.0 g
		*/
		
	}

}