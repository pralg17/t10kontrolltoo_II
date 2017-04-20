package johan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication
public class Rakendus{
	
	@RequestMapping("/Yvaartus")
	public String yVaartuseleidja(String x){
		/*return "Sirgel y=3x, kus x=5 on y-i v22rtus: "+3*y;*/
		return 3*Integer.parseInt(x)+"=3*"+x;
	}
	
	
	public static void main(String[] args){
		System.getProperties().put("server.port", 4430);
		SpringApplication.run(Rakendus.class, args);
	}
	
	
}
//scl enable rh-maven33 bash
//mvn package
//java -jar target/bootKT-1.jar

