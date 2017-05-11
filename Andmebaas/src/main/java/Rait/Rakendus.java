package Rait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@SpringBootApplication
public class Rakendus {
    @Autowired
    private JoedDao joed;
	
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi! Tere tulemast k10-le";
    }
	
	@RequestMapping("/leia")
	String leidmine(String nimi){
		if(nimi==null){return "nimi sisestamata";}
		Joed jogi=joed.findOne(nimi);
		if(jogi==null){return nimi + " puudub baasist";}
		return "Otsitud: " + nimi + ". Leitud: " + jogi.nimi + " pikkusega " + jogi.pikkus + ", vooluhulgaga " + jogi.vooluhulk + ", mis suubub jõkke " + jogi.sihtjogi + " kilomeetril " + jogi.suubub;
	}
	
	@RequestMapping("/loetelu")
	public Iterable<Joed> loetelu(){
		return joed.findAll();
	}
	
	@RequestMapping("/lisa")
	String lisa(String nimi, double pikkus, double vooluhulk, String sihtjogi, int suubub){
		Joed jogi=new Joed();
	   
		if(nimi==null || pikkus==0 || vooluhulk==0){return "Andmed puudulikud!";}
		else{
		   jogi.nimi=nimi;
		   jogi.pikkus=pikkus;
		   jogi.vooluhulk=vooluhulk;
		   if(sihtjogi==null){jogi.sihtjogi="";}
		   else{jogi.sihtjogi=sihtjogi;}
		   if(suubub==0){jogi.suubub=0;}
		   else{jogi.suubub=suubub;}
		   joed.save(jogi);
		   return "Lisatud "+nimi+" "+pikkus+" "+vooluhulk+" "+sihtjogi+" "+suubub;
		}
	}
	
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4218);
        SpringApplication.run(Rakendus.class, args);
    }
}




/* localhost:5556/leia?nimi=Keskmik */

/* localhost:5556/lisa?nimi=Uus&pikkus=7&vooluhulk=2&sihtjogi=Pirakas&suubub=24 */




