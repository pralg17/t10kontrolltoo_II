package mattias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class Rakendus{	
	
	//KOOLI ARVUTIS:
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=c
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=f
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=g

	
	@RequestMapping("/kolmkola")
	String kolmkola(String pohitoon){
		//peab oleama IF lauses EQUALS, muidu ei tööta
		//VÕIB ANDA ERALDI TAKTIDE AKORDITÄHED
		if(pohitoon.equals("c")){
			//return "Põhitoon on: " + pohitoon;
			//Kolmkõla peab olema SUURE ALGUSTÄHEGA
			Kolmkola noot = new CKolmkola();
			return "Mängitavad noodid akordiga c on: "+noot.vastus();
		} else if(pohitoon.equals("f")){
			Kolmkola noot = new FKolmkola();
			return "Mängitavad noodid akordiga f on: "+noot.vastus();
		} else if(pohitoon.equals("g")){
			Kolmkola noot = new GKolmkola();
			return "Mängitavad noodid akordiga g on: "+noot.vastus();
		//Else peab olema, juhuks, kui if lause ei ole tõene
		} else {
			return "See ei ole akordtäht. Peab sisestama akordi c, g või f.";
		}
	}
	
	
	//http://greeny.cs.tlu.ee:4207/kolmkola2?akordid=cfg&kuidas=arv
	//http://greeny.cs.tlu.ee:4207/kolmkola2?akordid=cfg&kuidas=täht
	@RequestMapping("/kolmkola2")
	String kolmkola2(String akordid, String kuidas){
		
		Lugu song = new Lugu();
		String eraldiakord = "";
		
		//TÜKELDAN
		for(int i=0; i<akordid.length();i++){
			eraldiakord = akordid.substring(i, i+1);
			if(eraldiakord.equals("c")){
				Kolmkola akord = new CKolmkola();
				Kolmkola lootakt = song.taktirida(akord, kuidas);
			} 
			if(eraldiakord.equals("f")){
				Kolmkola akord = new FKolmkola();
				Kolmkola lootakt = song.taktirida(akord, kuidas);
			}
			if(eraldiakord.equals("g")){
				Kolmkola akord = new GKolmkola();
				Kolmkola lootakt = song.taktirida(akord, kuidas);
			}
		}
		return song.akordid();
	}
	
	
	public static void main(String[] args){
		System.getProperties().put("server.port", 4207);
		SpringApplication.run(Rakendus.class, args);
	}
}