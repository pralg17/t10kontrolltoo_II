package karlerik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Kasutus {
	
	//yhe noodi kaupa
	@RequestMapping("/kolmkolad")
	String kolmkolad(String pohitoon) {
		
		if(pohitoon.equals("c")) {
			Kolmkola noot = new CKolmkola();
			return noot.toString();
		}
		
		if(pohitoon.equals("f")) {
			Kolmkola noot = new FKolmkola();
			return noot.toString();
		}
		
		if(pohitoon.equals("g")) {
			Kolmkola noot = new GKolmkola();
			return noot.toString();
		}
		return "Sisesta C, F, G";
	}
	
	//stringina
	@RequestMapping("/kolmkolaAkordid")
	String kolmkolaAkordid(String pohitoonid) {
		
		String akordideString = "";
		String akordJadast = "";
		
		for(int i = 0; i < pohitoonid.length(); i++) {
			
			akordJadast = pohitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmkola noot = new CKolmkola();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("f")) {
				Kolmkola noot = new FKolmkola();
				akordideString += noot.toString();
			}
			
			if(akordJadast.equals("g")) {
				Kolmkola noot = new GKolmkola();
				akordideString += noot.toString();
			}
			
			if(!akordJadast.equals("c") && !akordJadast.equals("f") && !akordJadast.equals("g")) {
				akordideString += "Akordi " + akordJadast.toUpperCase() + " ei saa kuvada<br>";
			}
		}
		return akordideString;
	}
	
	//kas kuvada numbrite voi tahtedena ette antud
	@RequestMapping("/kolmkolaAkordid2")
	String kolmkolaAkordid2(String kasNumbrites, String pohitoon) {
		
		if(pohitoon.equals("c")) {
			Kolmkola noot = new CKolmkola();
			return noot.toString(kasNumbrites);
		}
		
		if(pohitoon.equals("f")) {
			Kolmkola noot = new FKolmkola();
			return noot.toString(kasNumbrites);
		}
		
		if(pohitoon.equals("g")) {
			Kolmkola noot = new GKolmkola();
			return noot.toString(kasNumbrites);
		}
		return "Sisesta C, F, G";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.getProperties().put("server.port", 4335);
		SpringApplication.run(Kasutus.class, args);
	}
}