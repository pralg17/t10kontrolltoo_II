"use strict"

const express = require('express')
const app = express()
const bodyParser = require('body-parser')
//const assert = require('assert')

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

var alleelid = []
var geenid = []
var liida = []
var notifikatsiooniNupp = ''

app.listen(3000, ()=>{
  console.log('Server jookseb pordil 3000')
  testid()
})

class Alleel {
    constructor(nimetus, toevaartus) {
        this.nimetus = nimetus
        this.toevaartus = toevaartus
        alleelid.push(this);
    }
    toString() {
        return `
        Alleeli nimetus: ${this.nimetus}
        <br> Tõeväärtus: ${this.toevaartus}<hr>
        `
    }
}

class Geen {
    constructor(nimetus, alleel1, alleel2) {
    	this.nimetus = nimetus
    	this.alleel1 = alleel1
        this.alleel2 = alleel2
        if(this.alleel1.nimetus === this.alleel2.nimetus){
        	if(this.alleel1.toevaartus == true || this.alleel2.toevaartus == true){
        		this.toevaartus = true
        	} else {
        		this.toevaartus = false
        	}
        } else {
        	break
        }
        geenid.push(this);
        // console.log(this)
    }
    toString() {
        return `
        <br>Nimetus: ${this.nimetus}
        <br> Alleel1: ${this.alleel1}
        <br> Alleel2: ${this.alleel2}
        <br> Geeni toevaartus: ${this.toevaartus}<br>
        <a href="http://46.101.173.169:3000/valjastaalleel/${this.nimetus}">Väljasta alleel</a>
        <a href="http://46.101.173.169:3000/liida/${this.nimetus}">Liida</a>
        <hr>`
    }
}

app.get('/liida/:nimetus', (req, res)=>{
	let nimetus = req.params.nimetus
	let geen = otsi(nimetus)
	if(geen != null){
		liida.push(otsi(nimetus))
		notifikatsiooniNupp = "<br>Liidetud!"
	} else {
		notifikatsiooniNupp = "Midagi läks valesti... :("
	}
	res.redirect('back')
})

app.get('/otsi/:nimetus', (req, res)=>{
	let nimetus = req.params.nimetus
	res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		${otsi(nimetus)}
		`)
})

const otsi = (nimetus)=>{
	for(let obj of geenid){
		if(obj.nimetus === nimetus){
			nimetus = obj
			return nimetus
		}
	}
	return null
}

const valjasta = (geen)=>{
	// Math.random() väljstab suvalise ujukomaarvu 0 ja 1 vahel
	for(let obj of geenid){
		if(obj.nimetus === geen){
			geen = obj
		}
	}

	let r = 100*Math.random()
	if(r >= 50){
		return geen.alleel1
	} else {
		return geen.alleel2
	}
}

const yhenda = (geen1, geen2)=>{
	for(let obj of geenid){
		if(obj.nimetus === geen1){
			geen1 = obj
		} else if(obj.nimetus === geen2){
			geen2 = obj
		}
	}
	var alleel1
	let r = 100*Math.random()
	if(r >= 50){
		alleel1 = geen1.alleel1
	} else {
		alleel1 = geen2.alleel1
	}
	let r0 = 100*Math.random()
	var alleel2
	if(r0 >= 50){
		alleel2 = geen1.alleel2
	} else {
		alleel2 = geen2.alleel2
	}
	console.log(alleel1)
	console.log(alleel2)

	if(alleel1 && alleel2){
		let yhendatud_geen = new Geen("Ühendatud_geen", alleel1, alleel2)
		return yhendatud_geen
	} else {
		console.log("Alleelid pole loodud!!!!")
	}

}

let alleel = new Alleel("Reesus", true)
let alleel0 = new Alleel("Reesus", false)
let geen = new Geen("Kaks_reesust", alleel, alleel0)
let geen2 = new Geen("Tore_geen", alleel, alleel0)

const kuvaNimed = (liida)=>{
	let pikkus = liida.length
	if(pikkus > 0){
		var list = []
		for(let i=0; i<pikkus; i++){
			list.push(liida[i].nimetus)
		}
		return list
	} else {
		return ''
	}
}

const kuiOnKaks = (liida)=>{
	let pikkus = liida.length
	if(pikkus == 2){
		let geenid = liida[0] + "/" + liida[1]
		return `<a href='http://46.101.173.169:3000/valitudgeenid'>Ühenda</a>`
	} else {
		return ''
	}
}

app.get('/valitudgeenid', (req, res)=>{
	if(liida.length == 2){

		let vastus = yhenda(liida[0].nimetus, liida[1].nimetus)

		res.send(`
			<a href="http://46.101.173.169:3000/">Avaleht</a>
			${vastus}
			`)
	} else {
		res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		<h3>Midagi läks valesti... :(</h3>
			`)
	}
})

app.get('/tyhjendaliida', (req, res)=>{
	liida = []
	notifikatsiooniNupp = "Tühjendatud!"
	res.redirect('back')
})

app.get('/', (req, res)=>{
  res.send(`
  	/otsi/geeninimi
  	<br>
  	/yhendageenid/geen1_nimi/geen2_nimi
  	<br>
  	${kuvaNimed(liida)}
  	<br>
  	${kuiOnKaks(liida)}
  	<br>
  	${notifikatsiooniNupp}
  	<br>
  	<a href="http://46.101.173.169:3000/tyhjendaliida">Tühjenda</a>
  	<br>
  	<h3 style="text-decoration: underline">Alleelid:</h3>
  	${alleelid}
  	<h3 style="text-decoration: underline">Geenid:</h3>
  	${geenid}
  	`)
})

app.get('/lisaalleel/:nimetus/:vaartus', (req, res)=>{
	let nimetus = req.params.nimetus;
	let vaartus = req.params.vaartus;
	let uus_alleel = new Alleel(nimetus, vaartus)

	res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		<h3>Tehtud!</h3>
		`)
})

app.get('/lisageen/:nimetus/:alleel1/:alleel2', (req, res)=>{
	let nimetus = req.params.nimetus;
	let alleel1 = req.params.alleel1;
	let alleel2 = req.params.alleel2;
	let uus_geen = new Geen(nimetus, alleel1, alleel2)

	res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		<h3>Tehtud!</h3>
		`)
})

app.get('/yhendageenid/:geen1/:geen2', (req, res)=>{
	let geen1 = req.params.geen1
	let geen2 = req.params.geen2
	
	res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		<h3>${yhenda(geen1, geen2)}</h3>
		`)
})

app.get('/valjastaalleel/:nimetus', (req, res)=>{
	let nimetus = req.params.nimetus
	console.log(nimetus)
	res.send(`
		<a href="http://46.101.173.169:3000/">Avaleht</a>
		${valjasta(nimetus)}
		`)
})

app.get('/lapsegeen/:nimetus/:vanem1/:vanem2', (req, res)=>{
	// vanem tuleb kujul 0,1,2 - arv tähendab +'ide arvu
	let nimetus = req.params.nimetus
	let vanem1 = req.params.vanem1
	let vanem2 = req.params.vanem2

	const juhuvaartus = (arv)=>{
		let tagastatav
		if(arv == 0){
			tagastatav = false
		} else if(arv == 1){
			let r = 100*Math.random()
			if(r>=50){
				tagastatav = true
			} else{
				tagastatav = false
			}
		} else if(arv == 2){
			tagastatav = true
		}
		console.log("tagastatav on: "+ tagastatav)
		return tagastatav
	}

	let uus_alleel1 = new Alleel(nimetus, juhuvaartus(vanem1))
	let uus_alleel2 = new Alleel(nimetus,juhuvaartus(vanem2))

	let uus_lapsegeen = new Geen(nimetus, uus_alleel1, uus_alleel2)

	res.send(`
	<a href="http://46.101.173.169:3000/">Avaleht</a>
	${uus_lapsegeen}
	`)
})

const testid = ()=>{

	let uus_alleel = new Alleel("Test_alleel", true)
	let a = uus_alleel.toevaartus
	let b = false

	let uus_alleel0 = new Alleel("Test_alleel", true)
	let z = uus_alleel0.toevaartus
	let c = true

	let uus_geen = new Geen("Test_geen", uus_alleel, uus_alleel)
	let x = 0
	let y = 1



	kasKlapivad(a,b)
	kasKlapivad(z,c)
	kasKlapivad(x,y)



	function kasKlapivad(a, b){
		console.log("\n..:::: T E S T ::::..\n")
		if(a !== b){
			console.log("ei ole võrdsed! " + a + " ei ole " + b + "(oodatav väärtus)")
		} else if (a === b){
			console.log("klapivad! " + a + "  on ekvivalentne " + b + "'ga")
		}
	}


}


//req.params.nimi