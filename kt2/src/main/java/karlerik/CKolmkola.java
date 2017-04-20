package karlerik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class CKolmkola extends Kolmkola {
	
	public CKolmkola(){
		super(60);
	}

}