package karin;
import java.util.*; 

public class Rakendus{
	
	public static void main(String[] args){
		Kolmkõla helistik = new Kolmkõla(60);
		CKolmkõla c_duur = new CKolmkõla();
		FKolmkõla f_duur = new FKolmkõla();
		GKolmkõla g_duur = new GKolmkõla();
		
		//helistik numbrites
		System.out.println(helistik.toString());  //60, 64, 67
		System.out.println(c_duur.toString());  //60, 64, 67
		System.out.println(f_duur.toString());  //65, 69, 72
		System.out.println(g_duur.toString());  //67, 71, 74
		
		//täht <-> number
		Kolmkõla helistik2 = new Kolmkõla(67);
		System.out.println(helistik2.noodinumbriks("f"));   //65
		System.out.println(helistik2.nooditäheks(67));      //G
		System.out.println(helistik2.noodinumbriks("C#"));  //61
		
		//helistik nootidega
		System.out.println(helistik.toString2()); //C, E, G
		System.out.println(c_duur.toString2()); //C, E, G
		System.out.println(f_duur.toString2());//F, A, C
		System.out.println(g_duur.toString2());  //G, H, D
		
		//lugu
		Kolmkõla[] eksemplarid = new Kolmkõla[3];
		eksemplarid[0]= new Kolmkõla("F");
		eksemplarid[1] = new Kolmkõla("c");
		eksemplarid[2] = new Kolmkõla("G#");
		Lugu lugu1 = new Lugu(eksemplarid);
		//lugu1.midi = false;
		System.out.println(lugu1.noodid());
		System.out.println(lugu1.midi);
				
		String kolmk6laT2hed = "c, c# ,d ,g#";
		String[] sisestused = kolmk6laT2hed.split(",");
		Kolmkõla[] e = new Kolmkõla[sisestused.length];
		for(int i = 0; i < sisestused.length; i++){
			e[i]= new Kolmkõla(sisestused[i].trim());
		}
		Lugu lugu = new Lugu(e);
		lugu.midi = false;
		System.out.println(lugu.noodid());
	
		
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/akordid-1.0-SNAPSHOT.jar



		


