package Chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class SalatApplication {
	@Autowired
	private T_Haldur t_haldur;
	
	@RequestMapping("/lisa_toiduaine")
	public String lisa(String nimetus, double valkude_p, double rasvade_p, double sysivesikute_p){
		
		T_ained t_aine = new T_ained();
		t_aine.nimetus = nimetus;
		t_aine.valgud = valkude_p;
		t_aine.rasvad = rasvade_p;
		t_aine.sysivesikud = sysivesikute_p;
		if(valkude_p + rasvade_p + sysivesikute_p > 100){
			return t_aine.p_error();
		} else {
			t_haldur.save(t_aine);
			return "Andmebaasi lisati uus toiduaine " + nimetus + " " + valkude_p + " " + rasvade_p + " " + sysivesikute_p;
		}
		
	}
	
	@RequestMapping("/eemalda_toiduaine")
	public String eemalda(Integer id){
		
		T_ained t_aine = t_haldur.findOne(id);
		t_haldur.delete(t_aine);
		
		return "Andmebaasist eemaldati toiduaine id-ga " + id;
		
	}
	
	@RequestMapping("/n2itak6ik")
	public String n2ita(){
		
		String andmed = "";
		
		for(T_ained t_aine : t_haldur.findAll()){
			andmed = andmed + " " + t_aine.id + " " + t_aine.nimetus + " " + t_aine.valgud + " " + t_aine.rasvad + " " + t_aine.sysivesikud;
			andmed += "</br>";
		}
		
		return andmed;
		
	}
	
	@RequestMapping("/Otsi_rasv")
	public String otsi(double rasv_min, double rasv_max){
		
		String andmed = "";
		for(T_ained t_aine : t_haldur.findAll()){
			if(t_aine.rasvad > rasv_min && t_aine.rasvad < rasv_max){
				andmed = andmed + " " + t_aine.id + " " + t_aine.nimetus + " " + t_aine.valgud + " " + t_aine.rasvad + " " + t_aine.sysivesikud;
				andmed += "</br>";
			}
		}
		
		return andmed;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4215);
		SpringApplication.run(SalatApplication.class, args);
	}
}
