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
		Joed jogi=new Joed();
//		jogi.nimi=aaa; 
		jogi.pikkus=25;
		jogi.vooluhulk=5;
//		jogi.sihtjogi=bbb;
		jogi.suubumisKm=18;
		
		return "saan siit kätte pikkuse: " + jogi.pikkus;
	}
	
	
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 42818);
        SpringApplication.run(Rakendus.class, args);
    }
}