import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proov1{
	
	Jogi jogi1;
	Jogi jogi2;

public Proov1(Jogi jogi1, Jogi jogi2){
	this.jogi1 = jogi1;
	this.jogi2 = jogi2;
}
	
public static void main(String[] argumendid) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Jogi jogi1 = new Jogi("Suur-jogi", 500, 800, null, 200);
		Jogi jogi2 = new Jogi("Vaike-jogi", 120, 400, "Suur-jogi", 150);
		
		/*
		System.out.println("Esimene joi on " + jogi1.nimetus);
		System.out.println("Teine jogi on " + jogi2.nimetus);
		
		Esimene jqgi on Suur-jogi
		Teine jqgi on Vaike-jogi
		*/
		
	System.out.println("Kui te soovite alustada teed merre Suur-joest, sisestage 1");
	System.out.println("Kui te soovite alustada teed merre Vaike-joest, sisestage 2");
	System.out.println("Kui te soovite alustada teed kohast, kus yks joe vallab teisele, sisestage 3");
	String a = reader.readLine();
	int b = Integer.parseInt(a);
	
		if (b == 1){
			System.out.println("Jogi voolab labi " + jogi1.nimetus + " ning labi " + jogi2.nimetus + ".");
		} else if (b == 2) {
			System.out.println("Jogi voolab labi " + jogi2.nimetus + " ning labi " + jogi1.nimetus + ".");
		} else if (b == 3){
			System.out.println("Jogi voolab labi " + jogi1.nimetus + ".");
		} else {
			System.out.println("Tee sisestasite vale numbri!");
		}
	
	}	
}

/* Kui 1:
Jogi voolab labi Suur-jogi ning labi Vaike-jogi.
Kui 2:
Jogi voolab labi Vaike-jogi ning labi Suur-jogi.
Kui 3:

*/