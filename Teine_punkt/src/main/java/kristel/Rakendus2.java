package kristel;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.beans.factory.annotation.Autowired;
 import javax.servlet.http.HttpSession;



 @RestController
 @SpringBootApplication
 public class Rakendus2 {

   @RequestMapping("/lause")
   public String uusTekst(String tekst){
     String abi = "";
     Lause s = new Lause();
     s.lisa(tekst);
     HarilikT2heLoendur[] m = s.kysiS6nad();
     for(int i=0; i<m.length; i++){
          abi += m[i].kysiS6na()+"( a-si: "+m[i].paljuT2hti('a')+")"+"<br>";
        }
        return "Antud lause: "+s.kysi()+"<br>"+" a tähti selles lauses: "+s.paljuT2hti('a')
        +"<br>"+"Sõnade arv: "+s.paljusõnuon()
        +"<br>"+"Sõnades a tähti: <br>"+abi;
     }

   @RequestMapping("/tähed")
   public String lisaTekst(String tekst){

     Lause s = new Lause();
     s.lisa(tekst);

     return ""+s.paljuT2hti('a');
   }

   public static void main(String[] args) {
 		System.getProperties().put("server.port", 5240);
 		SpringApplication.run(Rakendus2.class);
 	}


 }
