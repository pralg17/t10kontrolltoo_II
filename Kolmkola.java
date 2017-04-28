package Stivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class Kolmkola{
	int pohitoon, suurTerts, kvint;
	
	public Kolmkola(int pohitoon, int suurTerts, int kvint){
		this.pohitoon = pohitoon;
		this.suurTerts = pohitoon+4;
		this.kvint = pohitoon+7;
	}
	
	public kolmkolaNoodid(Kolmkola k){
		System.out.println(k.pohitoon, k.suurTerts, k.kvint);
		return k.pohitoon +" "+ k.suurTerts +" "+ k.kvint;
	}
	
	public static void main(String[] args) {
		//System.getProperties().put("server.port", 4444);
        SpringApplication.run(Kolmkola.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar