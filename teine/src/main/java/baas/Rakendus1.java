package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;
import liides.*;


@RestController
@SpringBootApplication
public class Rakendus1 {



  @RequestMapping("/lause")
  public String lisatavTekst(String tekst){
    String abi = "";
    Lause s = new Lause();
    s.lisa(tekst);
    HarilikT2htedeLoendur[] m = s.kysiS6nad();
    for(int i=0; i<m.length; i++){
      abi += m[i].kysiS6na()+"("+m[i].mituT2hte('a')+")"+"<br>";
    }
    return "Lause: "+s.kysi()+"<br>"+"Lauses a tähti kokku: "+s.mituT2hte('a')
    +"<br>"+"Lauses sõnu kokku: "+s.paljusõnuon()
    +"<br>"+"Sõnad eraldi: "+abi;
  }

  @RequestMapping("/tähed")
  public String lisaTekst(String tekst){

    Lause s = new Lause();
    s.lisa(tekst);

    return ""+s.mituT2hte('a');
  }
/*
    @RequestMapping("/sõnad")
    public String Tekst(String tekst){
      if(httpSession.getValue("hoidla")==null){
          httpSession.putValue("hoidla", new Lause());
      }
      Liides ladu = (Liides)httpSession.getValue("hoidla");
      ladu.lisa(tekst);
      String[] sonad = tekst.split(" ");


      return "Lause: "+ladu.kysi()+"<br>"+"Sõnad eraldi: "+sonad;
    }
*/
  public static void main(String[] args) {
		System.getProperties().put("server.port", 4302);
		SpringApplication.run(Rakendus1.class);
	}


}
