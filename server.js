const express = require("express")
const bp = require("body-parser")
const app = express()
const c = require("./classes")
const mongoose = require("mongoose")

mongoose.connect('mongodb://localhost:27017/kt2')
const db = mongoose.connection
db.on('error', console.error.bind(console,'connection:error'))
db.once('open', ()=> console.log('MongoDB on püsti!'))

const m = require("./Toiduaine.model")

app.use(bp.json())

app.get("/", (req,res) => {
    res.json("Tere")
})
app.post("/uus", (req,res) => {
    if(req.body.nimi && req.body.valgud && req.body.rasvad && req.body.sysivesikud){
        m.uus(req.body.nimi, req.body.valgud, req.body.rasvad, req.body.süsivesikud)
            .then(doc => res.json(doc))
            .catch(e => console.log(e))
    }
})
app.listen(process.env.port || 3456, () => console.log(`Server kuulab porti ${process.env.port || 3456}`))
