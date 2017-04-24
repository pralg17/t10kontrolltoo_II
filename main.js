class Kolmkõla {
  constructor(põhitoon) {
    this.maintone = põhitoon;
    this.sterts = this.maintone + 4;
    this.kvint = this.maintone + 7;
    if (this.sterts >= 73) {this.sterts -= 12;}
    if (this.kvint >= 73) {this.kvint -= 12;}
  }

  getNames() {
    var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
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

function getAlphabetic(note) {
  if (typeof note == "number") {
  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = names[heights.indexOf(note)];
  return noteHeight;
} else {
  return note;
}
}

function getNumeric(note) {
  if (isNaN(note))
{  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = heights[names.indexOf(note)];
  return noteHeight;
} else {
    return note;
  }
}

class Lugu {
  constructor(name) {
    this.name = name;
    this.taktid = [];
  }
  removeLastChord() {
    this.taktid.pop();
    this.printSong();
  }
  addChord() {
    var chordBase = document.getElementById("songAddChord").value;
    chordBase = getNumeric(chordBase);
    console.log(chordBase);
    this.taktid.push(new Takt(chordBase));
    this.printSong();
  }
  printSong() {
    var outputLocation = document.getElementById("songoutput");
    var output = "";
    var i;
    for (i = 0; i < this.taktid.length; i++) {
      output += getAlphabetic(this.taktid[i].chord.maintone);
    }
    outputLocation.innerHTML = output;
    return output;

  }

}

Song = new Lugu("Song");


class Takt {
  constructor(height) {
    this.chord = new Kolmkõla(height);
  }
}


function getPlayedNotes() {
  textbox = document.getElementById('chordname');
  output = document.getElementById("chordoutput");
  var value = textbox.value;
  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = heights[names.indexOf(value)];
  temp = new Kolmkõla(noteHeight);
  output.innerHTML = temp.getNames();
}

function test() {
  var expectedOutput1 = "C E G";
  var expectedOutput2 = "A C# E";
  var expectedOutput3 = "C E G";
  var expectedOutput4 = "undefined undefined undefined";
  testK1 = new Kolmkõla(60);
  testK2 = new Kolmkõla(69);
  testK3 = new Kolmkõla(72);
  testK4 = new Kolmkõla(36);
  var actualOutput1 = testK1.getNames();
  var actualOutput2 = testK2.getNames();
  var actualOutput3 = testK3.getNames();
  var actualOutput4 = testK4.getNames();
  if (expectedOutput1 == actualOutput1 && expectedOutput2 == actualOutput2 && expectedOutput3 == actualOutput3 && expectedOutput4 == actualOutput4) {
    return "Test läbiti edukalt.";
  } else {
    console.log("Expected " + expectedOutput1 + "\nActual " + actualOutput1);
    console.log("Expected " + expectedOutput2 + "\nActual " + actualOutput2);
    console.log("Expected " + expectedOutput3 + "\nActual " + actualOutput3);
    console.log("Expected " + expectedOutput4 + "\nActual " + actualOutput4);
    return "Test nurjus, tulemused konsoolis.";
  }
}

CKolmkõla = new Kolmkõla(60);
FKolmkõla = new Kolmkõla(65);
GKolmkõla = new Kolmkõla(67);
test();
