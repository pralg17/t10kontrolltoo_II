package Rait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi! Tere tulemast k10-le";
    }
	
	@RequestMapping("/jogi")
	public String Jogi() {
		Joed j1=new Joed("Pirakas", 150, 32, null, 0);
		Joed j2=new Joed("Keskmik", 88, 15, "Pirakas", 18);
		Joed j3=new Joed("Pisike", 12, 3, "Keskmik", 67);
		Joed j4=new Joed("Keskpärane", 57, 12, "Pirakas", 112);
		Joed j5=new Joed("Nääps", 8, 1, "Pisike", 3);

		return null;

	}
	
	@RequestMapping("/ahel")
	public String Ahel(String nimi) {
		if (nimi == Jogi.j2.sihtjogi) {
			return "text";
		}
	
		return null;
	
	}
	
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 42818);
        SpringApplication.run(Rakendus.class, args);
    }
}


