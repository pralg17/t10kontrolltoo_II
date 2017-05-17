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
    return ToiduaineModel.findOneAndRemove({nimi: nimi})
}
const otsivahemik = (min, max) => {
    return ToiduaineModel.find({rasvad:{ $gte: min, $lte: max }})
}
const üks = (id) => {
    return ToiduaineModel.findOne({_id: id})
}

module.exports = {uus, kõik, kustuta, otsivahemik, üks}