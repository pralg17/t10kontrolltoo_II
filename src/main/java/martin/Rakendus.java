package martin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
	
	@Autowired
	@RequestMapping("/iooninimi")
	public String IooniNimi(){
		Ioon io1=new Ioon("Na", 1, "+");
		Ioon io2=new Ioon("F", 1, "-");
		if(io1.aatommasside_summa==io2.aatommasside_summa && io1.laeng!=io2.laeng){
			
			return "Iooninimi koos laengutega on " + io1.nimetus + io1.aatommasside_summa + io1.laeng+ " " +io2.nimetus + io2.aatommasside_summa + io2.laeng + " ";} return null;
	}
	
	@Autowired
	@RequestMapping("/ioonmass")
	public String MolekulideMass(){
		IoonMass im1= new IoonMass("Na", 23);
		IoonMass im2= new IoonMass("F", 19);
		return "Nende kahe molekuli masside summa on: " + (im1.molekulmass+im2.molekulmass);
	}
	//port 	
	public static void main(String[] args){
		System.getProperties().put("server.port", 2456);
		SpringApplication.run(Rakendus.class);
	}
}

