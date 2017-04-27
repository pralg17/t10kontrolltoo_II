package randotm;

public class Song {

	Triad[] tacts;

	public Song(int numberOfTacts) {
		Triad[] tactsOfSong = new Triad[numberOfTacts];
		this.tacts = tactsOfSong;
	}
	
	public void addTact(Triad chord) {
		for(int i=0;i<tacts.length;i++) {
			if(tacts[i] == null) {
				tacts[i] = chord;
				break;
			}
		}
	}

	public String writeOutTones() {
		String output = "";
		for(int i=0;i<tacts.length;i++) {
			output += tacts[i].tonesToPlay();
		}
		return output;
	}

	public String writeOutLetters() {
		String output = "";
		for(int i=0;i<tacts.length;i++) {
			output += tacts[i].lettersToPlay();
		}
		return output;
	}

}