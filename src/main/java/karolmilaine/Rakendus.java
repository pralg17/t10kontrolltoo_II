package karolmilaine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus{
	private final ToiduainedDao toiduainedDao;

    @Autowired
    public Rakendus(ToiduainedDao toiduainedDao) {
        this.toiduainedDao = toiduainedDao;
    }

	@RequestMapping("/listall")
    String listall(String nimetus) {
        StringBuffer sb = new StringBuffer();
        for (Toiduained item : toiduainedDao.findAll()) {
            sb.append(item);
        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/lisa")
    String lisa(String nimetus, Integer valgud, Integer rasvad, Integer susivesikud) {
        Toiduained toiduained = new Toiduained();
        toiduained.nimetus = nimetus;
				toiduained.valgud = valgud;
				toiduained.rasvad = rasvad;
				toiduained.susivesikud = susivesikud;


				if((valgud + rasvad + susivesikud) > 100){
					return toiduained.protsendiError();
				}else{
					toiduainedDao.save(toiduained);
	        return "Lisatud " + nimetus + valgud + rasvad + susivesikud;
				}

    }

    @RequestMapping("/kustuta")
    String kustuta(Integer id) {
        Toiduained toiduained = toiduainedDao.findOne(id);
        toiduainedDao.delete(toiduained);
        return toiduained.nimetus + " " + toiduained.valgud +  " " + toiduained.rasvad + " " + toiduained.susivesikud + " on kustutatud";
    }

		@RequestMapping("rasvaotsing")
		public String rasvaotsing(double rasvadmin, double rasvadmax){
			StringBuffer sb = new StringBuffer();
			for(Toiduained item : toiduainedDao.findAll()){
				if(item.rasvad > rasvadmin && item.rasvad < rasvadmax){
					sb.append(item);
				}
			}
			String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
         return thead + sb.toString();
		}
		

    public static void main(String[] args) {
        System.getProperties().put("server.port", 1234);
        SpringApplication.run(Rakendus.class, args);
    }

    /*public static void main(String[] arg){
        Toiduained t1= new Toiduained("kartul", 1.71, 0, 20.1);
        Toiduained t2= new Toiduained("hapukoor", 2.8, 20, 3.2);
        Toiduained t3= new Toiduained("vorst", 12, 19, 4);

		Toidukomponendid k1 = new Toidukomponendid();
		k1.t = t1;
		k1.kogus = 100;

		Toidukomponendid k2 = new Toidukomponendid();
		k2.t = t2;
		k2.kogus = 30;

		Toidukomponendid k3 = new Toidukomponendid();
		k3.t = t3;
		k3.kogus = 50;

		System.out.println("Kartuli kogus grammides on: "+(k1.kogus));
		System.out.println("Hapukoore kogus grammides on: "+(k2.kogus));
		System.out.println("Vorsti kogus grammides on: "+(k3.kogus));

    System.out.println();

    System.out.println("Rasvakogus kartulis on: "+(k1.rasvakogus()));
    System.out.println("Rasvakogus hapukoores on: "+(k2.rasvakogus()));
    System.out.println("Rasvakogus vorstis on: "+(k3.rasvakogus()));



    }*/

//scl enable rh-maven33 bash
//mvn package
//java -jar target/rakendus-1.jar
//http://greeny.cs.tlu.ee:1234/
}
