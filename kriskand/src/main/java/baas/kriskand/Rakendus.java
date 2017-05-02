package baas.kriskand;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;




public class Rakendus {
	public static double arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}

	public static void main(String[] arg){

		Funktsioon yArvutaja=new Arvutus(7);
		Funktsioon yArvutaja2=new Arvutus(9);
		Funktsioon yxaArvutaja=new Arvutus2(2, 4);
		Funktsioon yxaArvutaja2=new Arvutus2(6, 5);
		
		System.out.println(arvuta(yArvutaja, 3));
		System.out.println(arvuta(yArvutaja2, 6));
		System.out.println(arvuta(yxaArvutaja, 3));
		System.out.println(arvuta(yxaArvutaja2, 9));
		


		//System.getProperties().put("server.port", 5555);
		//SpringApplication.run(Rakendus.class, args);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/kriskand-1.jar
