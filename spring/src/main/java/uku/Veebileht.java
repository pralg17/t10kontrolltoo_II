package uku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication

public class Veebileht{
	
	
	@RequestMapping("/Puudu")
	public String Veebileht (){
		return "Vastus puudu";
		
	}

	@RequestMapping("/xKordaja")
	public double Veebileht (double x){
		double vastus;
		xKordaja x1=new xKordaja(3);//xkordaja annan sisse

		vastus = x1.kordaja*x;
		return (vastus);
		
	}
	
	@RequestMapping("/Vabaliige")
	public double Veebileht (double x, double vabaliige){
		double vastus;
		Vabaliige vabaliikmega=new Vabaliige(3.0,2.0);//xkordaja annan sisse
		vastus = vabaliikmega.kordaja*x+vabaliige;
		return (vastus);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 42278);
        SpringApplication.run(Veebileht.class, args);
    }
	
}