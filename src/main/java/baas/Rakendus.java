package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Rakendus{

    private final AlleelData aData;
    private final GeenData gData;

    @Autowired
    public Rakendus(AlleelData aData, GeenData gData){
        this.aData = aData;
        this.gData = gData;
    }


  @RequestMapping ("/lisalaps2")
  public String lisaLaps2(String nimetus, boolean emaalleel1, boolean emaalleel2, boolean isaalleel1, boolean isaalleel2){
      Alleel ema1 = new Alleel(nimetus, emaalleel1);
      Alleel ema2 = new Alleel(nimetus, emaalleel2);
      Alleel isa1 = new Alleel(nimetus, isaalleel1);
      Alleel isa2 = new Alleel(nimetus, isaalleel2);
      Geen ema = new Geen(ema1, ema2);
      Geen isa = new Geen(isa1, isa2);
      Geen laps = new Geen(ema, isa);
      String print = laps.toString();
      aData.save(ema1);
      aData.save(ema2);
      aData.save(isa1);
      aData.save(isa2);
      gData.save(laps);
      return "lisasid lapse: " + print;
  }

  @RequestMapping("/otsiGeeni")
  public String otsiGeeni(String nimetus){
      StringBuilder stringBuffer = new StringBuilder();
       for(Geen geen: gData.findAll()){
           if(geen.getAlleel1().getNimetus().equals(nimetus)){
               stringBuffer.append("<p>").append(geen.toString());
           }
       }

       return stringBuffer.toString();
  }

  @RequestMapping("/koikGeenid")
  public String koikGeenid(){
      StringBuilder stringBuffer = new StringBuilder();
      stringBuffer.append("<p>Vali üks ema</p>").append("<form action='lisalaps'>");
       for(Geen geen: gData.findAll()){
              stringBuffer.append("<input type='checkbox' name=id1 value="+geen.getId()+">").
                       append(geen.toString()).
                       append("</input><br>");
       }
       stringBuffer.append("<br><br>Vali üks isa<br>");
       for(Geen geen: gData.findAll()){
              stringBuffer.append("<input type='checkbox' name=id2 value="+geen.getId()+">").
                       append(geen.toString()).
                       append("</input><br>");
       }
       stringBuffer.append("<input type='submit'></form>");

       return stringBuffer.toString();
  }

  @RequestMapping ("/lisalaps")
  public String lisalaps(String id1, String id2){
         Geen ema= leiaGeen(Integer.parseInt(id1));
         Geen isa = leiaGeen(Integer.parseInt(id2));
         Geen laps = new Geen(ema, isa);
         Alleel ema1 = new Alleel(ema.getAlleel1().getNimetus(), ema.getAlleel1().isPositiivne());
         Alleel ema2 = new Alleel(ema.getAlleel2().getNimetus(), ema.getAlleel2().isPositiivne());
         Alleel isa1 = new Alleel(isa.getAlleel1().getNimetus(), isa.getAlleel1().isPositiivne());
         Alleel isa2 = new Alleel(isa.getAlleel2().getNimetus(), isa.getAlleel2().isPositiivne());

         aData.save(ema1);
         aData.save(ema2);
         aData.save(isa1);
         aData.save(isa2);
         gData.save(laps);
         return "lisasid lapse: " + laps;

     }
  public Geen leiaGeen(Integer id){
          Geen vastus = null;
          for(Geen geen: gData.findAll()){
              if(geen.getId().equals(id)){
                  vastus = geen;
              }
          }
          return vastus;
      }
  public Alleel leiaAlleel(Integer id){
          Alleel vastus = null;
          for(Alleel alleel: aData.findAll()){
              if(alleel.getId().equals(id)){
                  vastus = alleel;
              }
          }
          return vastus;
      }

  public static void main(String[] args) {
    System.getProperties().put("server.port", "1720");
    System.getProperties().put("spring.datasource.url", "jdbc:mysql://localhost:3306/if16_karroo?useSSL=false");
    System.getProperties().put("spring.datasource.maxActive", "2");
    System.getProperties().put("spring.datasource.username", "if16");
    System.getProperties().put("spring.datasource.password", "ifikad16");
		SpringApplication.run(Rakendus.class);
	}

}
 // http://localhost:5555/lisalaps?nimetus=proov&emaalleel1=true&emaalleel2=true&isaalleel1=true&isaalleel2=true
 // http://localhost:5555/otsiGeeni?nimetus=proov1
