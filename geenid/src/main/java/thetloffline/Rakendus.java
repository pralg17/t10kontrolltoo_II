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

   // @Autowired
   //  public Rakendus(GeenDao geenDao) {
   //      this.geenDao = geenDao;
   //  }

	@Autowired
	private GeenDao geenDao;

	@Autowired
	HttpSession sessioon;

	@RequestMapping("/Lisa")
	public String lapseGeen(String alleeliNimetus, String emaAlleel1, String emaAlleel2, String isaAlleel1, String isaAlleel2) {
		Alleel ema1 = new Alleel(alleeliNimetus, emaAlleel1.equals("true"));
		Alleel ema2 = new Alleel(alleeliNimetus, emaAlleel1.equals("true"));
		Geen uusGeenEma = new Geen(ema1, ema2);

		Alleel isa1 = new Alleel(alleeliNimetus, isaAlleel1.equals("true"));
		Alleel isa2 = new Alleel(alleeliNimetus, isaAlleel1.equals("true"));
		Geen uusGeenIsa = new Geen(isa1, isa2);

		GeenDB salvestaGeen = new GeenDB();
		salvestaGeen.alleeliNimetus = alleeliNimetus;
		salvestaGeen.lapseAlleel1 = String.valueOf(uusGeenEma.getRandomAlleel().v22rtus);
		salvestaGeen.lapseAlleel2 = String.valueOf(uusGeenIsa.getRandomAlleel().v22rtus);

		geenDao.save(salvestaGeen);
		return "Loodi ja salvestati " + salvestaGeen.toString();
	}

	@RequestMapping("/Otsi")
	public String otsiGeeni(String otsiAlleeliNimetust) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (GeenDB geen : geenDao.findAll()) {
        	if (geen.alleeliNimetus.equals(otsiAlleeliNimetust)) {
        		sb.append("<tr><td>").
        		append(geen.id).
        		append("</td><td>").
        		append("<div id = 'alleeliNimetusId'>"+geen.alleeliNimetus+"</div>").
        		append("</td><td>").
        		append("<div id = 'lapseAlleel1Id"+i+"'>"+geen.lapseAlleel1+"</div>").
        		append("</td><td>").
        		append("<div id = 'lapseAlleel2Id"+i+"'>"+geen.lapseAlleel2+"</div>").
        		append("</td><td>").
        		append("<input type='checkbox' id = 'valik"+i+"'/></td>").
        		append("</td></tr>");
        		i++;
        	}
        }
        sb.append("<tr><td>Leitud geenide arv: <div id = 'leitud' >"+(i)+"</div></td></tr>");
        return sb.toString();
	}

	

	@RequestMapping("/loouusgeen")
	public String newGene() {
		Geen emaReesus = new Geen(
			new Alleel("reesus", false), 
			new Alleel("reesus", true)
		);
		//emaReesus.alleel1 = new Alleel("reesus", false);
		//emaReesus.alleel2 = new Alleel("reesus", true);
		
		Geen isaReesus = new Geen(
			new Alleel("reesus", false), 
			new Alleel("reesus", true)
		);
		//isaReesus.alleel1 = new Alleel("reesus", false);
		//isaReesus.alleel2 = new Alleel("reesus", true);

		Geen lapseReesus = new Geen(
			emaReesus.getRandomAlleel(), 
			isaReesus.getRandomAlleel()
		);
		//lapseReesus.alleel1 = emaReesus.getRandomAlleel();
		//lapseReesus.alleel2 = isaReesus.getRandomAlleel(); // reesus 1 v 2?

		return "";
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
		SpringApplication.run(Rakendus.class, args);

	}
}
