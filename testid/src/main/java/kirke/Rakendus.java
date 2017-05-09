package kirke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Rakendus{
  @RequestMapping("/tervita")
  public String tervitamine(String eesnimi){
    return "Tere, "+eesnimi;
  }
  //Lisage aadress silindri ruumala leidmiseks
  //Kasuta arvutamisel silindri klassi teenust
  //Kontrolli veebikaudset arvutust testi abil
  @RequestMapping("/silindriruumala")
  public String silindriruumala(double raadius, double korgus){
    Silinder s1=new Silinder(raadius, korgus);
    return "Silindri ruumala on "+s1.ruumala();
  }
  public static void main(String[] arg){
    SpringApplication.run(Rakendus.class, arg);
  }
}
