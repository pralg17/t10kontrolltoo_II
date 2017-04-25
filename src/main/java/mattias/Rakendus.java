package mattias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class Rakendus{	
	
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=c
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=f
	//http://greeny.cs.tlu.ee:4207/kolmkola?pohitoon=g
	
	@RequestMapping("/kolmkola")
	String kolmkola(String pohitoon){
		//TEST---> return "Põhitoon on: " + pohitoon;
		
		//if(pohitoon == "c"){
		//peab oleama IF lauses EQUALS, muidu ei tööta
		//VÕIB ANDA ERALDI TAKTIDE AKORDITÄHED
		if(pohitoon.equals("c")){
			
			//return "Põhitoon on: " + pohitoon;
			//Kolmkõla peab olema SUURE ALGUSTÄHEGA
			Kolmkola noot = new CKolmkola();
			return "Mängitavad noodid akordiga c on: "+noot.vastus();
		
		} else if (pohitoon.equals("f")){
			
			//return "Põhitoon on: " + pohitoon;
			Kolmkola noot = new FKolmkola();
			return "Mängitavad noodid akordiga f on: "+noot.vastus();
			
		} else if (pohitoon.equals("g")){
			
			//return "Põhitoon on: " + pohitoon;
			Kolmkola noot = new GKolmkola();
			return "Mängitavad noodid akordiga g on: "+noot.vastus();
			
		//Else peab olema, juhuks, kui if lause ei ole tõene
		} else {
			return "See ei ole akordtäht. Peab sisestama akordi c, g või f.";
		}
	}
	
	public static void main(String[] args){
		System.getProperties().put("server.port", 4207);
		SpringApplication.run(Rakendus.class, args);
	}
}