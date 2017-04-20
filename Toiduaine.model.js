const mongoose = require("mongoose")
mongoose.Promise = global.Promise

const ToiduaineSchema = mongoose.Schema({
    nimi: String,
    valgud: Number,
    rasvad: Number,
    süsivesikud: Number
})
const ToiduaineModel = mongoose.model("Toiduaine", ToiduaineSchema)

const uus = (nimi,valgud,rasvad,süsivesikud) => {
    let T = new ToiduaineModel({
        nimi: nimi,
        valgud: valgud,
        rasvad: rasvad,
        süsivesikud: süsivesikud
    })
    return T.save()
}
const kõik = () => {
    return ToiduaineModel.find({})
}
const kustuta = nimi => {
    return ToiduaineModel.findOneAndDelete({nimi: nimi})
}

module.exports = {uus, kõik, kustuta}