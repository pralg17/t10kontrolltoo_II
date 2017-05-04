package henri;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

//funktsiooni nimed ja muutujad on väikese algustähega
//klassinimed camelcase

public class Application{
	
	@Autowired
	private ManageTable manager;
	
	@RequestMapping("/create")	
String create(String nimetus, Integer kogus, Integer rasvakogus, Integer valguprotsent, Integer sysivesikuprotsent){
		manager.save(new Toiduained(nimetus, kogus, rasvakogus, valguprotsent, sysivesikuprotsent));
		return "Toiduaine "+ nimetus +" on lisatud";
	}
	
	@RequestMapping("/search")
    String Search(String nimetus){
        if(nimetus.isEmpty()){return "no info";}
        List<Toiduained> toiduained=manager.findByNimetus(nimetus);
        if(nimetus.isEmpty()){return nimetus+" not found";}
		StringBuffer sb = new StringBuffer();
		for(Toiduained nimetus1: toiduained){
			sb.append("<p>");
			sb.append("Aine " + nimetus + " on andmebaasis ning selle rasvakogus on " + nimetus1.rasvakogus.toString());
			sb.append("</p>");
		}
		return sb.toString();

	}
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	
}



