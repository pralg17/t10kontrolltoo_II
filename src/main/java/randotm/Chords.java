 package randotm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication

public class Chords {



	@RequestMapping("/chord")
	public String chord(String chord) {
		Triad chordTriad = getTriad(chord);
		if (chordTriad != null) {
			int base = chordTriad.base();
			int bigTert = chordTriad.bigTert();
			int quint = chordTriad.quint();
			return "Mängi noodid: " + String.valueOf(base) + " " + String.valueOf(bigTert) + " " + String.valueOf(quint);
		} else {
			return "Selle akordi põhinoot on mulle tundmata.";
		}
	}

	public Triad getTriad(String chord) {
		if (chord.equals("C") || chord.equals("c")) {
			return new CTriad();
		} else if (chord.equals("F") || chord.equals("f")) {
			return new FTriad();
		} else if (chord.equals("G") || chord.equals("g")) {
			return new GTriad();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 4200);
        SpringApplication.run(Chords.class, args);
	}

 }