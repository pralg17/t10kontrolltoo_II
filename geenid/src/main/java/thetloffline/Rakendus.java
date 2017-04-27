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
	private GeenideHaldur geenideHaldur;

	@Autowired
	HttpSession sessioon;
	
	//Joogivaat vaat = new Joogivaat();

	@RequestMapping("/Lisa")
	public String lapseGeen(String alleeliNimetus, String emaAlleel1, String emaAlleel2, String isaAlleel1, String isaAlleel2) {
		Geen uusGeenEma = new Geen();
		uusGeenEma.alleel1 = new Alleel(alleeliNimetus, emaAlleel1.equals("true"));
		uusGeenEma.alleel2 = new Alleel(alleeliNimetus, emaAlleel2.equals("true"));
		Geen uusGeenIsa = new Geen();
		uusGeenIsa.alleel1 = new Alleel(alleeliNimetus, isaAlleel1.equals("true"));
		uusGeenIsa.alleel2 = new Alleel(alleeliNimetus, isaAlleel2.equals("true"));
		GeenidDB salvestaGeen = new GeenidDB();
		salvestaGeen.lapseAlleel1 = uusGeenEma.getRandomAlleel();
		salvestaGeen.lapseAlleel2 = uusGeenIsa.getRandomAlleel();
		geenideHaldur.save(salvestaGeen);

	}

	@RequestMapping("/loouusgeen")
	public String newGene() {
		Geen emaReesus = new Geen();
		emaReesus.alleel1 = new Alleel("reesus", false);
		emaReesus.alleel2 = new Alleel("reesus", true);
		
		Geen isaReesus = new Geen();
		isaReesus.alleel1 = new Alleel("reesus", false);
		isaReesus.alleel2 = new Alleel("reesus", true);

		Geen lapseReesus = new Geen();
		lapseReesus.alleel1 = emaReesus.getRandomAlleel();
		lapseReesus.alleel2 = isaReesus.getRandomAlleel(); // reesus 1 v 2?

		return "";
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
		SpringApplication.run(Rakendus.class, args); //, args ?

	}
}
