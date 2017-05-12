function leia(kordaja, vabaliige) {
	this.x = 2;
	this.kordaja = kordaja
	this.vabaliige = vabaliige;
	this.massiiv = [1, 2, 3];
	this.yArvud = [];
	this.arvuta = function() {
		var vabaliigeNR = Number(vabaliige);
		var kordajaNR = Number(kordaja);
		var y = kordajaNR * this.x + vabaliigeNR;
		(document.getElementById("kontroll").value == y) ? console.log("X väärtusega "+ this.x +" on õige") : console.log("vale");
		for(var i = 0; i<this.massiiv.length; i++){
			
			//console.log("massiiv väärtus" + this.massiiv[i]);
			var y = kordajaNR * this.massiiv[i] + vabaliigeNR;
			this.yArvud.push(y);
			//console.log(y);		
		}
		console.log("Y Väärtused on: " + this.yArvud);
	}
	
};
document.getElementById("valem").innerHTML = " x = 2";

document.getElementById("submit").addEventListener("click", function(){
    var kordaja1 = document.getElementById("kordaja").textContent;
    var vabaliige1 = document.getElementById("vabaliige").value;
    var kontroll = document.getElementById("kontroll").innerHTML;
	var uus = new leia(kordaja1, vabaliige1);
	uus.arvuta();
});

