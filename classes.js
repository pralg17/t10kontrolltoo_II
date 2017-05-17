const mongoose = require("mongoose")
const m = require("./Toiduaine.model")

const Toiduaine = class {
    constructor(nimi,valgud,rasvad,süsivesikud) {
        if(nimi) {
            this.nimi = nimi
        } else {
            throw Error("Nimi puudub!")
        }
        if(valgud && typeof(valgud) === "number") {
            this.valgud = valgud
        } else if (valgud && typeof(valgud) !== "number") {
            throw Error("Valgusisaldus peab olema protsent(number)!")
        } else {
            throw Error("Valgusisaldus on puudu!")
        }

        if(rasvad && typeof(rasvad) === "number") {
            this.rasvad = rasvad
        } else if (rasvad && typeof(rasvad) !=="number") {
            throw Error("Rasvasisaldus peab olema protsent(number)!")
        } else {
            throw Error("Rasvasisaldus on puudu!")
        }

        if(süsivesikud && typeof(süsivesikud) === "number") {
            this.süsivesikud = süsivesikud
        } else if (süsivesikud && typeof(süsivesikud) !==number) {
            throw Error("Süsivesikute sisaldus peab olema protsent(number)!")
        } else {
            throw Error("Süsivesikute sisaldus on puudu!")
        }
        if(valgud && rasvad && süsivesikud){
            if((valgud + rasvad + süsivesikud)>100) {
                throw new Error("Protsentväärtuste kogusumma ületab 100!")
            }
        }
    }
}

const Toidukomponent = class extends Toiduaine {
    constructor(nimi, valgud, rasvad, süsivesikud, kogus = 1000) {
        super(nimi, valgud, rasvad, süsivesikud)
        if(typeof(kogus) === "number") {
            this.kogus = kogus 
        }
        this.rasvakogus = (this.rasvad/100)*this.kogus
    }
}
const Toit = class {
    constructor(nimi, koostis) {
        if(typeof(koostis) !== "object") {
            throw new Error("Koostis peab olema objekt!")
        }
        if(nimi) {
            this.nimi = nimi
        } else {
            throw Error("Nimi puudub!")
        }
        this.koostis = koostis
        this.kogus = 0
        this.komponendid = []
        this.kogused = []
        for(let i=0; i<koostis.length; i++) {
            m.üks(koostis[i]._id)
                .then(data => {
                    if(data == null) throw Error("Komponent ei ole loodud!")
                    this.komponendid.push(data);
                    this.kogused.push(koostis[i].kogus), this.kogus += parseInt(koostis[i].kogus)
                })
                .catch(e=>console.log(e))
        }
    }
    annaSisaldused() {
        let rasvad=0,süsivesikud=0,valgud=0,i=0
        for(let i=0;i<this.komponendid.length;i++) {
            rasvad += (this.komponendid[i].rasvad/this.kogused[i]*100);
            valgud+=(this.komponendid[i].valgud/this.kogused[i]*100)
            süsivesikud+=(this.komponendid[i].süsivesikud/this.kogused[i]*100)
        }
        console.log(rasvad,valgud,süsivesikud)
        return({
            rasvad: rasvad,
            valgud: valgud,
            süsivesikud: süsivesikud
        })
    }
    arvutaKomponendid(kokku) {
        let tulemused = []
        for(let i=0; i<this.komponendid.length; i++) {
            console.log(kokku, this.kogused[i], this.kogus)
            tulemused.push(`${this.komponendid[i].nimi}: ${(kokku*this.kogused[i]/this.kogus)}`)
        }
        return(tulemused)
    }
}
module.exports = { Toiduaine, Toidukomponent, Toit }


