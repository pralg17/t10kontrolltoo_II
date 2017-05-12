package viljar;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Avaldaja {

  @RequestMapping("/plusalleel")
    String liitja(String alleel1, String alleel2, String y1,String y2 ){
      Integer x1=Integer.valueOf(y1);
      int x2=Integer.parseInt(y2);
      Geen1[] sisu=new Geen1[2];
      sisu[0]= new Geen1(alleel1, x1);
      sisu[1]= new Geen1(alleel2, x2);
      return new PositiivneAlleel().PositiivneAlleel(sisu);
    }
  @RequestMapping("/geenilooja")
    String geenilooja(String alleel1, String alleel2, String alleel3, String alleel4,
    int vaartus1, int vaartus2,int vaartus3, int vaartus4){
      Geen1[] isa=new Geen1[2];
      isa[0]= new Geen1(alleel1, vaartus1);
      isa[1]= new Geen1(alleel2, vaartus2);
      Geen1[] ema=new Geen1[2];
      ema[0]= new Geen1(alleel3, vaartus3);
      ema[1]= new Geen1(alleel4, vaartus4);

     return new GeeniLooja().GeeniLooja(isa,ema);
    }

public static void main(String[] args)throws IOException{
  System.getProperties().put("server.port", 2497);
  SpringApplication.run(Avaldaja.class, args);
}
}
