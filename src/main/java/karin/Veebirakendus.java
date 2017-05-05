package karin;
import java.util.*; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Veebirakendus {

    @RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	
	@RequestMapping("/akordit2hed")   //2.punkt
	String teeKolmk6la(String täht){
		String vastus = "Sisesta C, F või G";
		if(täht.equals("C") || täht.equals("c")){
			Kolmkõla c_duur = new CKolmkõla();
			//vastus = Arrays.toString(c_duur.helistikNumbrites());
			vastus = c_duur.toString();
		}
		if(täht.equals("F") || täht.equals("f")){
			Kolmkõla f_duur = new FKolmkõla();
			vastus = f_duur.toString();
		}
		
		if(täht.equals("G") || täht.equals("g")){
			Kolmkõla g_duur = new GKolmkõla();
			vastus = g_duur.toString();
		}
		return vastus;
	}
	
	@RequestMapping("/taktid")   //3.punkt   
	//taktid?kolmkõlaT2hed=c,g&t2htedena=jah     ...C, E, G, G, H, D
	String väljastaNoodid(String kolmkõlaT2hed, String t2htedena){
		if(kolmkõlaT2hed == null || kolmkõlaT2hed.equals("")){
			return "Kolmkõla tähed on sisestamata";
		}
		String[] sisestused = kolmkõlaT2hed.split(",");
		Kolmkõla[] eksemplarid = new Kolmkõla[sisestused.length];
		for(int i = 0; i < sisestused.length; i++){
			eksemplarid[i]= new Kolmkõla(sisestused[i].trim());
		}
		Lugu lugu1 = new Lugu(eksemplarid);
		
		if(t2htedena.equals("jah")){
			lugu1.midi = false;
		} 
		return(lugu1.noodid());
		
	}

    public static void main(String[] args) {
	System.getProperties().put("server.port", 2412);
        SpringApplication.run(Veebirakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/akordid-1.0-SNAPSHOT.jar