package shxtov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication

public class Veebileht{
	
	@RequestMapping("/xValue")
	public double testFunktsion(double x){
		
		yLine x1=new xValue(3);
		return (x1.f(x));
		
	}


    @RequestMapping("/Vabaliige")
	public double Veebileht (double x, double vabaliige){
		double vastus;
		

		Vabaliige vabaliikmega=new Vabaliige(3.0,2.0);
		vastus = vabaliikmega.kordaja*x+vabaliige;
		return (vastus);
		
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 4215);
        SpringApplication.run(Veebileht.class, args);
    }
	
	
}