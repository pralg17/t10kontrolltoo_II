package Oscar_KT2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Kt2Application {
	@Autowired
    private RiverDao riverDao;

	@RequestMapping("/lisa")
	String lisa2(String rivername, double riverflow, String whereflows, double riverflowskm, double riverlenght){
		double sumflow = 0;
		River s;
		s=riverDao.findByWhereflows(rivername);
		while(s != null){
			sumflow += s.riverflow;
			s = riverDao.findByWhereflows(s.rivername);

		}
		if(sumflow != 0){
			if(sumflow>riverflow){
			return "J6ge ei saanud lisada liiga v2ikse voolu t6ttu";
			}
		}
		
	   	River river = new River();
    	river.River(rivername, riverflow, whereflows, riverflowskm, riverlenght);
	   	riverDao.save(river);
	   	return "Andmebaasi salvestatud j6gi "+river.rivername;
	}
	@RequestMapping("/leia")
	String leia(String rivername){
	   River river=riverDao.findByRivername(rivername);
	   return "On olemas andmebaasis j6gi: "+river.rivername+"<br>"+
	   "Pikkusega: "+river.riverlenght+"<br>"+
	   "Vooluhulk suudmes: "+river.riverflow+"<br>"+
	   "Suundub: "+river.whereflows;
	}
	@RequestMapping("/leia2")
	String leia2(String whereflows, double riverflowskms){
	   River river=riverDao.findByRivername(whereflows);
	   if(river.riverflowskm <= riverflowskms){
		   return ""+river.riverflowskm+" km suundub sellese j6ese "+river.whereflows+"";
	   }
	   return "Sellese j6ese ei suundu  "+riverflowskms+" km sees yhtegi j6ge";
	}
	

	public static void main(String[] args) {
		System.getProperties().put("server.port", 49891);
		SpringApplication.run(Kt2Application.class, args);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/KT2-0.0.1-SNAPSHOT.jar
//localhost:49898/river
//greeny.cs.tlu.ee:4989/home.html

//greeny.cs.tlu.ee:49898/lisa
//greeny.cs.tlu.ee:49898/lisa?rivername=oscari&riverflow=21&whereflows=lehmas&riverlenght=31

//greeny.cs.tlu.ee:49898/leia?rivername=kana

