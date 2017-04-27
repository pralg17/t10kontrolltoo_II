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

}

function showTriad(basenote) {

}

function getAlphabetic(note) {
  if (!isNaN(note)) {
  note = Number(note);
  if (note >= 73) {note -= 12;}
  if (note <= 60) {note += 12;}
  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = names[heights.indexOf(note)];
  return noteHeight;
} else {
  return Number(note);
}
}

function getNumeric(note) {
  if (isNaN(note))
{  var heights = [60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72];
  var names = ["C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"];
  var noteHeight = heights[names.indexOf(note)];
  return Number(noteHeight);
} else {
  return Number(note);
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
    this.taktid.push(new Takt(chordBase));
    this.printSong();
  }

  showChordConstructs(option) {
    var outputLocation = document.getElementById("songoutput");
    var output = "";
    var i;
    for (i = 0; i < this.taktid.length; i++) {
      var mt = Number(this.taktid[i].chord.maintone);
    if (option == "notes") {
      output += "" + getAlphabetic(mt) + " " + getAlphabetic(mt+4) + " " + getAlphabetic(mt+7) + "<br>";
    } else {
      var terts = Number(mt) + 4;
      var kvint = Number(mt) + 7;
      if (terts >= 73) {terts -= 12;}
      if (kvint >= 73) {kvint -= 12;}
      output += "" + mt + " " + terts + " " + kvint + "<br>";
    }
    }
    outputLocation.innerHTML = output;
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
  if (isNaN(value))
  {var noteHeight = heights[names.indexOf(value)];} else {
    noteHeight = Number(value);
  }
  //console.log(noteHeight);
  temp = new Kolmkõla(noteHeight);
  output.innerHTML = temp.getNames();
}

function testFirst() {
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

function testThird() {
  var textBox = document.getElementById("songAddChord");
  var songoutput = document.getElementById("songoutput");
  var successfulTests = 0
  textBox.value = "C";
  Song.addChord();
  textBox.value = "E";
  Song.addChord();
  textBox.value = "67";
  Song.addChord();
  textBox.value = "H";
  Song.addChord();
  textBox.value = "B";
  Song.addChord();
  console.log(songoutput.innerHTML);
  if (songoutput.innerHTML == "CEGHB") {successfulTests += 1;}
  Song.removeLastChord();
  console.log(songoutput.innerHTML);
  if (songoutput.innerHTML == "CEGH") {successfulTests += 1;}
  Song.showChordConstructs('numbers');
  console.log(songoutput.innerHTML);
  if (songoutput.innerHTML == "60 64 67<br>64 68 71<br>67 71 62<br>71 63 66<br>") {successfulTests += 1;}
  Song.showChordConstructs('notes');
  if (songoutput.innerHTML == "C E G<br>E G# H<br>G H D<br>H Eb F#<br>") {successfulTests += 1;}
  console.log(songoutput.innerHTML);
  console.log("Läbiti " + successfulTests + " testi 4st.");
}

CKolmkõla = new Kolmkõla(60);
FKolmkõla = new Kolmkõla(65);
GKolmkõla = new Kolmkõla(67);
testFirst();
