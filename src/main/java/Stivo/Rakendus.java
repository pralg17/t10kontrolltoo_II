package Stivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus{
	@RequestMapping("/akordid")
	String akordid(String akord1, String akord2, String akord3, String akord4){
		String vastus = "";
		if(akord1 == "c"){Kolmkola k = new CKolmkola(); vastus = vastus +"C akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord1 == "f"){Kolmkola k = new FKolmkola(); vastus = vastus +"F akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord1 == "g"){Kolmkola k = new GKolmkola(); vastus = vastus +"G akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		
		if(akord2 == "c"){Kolmkola k = new CKolmkola(); vastus = vastus +"C akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord2 == "f"){Kolmkola k = new FKolmkola(); vastus = vastus +"F akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord2 == "g"){Kolmkola k = new GKolmkola(); vastus = vastus +"G akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		
		if(akord3 == "c"){Kolmkola k = new CKolmkola(); vastus = vastus +"C akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord3 == "f"){Kolmkola k = new FKolmkola(); vastus = vastus +"F akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord3 == "g"){Kolmkola k = new GKolmkola(); vastus = vastus +"G akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		
		if(akord4 == "c"){Kolmkola k = new CKolmkola(); vastus = vastus +"C akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord4 == "f"){Kolmkola k = new FKolmkola(); vastus = vastus +"F akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		if(akord4 == "g"){Kolmkola k = new GKolmkola(); vastus = vastus +"G akordi noodid on:"+ k.kolmkolaNoodid() +"\n";}
		
		return vastus;
	}
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4444);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar