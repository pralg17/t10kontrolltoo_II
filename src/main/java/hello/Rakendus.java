package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Rakendus {
    private final ToitDao toitDao;

    @Autowired
    public Rakendus(ToitDao toitDao) {
        this.toitDao = toitDao;
    }

    //Loo mõned toidukomponendid (nt. 100 g kartuleid, 30 g hapukoort, 50 g vorsti).
    @RequestMapping("/toidukomponendid")
    public String toiduKomponent(){
        //Loo mõni toiduaine (nt. kartul, hapukoor, vorst)
        Toit kartul = new Toit(1, "kartul", 1, 1, 1);
        Toit hapukoor = new Toit(2,"hapukoor", 2, 2, 2);
        Toit vorst = new Toit(3,"vorst", 3, 3, 3);

        //Loo mõned toidukomponendid (nt. 100 g kartuleid, 30 g hapukoort, 50 g vorsti).

        Toidukomponent kartulKokku = new Toidukomponent();
        kartulKokku.toit = kartul;
        kartulKokku.kogus = 10;

        //Lisa toidukomponendile käsklus selle sees leiduva rasvakoguse arvutamiseks.

        return null;
    }

    @RequestMapping("/listall")
     String listall() {

        StringBuffer sb = new StringBuffer();
        for (Toit item : toitDao.findAll()) {
            sb.append(item);
        }
        String thead = "<tr><th>Id</th> <th>Niemtus</th> <th>Valgud</th ><th>Rasvad</th> <th>Süsivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/otsi") //rasva % järgi
    public String vahemik(double rasvadOtsitav){

        StringBuffer sb = new StringBuffer();
        for(Toit item : toitDao.findAll()){
            if (Math.abs(rasvadOtsitav-item.rasvad) <= 10){
                sb.append(item);
            }
        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Sysivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/lisa")
    String lisa(Integer id, String nimetus, Integer valgud, Integer rasvad, Integer sysivesikud) {
        if(valgud>100){
            throw new RuntimeException("100");
        }
        Toit toit = new Toit();
        toit.nimetus = nimetus;
        toit.valgud = valgud;
        toit.rasvad = rasvad;
        toit.sysivesikud = sysivesikud;
        toitDao.save(toit);
        return nimetus + "on lisatud , kuvamiseks vajuta nuppu";
    }

    @RequestMapping("/kustuta")
    public String kustuta(Integer id) {
        Toit toit = toitDao.findOne(id);
        toitDao.delete(toit);
        return "Kustutasid toiduaine" + toit.nimetus;
    }

    public static void main(String[] args) {
        System.getProperties().put("server.port", 4207);
        SpringApplication.run(Rakendus.class, args);
    }
}