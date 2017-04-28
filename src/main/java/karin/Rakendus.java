package karin;
import java.util.*; 

public class Rakendus{
	
	public static void main(String[] args){
		Kolmkõla helistik = new Kolmkõla(60);
		CKolmkõla c_duur = new CKolmkõla();
		FKolmkõla f_duur = new FKolmkõla();
		GKolmkõla g_duur = new GKolmkõla();
		
		//helistik numbrites
		System.out.println(Arrays.toString(helistik.helistikNumbrites()));  //[60, 64, 67]
		System.out.println(Arrays.toString(c_duur.helistikNumbrites()));  //[60, 64, 67]
		System.out.println(Arrays.toString(f_duur.helistikNumbrites()));  //[65, 69, 72]
		System.out.println(Arrays.toString(g_duur.helistikNumbrites()));  //[67, 71, 74]
		
		//täht <-> number
		Kolmkõla helistik2 = new Kolmkõla(67);
		System.out.println(helistik2.noodinumbriks("f"));   //65
		System.out.println(helistik2.nooditäheks(67));      //G
		System.out.println(helistik2.noodinumbriks("C#"));  //61
		
		//helistik nootidega
		System.out.println(Arrays.toString(helistik.helistikNootides())); //[C, E, G]
		System.out.println(Arrays.toString(c_duur.helistikNootides())); //[C, E, G]
		System.out.println(Arrays.toString(f_duur.helistikNootides())); //[F, A, C]
		System.out.println(Arrays.toString(g_duur.helistikNootides())); //[G, H, D]
		
		
		
		
		
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/akordid-1.0-SNAPSHOT.jar



