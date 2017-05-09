package kirke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Kasutus{

	@RequestMapping("/lause")
	public String Lause(String tekst) {
		Lause s1 = new Lause(tekst);
		return "Tähte A on lauses "+ s1.T2heesinemine('a') + " korda.";
		//+"Selles lauses on "+ s1.S6nadearv() + " sõna. "


	}
	@RequestMapping("/tähed")
	public String T2hederaldi(String tekst) {
		String abi = "";
		Lause s1 = new Lause(tekst);
		int kogus = s1.S6nadearv();
		for(int i=0; i<kogus; i++){
			S6na s = s1.kysiS6na(i);
      abi += s.s6na+s.T2heesinemine('a')+" ";
    }
		return "Tähte A on sõnades vastavalt järgnev arv kordi: "+abi;
}
	public static void main(String[] arg) {
		SpringApplication.run(Kasutus.class, arg);
	}
}
