package marko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RakendusApplication {
	
	Ioon vesinik = new Ioon("Vesinik", 12.0,1);
	@RequestMapping("/ioon")
	public int giveCharge(){
		return vesinik.getCharge();
	}

	public static void main(String[] args) {
		SpringApplication.run(RakendusApplication.class, args);
	}
}
