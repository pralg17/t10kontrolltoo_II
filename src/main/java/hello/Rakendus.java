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



    @RequestMapping("/listall")
     String listall(String mark) {
        StringBuffer sb = new StringBuffer();
        for (Toit item : toitDao.findAll()) {
            sb.append(item);
        }
        String thead = "<tr><th>Id</th> <th>Niemtus</th> <th>Valgud</th ><th>Rasvad</th> <th>Süsivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/lisa")
    String lisa(String nimetus, Integer valgud, Integer rasvad, Integer sysivesikud) {
        if(valgud>100){
            throw new RuntimeException("100");
        }
        Toit toit = new Toit();
        toit.nimetus = nimetus;
        toit.valgud = valgud;
        toit.rasvad = rasvad;
        toit.sysivesikud = sysivesikud;
        toitDao.save(toit);
        return "Lisatud " + nimetus + valgud + rasvad + sysivesikud;
    }



    public static void main(String[] args) {
        System.getProperties().put("server.port", 4207);
        SpringApplication.run(Rakendus.class, args);
    }
}