package Chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
@SpringBootApplication
public class SalatApplication {
	@Autowired
	private T_Haldur t_haldur;
	
	@RequestMapping("/lisa_toiduaine")
	public String lisa(String nimetus, String valkude_p, String rasvade_p, String sysivesikute_p){
		
		T_ained t_aine = new T_ained();
		t_aine.nimetus = nimetus;
		t_aine.valgud = Double.parseDouble(valkude_p);
		t_aine.rasvad = Double.parseDouble(rasvade_p);
		t_aine.sysivesikud = Double.parseDouble(sysivesikute_p);
		t_haldur.save(t_aine);
		
		return "Andmebaasi lisati uus toiduaine " + nimetus;
		
	}
	
	@RequestMapping("/eemalda_toiduaine")
	public String eemalda(String nimetus){
		
		T_ained t_aine = t_haldur.findOne(nimetus);
		t_haldur.delete(t_aine);
		
		return nimetus + " eemaldati andmebaasist";
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4215);
		SpringApplication.run(SalatApplication.class, args);
	}
}
