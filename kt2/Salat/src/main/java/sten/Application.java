package sten;

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
	String create(String nimetus, Integer kogus, Integer rasvaprotsent, Integer sysivesikuprotsent, Integer valguprotsent, Integer rasvakogus){
		manager.save(new Salat(nimetus, kogus, rasvaprotsent,sysivesikuprotsent,valguprotsent,rasvakogus));
		return "Toiduaine "+ nimetus +" lisatud";
	}
	
	@RequestMapping("/search")
    String Search(String nimetus){
        if(nimetus.isEmpty()){return "no info";}
        List<Salat> salat=manager.findBynimetus(nimetus);
        if(nimetus.isEmpty()){return nimetus+" not found";}
		StringBuffer sb = new StringBuffer();
		for(Salat nimetus1: salat){
			sb.append("<p>");
			sb.append("Aine " + nimetus + "Rasvakogus" + nimetus1.rasvakogus.toString());
			sb.append("</p>");
		}
		return sb.toString();

	}
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	
}



