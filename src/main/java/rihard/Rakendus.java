package rihard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Rakendus{
	
	public static double arvuta(JooneVorrand fn, double arv){
		
		return fn.f(arv);
		
	}
	
	public static double arvuta2(JooneVorrand2 fn, double arv1, double arv2){
		
		return fn.f(arv1, arv2);
		
	}
	
	@RequestMapping("/joon")
	public String x3funktsioon(double x){
		
		JooneVorrand x3funktsioon=new Joonefunktsioon(3);
		
		return "Y = "+(arvuta(x3funktsioon, x));
		
	}
	
	@RequestMapping("/joon2")
	public String vabaliige(double x, double a){
	
		JooneVorrand2 vabaliige=new Joonefunktsioon2(3, 0);

		return "Y = "+(arvuta2(vabaliige, x, a));
		
	}
	


	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 42213);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar