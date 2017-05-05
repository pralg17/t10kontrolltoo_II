package heino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus{

	//Interface tabeliHaldur
	private final TabeliHaldur tabeliHaldur;

    @Autowired
    public Rakendus(TabeliHaldur tabeliHaldur) {
        this.tabeliHaldur = tabeliHaldur;
    }

//Veebikaardistamise meetod
@RequestMapping("/toiduaine")

		public String toiduaine() {
				Toiduained kartul = new Toiduained(1, "kartul", 13.0, 50.0, 30.0);
				Toiduained hapukoor = new Toiduained(2, "hapukoor", 10.0, 10.0, 20.0);
				Toiduained juust = new Toiduained(3, "juust", 30.0, 40.0, 10.0);

 //Tagastab objekti toiduaine kartul jaoks ning tema nimetuse
		return kartul.toiduaine_nimetus + hapukoor.toiduaine_nimetus + juust.toiduaine_nimetus;
		}

		//NÄIDISRETSEPTI kartulisalat loomine
@RequestMapping("/kartuliSalat")
		//String, kuhu küsitakse sisse vajalik_kogus
		public String kartuliSalat(double vajalik_kogus) {
				//Loob uue objekti kartul ja annab objektile omadused
				Toiduained kartul = new Toiduained(1, "kartul", 50, 8, 10);
				Toiduained hapukoor = new Toiduained(2, "hapukoor", 15, 50, 20);
				Toiduained vorst = new Toiduained(3, "vorst", 43, 30, 10);
				Toiduained muna = new Toiduained(4, "muna", 10, 20, 32);
				Toiduained juust = new Toiduained(5, "juust", 12, 30, 40);

				//Loob uue objekti Toidukomponent kartulid ja annab sellele kartuli omadused ja lisaks selle kartuli koguse
				//Loon retsepti
				Toidukomponendid kartulid = new Toidukomponendid();
				kartulid.toiduaine = kartul;
				kartulid.kogus = 34;

				Toidukomponendid hapukoored = new Toidukomponendid();
				hapukoored.toiduaine = hapukoor;
				hapukoored.kogus = 10;

				Toidukomponendid vorstid = new Toidukomponendid();
				vorstid.toiduaine = vorst;
				vorstid.kogus = 7;

				Toidukomponendid munad = new Toidukomponendid();
				munad.toiduaine = muna;
				munad.kogus = 10;

				Toidukomponendid juustud = new Toidukomponendid();
				juustud.toiduaine = juust;
				juustud.kogus = 15;

				Salat kartuliSalat = new Salat();
				kartuliSalat.nimetus = "kartulisalat";
				//Toidukomponentid lisab listi toiduKomponendidList
				kartuliSalat.toiduKomponendidList.add(kartulid);
				kartuliSalat.toiduKomponendidList.add(hapukoored);
				kartuliSalat.toiduKomponendidList.add(vorstid);
				kartuliSalat.toiduKomponendidList.add(munad);
				kartuliSalat.toiduKomponendidList.add(juustud);

				//Saadab salati komponentide vajaliku koguse arvutamiseks info arvutamisemeetodisse
		return kartuliSalat.vajalikKogus(vajalik_kogus);
		}

//SALATI LOOMINE
@RequestMapping("/salat")
		public String toiduKomponent() {
				Toiduained kartul = new Toiduained(1, "kartul", 50, 8, 10);
				Toiduained hapukoor = new Toiduained(2, "hapukoor", 15, 50, 20);
				Toiduained vorst = new Toiduained(3, "vorst", 43, 30, 10);
				Toiduained muna = new Toiduained(4, "muna", 10, 20, 32);
				Toiduained juust = new Toiduained(5, "juust", 12, 30, 40);


				Toidukomponendid kartulid = new Toidukomponendid();
				kartulid.toiduaine = kartul;
				kartulid.kogus = 34;

				Toidukomponendid hapukoored = new Toidukomponendid();
				hapukoored.toiduaine = hapukoor;
				hapukoored.kogus = 10;

				Toidukomponendid vorstid = new Toidukomponendid();
				vorstid.toiduaine = vorst;
				vorstid.kogus = 7;

				Toidukomponendid munad = new Toidukomponendid();
				munad.toiduaine = muna;
				munad.kogus = 10;

				Toidukomponendid juustud = new Toidukomponendid();
				juustud.toiduaine = juust;
				juustud.kogus = 15;

				Salat kartuliSalat = new Salat();
				kartuliSalat.nimetus = "kartulisalat";
				kartuliSalat.toiduKomponendidList.add(kartulid);
				kartuliSalat.toiduKomponendidList.add(hapukoored);
				kartuliSalat.toiduKomponendidList.add(vorstid);
				kartuliSalat.toiduKomponendidList.add(munad);
				kartuliSalat.toiduKomponendidList.add(juustud);

	  return kartuliSalat.toString();
		}
//Kõigi toiduainete listimiseks
@RequestMapping("/listall")
    String listall(String toiduaine_nimetus) {
        StringBuffer sb = new StringBuffer();
				//Võtab andmebaasist toiduained
	        for (Toiduained item : tabeliHaldur.findAll()) {
	            sb.append(item);
	        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
    return thead + sb.toString();
    }

//ANDMEBAASI ANDMETE LISAMINE
@RequestMapping("/lisa")
    String lisa(String toiduaine_nimetus, Integer valgud_protsent, Integer rasvad_protsent, Integer sysivesikud_protsent) {
        Toiduained toiduained = new Toiduained();
        toiduained.toiduaine_nimetus = toiduaine_nimetus;
				toiduained.valgud_protsent = valgud_protsent;
				toiduained.rasvad_protsent = rasvad_protsent;
				toiduained.sysivesikud_protsent = sysivesikud_protsent;


					if((valgud_protsent + rasvad_protsent + sysivesikud_protsent) > 100){
		 return toiduained.protsendiError();
				}
					else {
					//Salvestab andmebaasi tabelisse toiduained
					tabeliHaldur.save(toiduained);

					//Väljastab info, mis andmed andmebaasi lisati
	   return "Lisatud " + toiduaine_nimetus + valgud_protsent + rasvad_protsent + sysivesikud_protsent;
				}

    }

//ADNMEBAASIST ANDMETE KUSTUTAMINE
 @RequestMapping("/kustuta")
	    String kustuta(Integer id) {
	        Toiduained toiduained = tabeliHaldur.findOne(id);
						if(toiduained==null){return "Antud id-ga toiduainet ei leidu";}
					//Kustutab tabelist toiduained vastava id-ga kirje
	        tabeliHaldur.delete(toiduained);


	   return toiduained.toiduaine_nimetus + " " + " on kustutatud";

	    }

		//ANDMEBAASIST ANDMETE VAHEMIKU OTSIMINE
		@RequestMapping("/rasvaotsing")
		public String rasvaotsing(double rasvad_min, double rasvad_max){
			StringBuffer sb = new StringBuffer();
				for(Toiduained item : tabeliHaldur.findAll()){
					//Kontrollib kas toiduaine rasvaprotsent jääb etteantud vahemikku, kui jääb, appendib sb-sse
							if(item.rasvad_protsent > rasvad_min && item.rasvad_protsent < rasvad_max){
								sb.append(item);
								//return "Otsimine õnnestus";
							}
				}
			//Tabeli lahtrite nimetused
			String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Susivesikud</th></tr>";
			//Tagastab tabeli lahtrite nimetused ja sb-s oleva info
   return thead + sb.toString();
		}






    public static void main(String[] args) {
        System.getProperties().put("server.port", 12236);
        SpringApplication.run(Rakendus.class, args);
    }
	}

//Kiirem käivitus
//java -Djava.security.egd=file:/dev/./urandom -jar demo.jar"
