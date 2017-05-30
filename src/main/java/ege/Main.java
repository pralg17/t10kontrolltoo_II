package ege;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Main{
	@Autowired
	private ManageTable manager;
	
	@RequestMapping("/create")
	String create(String nimetus, Double pikkus, Double vooluhulk, 
					@RequestParam(name="sihtj6gi", defaultValue="", required=false) String sihtj6gi, 
					@RequestParam(name="sihtj6eAsukoht", defaultValue="", required=false) Double sihtj6eAsukoht){
		if(sihtj6gi.isEmpty() && sihtj6eAsukoht == null){
		manager.save(new J6edEntity(nimetus, pikkus, vooluhulk));			
		}else{
		manager.save(new J6edEntity(nimetus, pikkus, vooluhulk, sihtj6gi, sihtj6eAsukoht));		
		}
		return nimetus+" saved";
	}
	
	@RequestMapping("/search")
	String Search(String nimetus){
		if(nimetus.isEmpty()){return "pole infot";}
		List<J6edEntity> j6gi=manager.findByNimetus(nimetus);
		if(j6gi.isEmpty()){return nimetus+" pole antud j6ge";}
		
		return "<p>"+j6gi.get(0).nimetus.toString()+"</p>";
	}
	
	
	@RequestMapping("/arvutamine")
	String j6ed(){
		J6gi j1= new J6gi("Keila", 120, 6.5, null, 0);
		J6gi j2=new J6gi("Vihula", 40, 4.5, j1, 80);
		J6gi j3=new J6gi("Harku", 70, 1.6, j2, 35);
		J6gi j4=new J6gi("Pedja", 100, 10.9, j3, 40);
		
		J6gi [] j6ed = new J6gi[4];
		j6ed[0] = j4;
		j6ed[1] = j3;
		j6ed[2] = j2;
		j6ed[3] = j1;
		
		StringBuffer sb = new StringBuffer();
		sb.append("<p>");
		
		sb.append("<p>");
		sb.append("Jargmiste j6gede abil j6uab merre: ");
		sb.append("</p>");
		
		for(J6gi j: j6ed){
			if(j.sihtj6gi != null){
				sb.append("<p>");
				sb.append(j.sihtj6gi.nimetus);
				sb.append("</p>");
			}
			if(j.sihtj6gi == null){
				sb.append("<p>");
				sb.append("Sihtj6gi suundub merre");
				sb.append("</p>");
			}
		}
		
		//merre j6udmiseks km funktsioon
		sb.append("<p>");
		sb.append("Teekond merre on: " + (j4.sihtj6eAsukoht + j3.sihtj6eAsukoht + j2.sihtj6eAsukoht));
		sb.append("</p>");
		return sb.toString();
	}
	
	public static void main(String[] args){
		System.getProperties().put("server.port", 8080);
        SpringApplication.run(Main.class, args);
	}
}