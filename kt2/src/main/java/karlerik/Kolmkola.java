package karlerik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Kolmkola {
	
	int pohitoon;
	
	public Kolmkola(int pohitoon) {
		this.pohitoon = pohitoon;
	}
	
	public String toString() {
		
		int suurTerts = pohitoon + 4;
		int kvint = pohitoon + 7;
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurTerts) + " " + String.valueOf(kvint);
	}
	
	
	
}