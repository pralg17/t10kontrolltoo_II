import java.io.*;
import java.util.*;

public class Proov1{
    public static void main(String[] arg){
        Toiduained t1= new Toiduained("kartul", 1.71, 0, 20.1);
        Toiduained t2= new Toiduained("hapukoor", 2.8, 20, 3.2);
        Toiduained t3= new Toiduained("vorst", 12, 19, 4);

		Toidukomponendid k1 = new Toidukomponendid();
		k1.t = t1;
		k1.kogus = 100;

		Toidukomponendid k2 = new Toidukomponendid();
		k2.t = t2;
		k2.kogus = 30;

		Toidukomponendid k3 = new Toidukomponendid();
		k3.t = t3;
		k3.kogus = 50;

		System.out.println("Kartuli kogus grammides on: "+(k1.kogus));
		System.out.println("Hapukoore kogus grammides on: "+(k2.kogus));
		System.out.println("Vorsti kogus grammides on: "+(k3.kogus));

    System.out.println();

    System.out.println("Rasvakogus kartulis on: "+(k1.rasvakogus()));
    System.out.println("Rasvakogus hapukoores on: "+(k2.rasvakogus()));
    System.out.println("Rasvakogus vorstis on: "+(k3.rasvakogus()));



    }
}

/* Tulemus:

Kartuli kogus grammides on: 100.0
Hapukoore kogus grammides on: 30.0
Vorsti kogus grammides on: 50.0

Rasvakogus kartulis on: 0.0
Rasvakogus hapukoores on: 6.0
Rasvakogus vorstis on: 9.5

*/
