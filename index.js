const c = require("./classes")

const kartulid = new c.Toidukomponent("Kartul",5,10,85,100)
console.log(kartulid)
// Toidukomponent {
//   nimi: 'Kartul',
//   valgud: 5,
//   rasvad: 10,
//   'süsivesikud': 85,
//   kogus: 100,
//   rasvakogus: 10 }
const hapukoor = new c.Toidukomponent("Hapukoor",2,30,68,30)
console.log(hapukoor)
// Toidukomponent {
//   nimi: 'Hapukoor',
//   valgud: 2,
//   rasvad: 30,
//   'süsivesikud': 68,
//   kogus: 30,
//   rasvakogus: 9 }
const vorst = new c.Toidukomponent("Vorst",10.3,20.3,5.0,50)
console.log(vorst)
// Toidukomponent {
//   nimi: 'Vorst',
//   valgud: 10.3,
//   rasvad: 20.3,
//   'süsivesikud': 5,
//   kogus: 50,
//   rasvakogus: 10.15 }