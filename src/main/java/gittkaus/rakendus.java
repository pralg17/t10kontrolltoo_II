package gittkaus;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication

public class rakendus{
	@RequestMapping("/joed")
	public String joed(double SuudmeK, double JKNJ) {
		
		
		Nimed joedA = new Nimed("jogi1", 62, 62, "jogi2", 62, 1);
		Nimed joedB = new Nimed("jogi2", 62, 62, "jogi3", 62, 2);
		Nimed joedC = new Nimed("jogi3", 62, 62, null, 62, 3);
		String tulemus = "";
	
	
		if(JKNJ == 1) {
			tulemus = "Algab " + joedA.nimi + " ning suubub " + joedB.nimi + ". Sealt edasi liigub " + joedB.nimi + " merre. " + " Punkt X kaugus on merest " + joedA.XPunkt(SuudmeK,0.0, joedB.SKM, joedC.SKM) + " KM";
		}
		else if(JKNJ == 2) {
			tulemus = "Algab " + joedC.nimi + " ning suubub " + joedB.nimi + " ning sealt merre. "  + " Punkt X kaugus on merest " + joedA.XPunkt(SuudmeK,0.0, 0.0, joedC.SKM) + " KM";
		}
		else if(JKNJ == 3) {
			tulemus = "Suubub otse merre. " + " Punkt X kaugus on merest " + joedA.XPunkt(SuudmeK,0.0, 0.0, 0.0) + " KM";
		}else {
			tulemus = "Sellise jarjekorranumbriga jogi ei eksisteeri";
		}
		return tulemus;
	}

	public static void main(String[] args){
	System.getProperties().put("server.port", 6161);
	SpringApplication.run(rakendus.class, args);
	}

}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/app1.jar
//http://greeny.cs.tlu.ee:6161/joed