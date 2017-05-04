const mongoose = require("mongoose")

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
module.exports = { Toiduaine, Toidukomponent }