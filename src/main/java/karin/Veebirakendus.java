package karin;
import java.util.*; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Veebirakendus {

    @RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/akordit2hed")
	String teeKolmk6la(String täht){
		String vastus = "Sisesta C, F või G";
		if(täht.equals("C") || täht.equals("c")){
			Kolmkõla c_duur = new CKolmkõla();
			//vastus = Arrays.toString(c_duur.helistikNumbrites());
			vastus = c_duur.toString();
		}
		if(täht.equals("F") || täht.equals("f")){
			Kolmkõla f_duur = new FKolmkõla();
			vastus = f_duur.toString();
		}
		
		if(täht.equals("G") || täht.equals("g")){
			Kolmkõla g_duur = new GKolmkõla();
			vastus = g_duur.toString();
		}
		return vastus;
	}

	/*

    public static void main(String[] args) {
	System.getProperties().put("server.port", 2412);
        SpringApplication.run(Veebirakendus.class, args);
    }
	*/
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/akordid-1.0-SNAPSHOT.jar