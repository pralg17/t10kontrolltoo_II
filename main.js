class Kolmkõla {
  constructor(põhitoon) {
    this.maintone = põhitoon;
    this.sterts = this.maintone + 4;
    this.kvint = this.maintone + 7;
    if (this.sterts > 73) {this.sterts -= 12;}
    if (this.kvint > 73) {this.kvint -= 12;}
  }

  getNames() {
    var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73];
    var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
    return names[heights.indexOf(this.maintone)] + " " + names[heights.indexOf(this.sterts)] + " " + names[heights.indexOf(this.kvint)];
  }

  explain(tone) {
    return this.maintone + " " + this.sterts + " " + this.kvint;
  }

  test() {
    // automaattesti jaoks cuz i'm lazy
  }
}


class Lugu {
  constructor(name) {
    this.name = name;
    this.taktid = [];
  }
  addBar(chordBase) {
    this.bars.append(new Takt(chordBase));
  }
}

class Takt {
  constructor(height) {
    this.chord = new Kolmkõla(height);
  }
}

function getPlayedNotes() {
  textbox = document.getElementById('chordname');
  output = document.getElementById("chordoutput");
  var value = textbox.value;
  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = heights[names.indexOf(value)];
  temp = new Kolmkõla(noteHeight);
  output.innerHTML = temp.getNames();
}

CKolmkõla = new Kolmkõla(60);
FKolmkõla = new Kolmkõla(65);
GKolmkõla = new Kolmkõla(67);
