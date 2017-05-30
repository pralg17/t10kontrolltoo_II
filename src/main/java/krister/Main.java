package krister;

//1.
//Loo liides iooni andmete tarbeks - nimetus, aatommasside summa, laeng. Loo realiseeriv klasss, kus nimetus on stringina.
//Koosta paar näidet - H+, NO3-
//Koosta automaattest iooni loomise ning andmete küsimise kohta.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Main{

	//Vesinik H+
	Ioon hydrogen = new Ioon("Hydrogen", 12.0, 1);
	//Nitraat NO3-
	Ioon nitrate = new Ioon("Nitrate", 62.0, -1);
	
	//Vesiniku väljatrükk
	@RequestMapping("/hydrogen")
	public String giveNameHydrogen(){
		return "Name: " + hydrogen.getName();
	}
	
	//Nitraadi väljatrükk
	@RequestMapping("/nitrate")
	public String giveNameNitrate(){
		return "Name: " + nitrate.getName();
	}

	public static void main(String[] args){
		System.getProperties().put("server.port", 2171);
        SpringApplication.run(Main.class, args);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/tarnamaa-1.jar
//localhost:2171/algus