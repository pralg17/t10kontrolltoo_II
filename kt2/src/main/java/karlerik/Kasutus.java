package karlerik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Kasutus {
	public static void main(String[] args) {
		
		System.getProperties().put("server.port", 4335);
		SpringApplication.run(Kasutus.class, args);
		
		//Kolmkola c1 = new Kolmkola(60);
		//System.out.println(c1.toString());
		
		
	}
}