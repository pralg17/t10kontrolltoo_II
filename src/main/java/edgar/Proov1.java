import java.io.*;
import java.util.*;

public class Proov1{
	public static void main (String[] arg){
		Toituained t1 = new Toituained("Kartul", 2, 1, 10);
		Toituained t2 = new Toituained("Hapukoor", 1.2, 29, 8.1);
		Toituained t3 = new Toituained("Vorst", 13, 12, 4);
		
		Toitukomponendid k1 = new Toitukomponendid();
		k1.t=t1;
		k1.quantity = 100;
		
		Toitukomponendid k2 = new Toitukomponendid();
		k2.t = t2;
		k2.quantity = 30;
		
		Toitukomponendid k3 = new Toitukomponendid();
		k3.t = t3;
		k3.quantity = 50;
		
		
		System.out.println("Kartuli kogus: " + (k1.quantity));
		System.out.println("Kartuli rasvade kogus: "+ (k1.fatquantity()));
		System.out.println("Hapukoori kogus: " + (k2.quantity));
		System.out.println("Hapukoori rasvade kogus: " + (k2.fatquantity()));
		System.out.println("Vorsti kogus: " + (k3.quantity));
		System.out.println("Vorsti rasvade kogus: " + (k3.fatquantity()));
	}
	
	
}


/* Kartuli kogus: 100.0
Kartuli rasvade kogus: 1.0
Hapukoori kogus: 30.0
Hapukoori rasvade kogus: 8.7
Vorsti kogus: 50.0
Vorsti rasvade kogus: 6.0
/*