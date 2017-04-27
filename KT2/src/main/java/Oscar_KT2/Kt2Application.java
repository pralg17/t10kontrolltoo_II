package Oscar_KT2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Kt2Application {

	@RequestMapping("/river")

	public String river(){
		River river1 = new River();
        river1.River("Koeru", 12, 6);

        River river2 = new River();
        river2.River("Narva", 10, river1, 10);
        
        River river3 = new River();
        river3.River("Isa", 7, river2, 12);

        River river4 = new River();
        river4.River("Kana", 4, river3, 5);

		String a = Double.toString(river4.getLenghtToSea());

		return river4.getName()+" j6est on merre "+a+" KM.";
	}
	public static void main(String[] args) {
		System.getProperties().put("server.port", 49898);
		SpringApplication.run(Kt2Application.class, args);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/KT2-0.0.1-SNAPSHOT.jar
//localhost:49898/river
//localhost:49898/home.html

//greeny.cs.tlu.ee:49898/river