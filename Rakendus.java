package brigitta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/rakendus")
	String a(String lause){
		if(lause==null){return "andmed puuduvad";}
		Sona s1=new Sona(lause);
		String vastus="Selles lauses esineb see t2ht "+ s1.T2htesineb('a') + " korda";
		return vastus;
	}

	

    public static void main(String[] args) {
		System.getProperties().put("server.port", 43200);
        SpringApplication.run(Rakendus.class, args);
    }
}