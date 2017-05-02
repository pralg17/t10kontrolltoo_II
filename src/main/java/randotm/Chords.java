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

	@Autowired
	HttpSession session;

	@RequestMapping("/new_song")
	public void genSong(int tacts) {
		Song s = new Song(tacts);
		session.putValue("song", s);
	}

	@RequestMapping("/add_tact")
	public void addTactToSongByLetter(String chordSymbol) {
		Song s = (Song)session.getValue("song");
		String[] chordSymbols = chordSymbol.split("\\s+");
		for(int i=0;i<chordSymbols.length;i++) {
			try {
				Triad chord = new Triad(Integer.parseInt(chordSymbols[i]));
				s.addTact(chord);
				session.putValue("song", s);
			} catch(Exception e) {
				Triad chord = new Triad(chordSymbols[i]);
				s.addTact(chord);
				session.putValue("song", s);
			}
		}
	}

	@RequestMapping("song/t")
	public String getSongWithTones() {
		Song s = (Song)session.getValue("song");
		return s.writeOutTones();
	}

	@RequestMapping("song/l")
	public String getSongWithLetters() {
		Song s = (Song)session.getValue("song");
		return s.writeOutLetters();
	}

	@RequestMapping("/notes/t")
	public String toneToTones(int chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.tonesToPlay();
	}

	@RequestMapping("/notes/l")
	public String toneToLetters(int chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.lettersToPlay();
	}


	@RequestMapping("/letters/t")
	public String letterToTones(String chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.tonesToPlay();
	}

	@RequestMapping("/letters/l")
	public String letterToLetters(String chord) {
		Triad chordTriad = new Triad(chord);
		return chordTriad.lettersToPlay();
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