//veebiserver aadressil draama.duckdns.org:30001
var express = require("express")
	var bodyParser = require('body-parser')
	var fs = require("fs")
	var app = express()
	app.use('/', express.static('./public'))
	app.use(bodyParser.urlencoded({
			extended: false
		}))
	app.use(bodyParser.json())
	app.listen(3000);

app.get('/', function (req, res) {
	console.log(req.body)
	res.send("test")
})
//klass toiduaine tarbeks
function Toiduaine(nimi, valgud, rasvad, sysivesikud) {

	this.nimi = nimi;
	this.valgud = valgud;
	this.rasvad = rasvad;
	this.sysivesikud = sysivesikud;

}

Toiduaine.prototype.info = function () {
	console.log(this.nimi + " sisaldab " + this.valgud + " protsenti valke, " + this.rasvad + " protsenti rasvu ja " + this.sysivesikud + " protsenti süsivesikuid")
}


var ained = []
var kartul = new Toiduaine("Kartul", 10, 75, 45);
var vorst = new Toiduaine("vorst", 10, 40, 60);

//kartul.info();

ained.push(kartul)
ained.push(vorst)

function Toidukomponent(kogus, viide) {
	this.kogus = kogus;
	this.viide = viide;
	this.rasvakogus = this.rasvad / 100 * this.kogus
}
//klass toidukomponendi tarbeks
Toidukomponent.prototype.rasvad = function () {
	var self = this
		var tulemused = []
		ained.forEach(function (element) {

			if (element.nimi.toLowerCase() === self.viide.toLowerCase()) {
				tulemused.push(element.rasvad)
			}
		})
		//rasvakoguse arvutamine
		if (tulemused.length > 0) {
			console.log(this.viide+": kogus "+this.kogus+" grammi, "+" sisaldab rasva " + tulemused[0] / 100 * self.kogus + " grammi")
		} else {
			console.log("toiduainet ei leitud")
		}
}
var kartulid = new Toidukomponent(100, "kartul")
var hapukoor = new Toidukomponent(30, "hapukoor")
var vorst = new Toidukomponent(50, "vorst")

kartulid.rasvad()
hapukoor.rasvad()
vorst.rasvad()
