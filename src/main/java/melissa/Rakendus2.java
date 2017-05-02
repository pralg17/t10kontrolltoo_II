package melissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Rakendus2 {
   @Autowired
   HttpSession sessioon;
   
   @RequestMapping("/uusaine")
	public String Uusaine(){ 
		if(sessioon.getValue("aine")==null){
			aine a=new aine();
//			a.molekulmass=62;
//			a.laengkokku=1;
//			a.i=new aine("Lämmastikhape", 63, 1);
//			sessioon.putValue("aine", a);
//		}
//		Uusaine a1=(Uusaine)sessioon.getValue("aine");
//		return "Aine on "+a1.i.nimetus+
//		       ", laeng on "+a1.laengkokku+" .";
//	}
   
	

	
//	 @RequestMapping("/leia")
//	String leia(String nimetus){
//	   aine a=lugeja.findOne(animetus);
//	   return animetus+" molekulmass on "+a.molekulmass;
//	}
	
//    public static void main(String[] args) {
//		System.getProperties().put("server.port", 4217);
//        SpringApplication.run(Rakendus2.class, args); 
    }
}

}	//"Lämmastikhape"