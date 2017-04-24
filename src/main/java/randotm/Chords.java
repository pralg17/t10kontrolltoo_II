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



	@RequestMapping("/notes+t")
	public String chordTones(int chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.tonesToPlay();
	}

	@RequestMapping("/notes+l")
	public String chordTones(int chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.lettersToPlay();
	}


	@RequestMapping("/letters+t")
	public String chordLetter(String chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.tonesToPlay();
	}

	@RequestMapping("/letters+l")
	public String chordLetter(String chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.lettersToPlay();
	}

	@RequestMapping("song")
	public String song(int tacts) {
		Song s1 = new Song(tacts);
		return "Tere";
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