/*package jaagup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PatchMapping;
import java.util.Arrays;

@RestController
@SpringBootApplication
public class Rakendus{
	
	public static double[] massiiv(double[]iksid,Joon klass){
		int pikkus = iksid.length;
		double[]igrekid=new double[pikkus];
		
		for(int i=0;i<pikkus;i++){
			igrekid[i]=klass.leiaY(iksid[i]);
		}
		
		return igrekid;
	}
	
	
	@RequestMapping("/arvutay")
	public String arvutaY(Double iksMin,Double iksMax,Double kordaja, Double vabaliige){ 

		
		
		JoonAction2 yks = new JoonAction2 (kordaja,vabaliige);
		JoonAction yksNulliga = new JoonAction (kordaja);
		
		String vastus;
		double n =iksMin;
		
		double[] iksid = new double[iksMax.intValue()];
		
		for(int i=0;i<iksMax;i++){
			iksid[i] = n;
			n++;
			
		}
		
		
		if(vabaliige!=0){
			yks.vaba  = vabaliige;
			vastus = Arrays.toString(massiiv(iksid,yks));
		}else{
			vastus = Arrays.toString(massiiv(iksid,yksNulliga));
		}
		return vastus;
	}
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 43201);
		SpringApplication.run(Rakendus.class);
	}
	
	// TESTID VÄLJA KOMMENTEERITUD REST TOIMIB  ESIMENE JA TEINE ÜLESANNE VÄLJA KOMMENTEERITUD
	
	
}*/