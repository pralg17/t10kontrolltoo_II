const c = require("./classes")
const mongoose = require("mongoose")
mongoose.connect('mongodb://localhost:27017/kt2')
const db = mongoose.connection
db.on('error', console.error.bind(console,'connection:error'))
db.once('open', ()=> console.log('MongoDB on püsti!'))

const m = require("./Toiduaine.model")

const assertEquals = function(name, given, expected){
    if(arguments.length!==3) throw new Error("Not enough arguments provided!")
    else {
        if(given !== expected) {
            console.log(`Test ${name} failed! Expected ${expected}, got ${given}`)
        } else {
            console.log(`Test ${name} passed!`)
        }
    }
}
const assertDiff = function(name, given, expected){
    if(arguments.length!==3) throw new Error("Not enough arguments provided!")
    else {
        if(given === expected) {
            console.log(`Test ${name} failed! Values match`)
        } else {
            console.log(`Test ${name} passed! ${given} & ${expected}`)
        }
    }
}

let kaalikas = new c.Toiduaine("Kaalikas",20,5,30)
let kaalikaId
m.uus('kaalikas',20,5,30)
    .then(d => {console.log(d), kaalikaId=d._id})
    .catch(e=>console.log(e))


assertEquals('valgud',kaalikas.valgud,20)

let hapukoor = new c.Toiduaine('Hapukoor',5,50,30)
let hapukooreId
m.uus('hapukoor',5,50,30)
    .then(d => {console.log(d), hapukooreId=d._id})
    .catch(e=>console.log(e))

setTimeout(()=>{
    assertDiff('Kaalika ja hapukoore id on erinev',hapukooreId,kaalikaId)
    m.kustuta("Kaalikas")
    m.kustuta("Hapukoor")
}, 2000)

