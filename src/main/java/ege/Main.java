package ege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Main{
	@RequestMapping("/j6ed")
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
		System.getProperties().put("server.port", 4567);
        SpringApplication.run(Main.class, args);
	}
}