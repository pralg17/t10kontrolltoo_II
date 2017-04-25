package kriskand;

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
 		return 3*Integer.parseInt(x)+"=3*"+x;
 	}
 	
 	
	public static void main(String[] args){
 		System.getProperties().put("server.port", 6342);
		System.getProperties().put("spring.datasource.url", 
		   "jdbc:mysql://localhost/if16_kriskand");
		System.getProperties().put("spring.datasource.maxActive", "2");
		System.getProperties().put("spring.datasource.username", "if16");
		System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
 	}
 	
	
	
}