package thetloffline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Rakendus {

	@Autowired
	HttpSession sessioon;
	
	//Joogivaat vaat = new Joogivaat();

	@RequestMapping("/Lisa")
	public String(String alleeliNimetus, String emaAlleel1, String emaAlleel2, String isaAlleel1, String isaAlleel2) {
		Geen uusGeen = new Geen();
		uusGeen.alleeliNimetus1 = new Allel (alleeliNimetus, emaAlleel1.equals("true"));
		uusGeen.alleeliNimetus2 = new Allel (alleeliNimetus, emaAlleel2.equals("true"));
		uusGeen.alleeliNimetus1 = new Allel (alleeliNimetus, isaAlleel1.equals("true"));
		uusGeen.alleeliNimetus2 = new Allel (alleeliNimetus, isaAlleel2.equals("true"));
	}

	@RequestMapping("/uusgeen")
	public String newGene() {
		Geen emaReesus = new Geen();
		emaReesus.reesus1 = new Alleel("reesus", false);
		emaReesus.reesus2 = new Alleel("reesus", true);
		
		Geen isaReesus = new Geen();
		isaReesus.reesus1 = new Alleel("reesus", false);
		isaReesus.reesus2 = new Alleel("reesus", true);

		Geen lapseReesus = new Geen();
		lapseReesus.reesus1 = new emaReesus.getRandomAlleel();
		lapseReesus.reesus2 = new isaReesus.getRandomAlleel(); // reesus 1 v 2?

	}


	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
		SpringApplication.run(Rakendus.class);

	}
}
