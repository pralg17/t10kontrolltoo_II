import java.util.*;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.beans.factory.annotation.Autowired;

public class Rakendus {
	public static int arvuta(Funktsioon fn, int arv){
		return fn.f(arv);
	}

	public static void main(String[] arg){

		Funktsioon yArvutaja=new Vorrand(5);
		Funktsioon yxaArvutaja=new Vorrand2(5, 6);
		System.out.println(arvuta(yArvutaja, 3));
		System.out.println(arvuta(yxaArvutaja, 3));


		//System.getProperties().put("server.port", 5555);
		//SpringApplication.run(Rakendus.class, args);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot1-1.0-SNAPSHOT.jar
