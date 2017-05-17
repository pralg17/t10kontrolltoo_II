package jan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class Kolmk6laApplication {
	
	@RequestMapping("/kolmk6lad")
	String Kolmk6lad(String p6hitoon) {
		if(p6hitoon.equals("c")) {
			Kolmk6la p6hiheli = new CKolmk6la();
			return p6hiheli.toString();
		}
		
		
		
		if(p6hitoon.equals("f")) {
			Kolmk6la p6hiheli = new FKolmk6la();
			return p6hiheli.toString();
		}
		
		if(p6hitoon.equals("g")){
			Kolmk6la p6hiheli = new GKolmk6la();
			return p6hiheli.toString();
		}
		
		return "Sisesta C, F, G";
	}
	
	@RequestMapping("/Kolmk6laAkordid")
	String Kolmk6laAkordid(String P6hitoonid) {
		
		String akordideString = "";
		String akordJadast = "";
		
		for(int i = 0; i < P6hitoonid.length(); i++) {
			
			akordJadast = P6hitoonid.substring(i, i+1);
			
			if(akordJadast.equals("c")) {
				Kolmk6la p6hiheli = new CKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(akordJadast.equals("f")) {
				Kolmk6la p6hiheli = new FKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(akordJadast.equals("g")) {
				Kolmk6la p6hiheli = new GKolmk6la();
				akordideString += p6hiheli.toString();
			}
			
			if(!akordJadast.equals("c") && !akordJadast.equals("f") && !akordJadast.equals("g")) {
				akordideString += "Akordi " + akordJadast.toUpperCase() + " ei saa kuvada<br>";
			}
		}
		return akordideString;
	}
	
	
	public static void main(String[] args){
		
		System.getProperties().put("server.port", 4217);
		SpringApplication.run(Kolmk6laApplication.class, args);
	}
}