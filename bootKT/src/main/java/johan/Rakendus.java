import java.util.*;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.beans.factory.annotation.Autowired;

public class Rakendus {
	public static double arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}
	public static double[] arvuta(Funktsioon fn, double[] arvud){
		double[] vastused=new double [arvud.length];
		for(int i=0; i<arvud.length; i++){
			vastused[i]=fn.f(arvud[i]);
			
		}
		return vastused;
	}
	public static double[][] arvuta(Funktsioon[] fnd, double[] arvud){
		double[][] v=new double[fnd.length][arvud.length];
		for(int i=0; i<fnd.length; i++){
			v[i]=arvuta(fnd[i], arvud);
		}
		return v;
	}

	public static void main(String[] arg){

		Funktsioon yArvutaja=new Tehe(2);
		Funktsioon yArvutaja2=new Tehe2(4, 0);
		Funktsioon yArvutaja3=new Tehe2(4, 2);
		System.out.println("y=3x||"+arvuta(yArvutaja, 3)+"=3*2");
		System.out.println("y=3x||"+arvuta(yArvutaja2, 3)+"=3*4");
		System.out.println("y=3x+2||"+arvuta(yArvutaja3, 3)+"=3*4+2");
		
		double[] xVaartused={3, 5, 7};
		double[] yVaartused=arvuta(yArvutaja, xVaartused);
		System.out.println(Arrays.toString(yVaartused));
		
		


		//System.getProperties().put("server.port", 5555);
		//SpringApplication.run(Rakendus.class, args);
	}
}


//scl enable rh-maven33 bash
//mvn package
//java -jar target/bootKT-1-SNAPSHOT.jar

