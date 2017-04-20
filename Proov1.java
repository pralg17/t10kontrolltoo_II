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
		k1.kogus = 30;
		
		Toidukomponendid k3 = new Toidukomponendid();
		k3.t = t3;
		k3.kogus = 50;
		
		System.out.println(k1.kogus);
		System.out.println(k2.kogus);
		System.out.println(k3.kogus);

		
    }
}
