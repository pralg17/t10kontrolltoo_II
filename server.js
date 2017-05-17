const express = require("express")
const bp = require("body-parser")
const app = express()
const cors = require('cors')
const c = require("./classes")
const mongoose = require("mongoose")
mongoose.connect('mongodb://localhost:27017/kt2')
const db = mongoose.connection
db.on('error', console.error.bind(console,'connection:error'))
db.once('open', ()=> console.log('MongoDB on püsti!'))

const m = require("./Toiduaine.model")

app.use(cors())
app.use(bp.json())

const toidud = []

app.use(express.static('fe'))

app.get("/k6ik", (req,res) => {
    m.kõik()
        .then(data => res.json(data))
        .catch(error => console.log(error))
})
app.post("/uus", (req,res) => {
    if(req.body.nimi && req.body.valgud && req.body.rasvad && req.body.sysivesikud){
        m.uus(req.body.nimi, req.body.valgud, req.body.rasvad, req.body.sysivesikud)
            .then(doc => res.json(doc))
            .catch(e => console.log(e))
    }
})
app.delete("/:nimi", (req,res) => {
    if(req.params.nimi) {
        m.kustuta(req.params.nimi)
            .then(data => res.json("kustutasin "+req.params.nimi))
            .catch(e => console.log(e))
    }
})
app.get("/otsi/toiduaine/:min/:max", (req,res) => {
    if(!req.params.min || !req.params.max) {
        res.json("Oops, something's gone wrong!")
    } else {
         m.otsivahemik(req.params.min, req.params.max)
        .then(data => res.json(data))
        .catch(e => console.log(e))
    }
})

app.post("/toit", (req,res)=> {
    try{
        let toit = new c.Toit(req.body.nimi,req.body.koostis, req.body.kogus)
        toidud.push(toit)
        res.json("Lisatud!")
    } catch(e) {
        res.json("Ei lisatud! "+e)
    }
    
})
app.get("/toidud", (req,res)=> {
    res.json(toidud)
})
app.get("/toit/:nimi/:kogus",(req,res)=>{
    let toit, leitud = false
    for(let i = 0; i<toidud.length; i++) {
        if(toidud[i].nimi === req.params.nimi) {
            toit = toidud[i]
            leitud = true
            break
        }
    }
    if(!leitud) {
        res.json("Toitu ei leitud!")
    } else {
        let komponentideKogused = toit.arvutaKomponendid(req.params.kogus)
        res.json({
            nimi: toit.nimi,
            kogused: komponentideKogused
        })
    }
})

app.delete("/toit/:nimi", (req,res)=> {
    let deleted = false
    for(let i = 0; i<toidud.length; i++) {
        if(toidud[i].nimi === req.params.nimi) {
            toidud.splice(i,1)
            deleted = true
            break
        }
    }
    res.json(deleted ? "Kustutatud!" : "Sellise nimega toitu ei leitud!")
})

app.listen(process.env.port || 3456, () => console.log(`Server kuulab porti ${process.env.port || 3456}`))
/**
 * Otsimine rasvaprotsendivahemiku j'rgi - tehtud
 * Toidu klass. Rasvade, valkude, sysiv. kogused. Loo nt. kartulisalat. Valitud toidu etteantud koguse jaoks vajalikud toiduained.
 * Kontrolli testiga andmete õigsust.
 */