package ee.tlu.if16.jaagup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus{
	private final TabeliHaldur tabeliHaldur;

    @Autowired
    public Rakendus(TabeliHaldur tabeliHaldur) {
        this.tabeliHaldur = tabeliHaldur;
    }

	@RequestMapping("/listall")
    String listall(String toiduaine_nimetus) {
        StringBuffer sb = new StringBuffer();
        for (Toiduained item : tabeliHaldur.findAll()) {
            sb.append(item);
        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/lisa")
    String lisa(String toiduaine_nimetus, Integer valgud_protsent, Integer rasvad_protsent, Integer sysivesikud_protsent) {
        Toiduained toiduained = new Toiduained();
        toiduained.toiduaine_nimetus = toiduaine_nimetus;
				toiduained.valgud_protsent = valgud_protsent;
				toiduained.rasvad_protsent = rasvad_protsent;
				toiduained.sysivesikud_protsent = sysivesikud_protsent;


				if((valgud_protsent + rasvad_protsent + sysivesikud_protsent) > 100){
					return toiduained.protsendiError();
				}else{
					tabeliHaldur.save(toiduained);
	        return "Lisatud " + toiduaine_nimetus + valgud_protsent + rasvad_protsent + sysivesikud_protsent;
				}

    }

 @RequestMapping("/kustuta")
  String kustuta(Integer id) {
        Toiduained toiduained = tabeliHaldur.findOne(id);
        tabeliHaldur.delete(toiduained);
      return toiduained.toiduaine_nimetus + " " + " on kustutatud";
    }


		@RequestMapping("/rasvaotsing")
		public String rasvaotsing(double rasvad_min, double rasvad_max){
			StringBuffer sb = new StringBuffer();
			for(Toiduained item : tabeliHaldur.findAll()){
				if(item.rasvad_protsent > rasvad_min && item.rasvad_protsent < rasvad_max){
					sb.append(item);
				}
			}
			String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
         return thead + sb.toString();
		}

    public static void main(String[] args) {
        System.getProperties().put("server.port", 12234);
        SpringApplication.run(Rakendus.class, args);
    }
	}

//Kiirem käivitus
//java -Djava.security.egd=file:/dev/./urandom -jar demo.jar"
