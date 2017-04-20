package alari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/jooned")
	public String vorrand(String x){
		return 3*Integer.parseInt(x)+"=3*"+x;
	}


	public static void main(String[] args) {
		System.getProperties().put("server.port", 5555);
		SpringApplication.run(Rakendus.class, args);
	}
}
