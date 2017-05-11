package Rait;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi! Tere tulemast k10-le";
    }
	
	@RequestMapping("/jogi")
	String joefunktsioon(String sisend, double algus) {

	
		int j, i;
		double kogupikkus;
		
		ArrayList<Jogi> jogi= new ArrayList<Jogi>();
		
		jogi.add(new Jogi("Pirakas", 150, 32, "", 0));
		jogi.add(new Jogi("Keskmik", 88, 15, "Pirakas", 18));
		jogi.add(new Jogi("Pisike", 12, 3, "Keskmik", 67));
		jogi.add(new Jogi("Keskpäne", 57, 12, "Pirakas", 112));
		jogi.add(new Jogi("Nääps", 8, 1, "Pisike", 3));

		i = -1;
		
		for(int l=0; l<jogi.size(); l++) {
			if (sisend.equals(jogi.get(l).nim)) {
				i=l;
			}
		}
		
		if(i!=-1 && algus<=jogi.get(i).pikk) {
			if( jogi.get(i).siht == "" ) {
				return "Jõe '" + jogi.get(i).nim +  "' pikkus on " + jogi.get(i).pikk + " km ja see suubub otse merre. Etteantud kohast mereni on " + algus + " km";
			} else {

				j=i;
				kogupikkus = algus + jogi.get(i).suubum;
				StringBuffer sb=new StringBuffer();
				while (jogi.get(j).siht != "") {
					sb.append(jogi.get(j).siht + ", ");
					
					
					for(int k=0; k<jogi.size(); k++) {
						if (jogi.get(k).nim == jogi.get(j).siht) {
							j=k;
							kogupikkus += jogi.get(k).suubum;
						}
					}
					
				}
				
				return "Jõe '" + jogi.get(i).nim +  "' pikkus on " + jogi.get(i).pikk + " km ja see suubub merre läbi jõgede: " + sb.toString() + " ning etteantud kohast mereni on " + kogupikkus + " km.";
			}
		} else {
			return "Viga etteantud andmetes";
		}

	}
	
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4218);
        SpringApplication.run(Rakendus.class, args);
    }
}


/* 
scl enable rh-maven33 bash
mvn package
java -jar target/t10-1.jar
greeny.cs.tlu.ee:4218/jogi?sisend=Nääps&algus=7
*/ 
 
 
 

