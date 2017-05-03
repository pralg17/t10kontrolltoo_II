function emptyFields(){
    document.getElementById("iooni-nimi").value = "";
    document.getElementById("iooni-laeng").value = "";
    document.getElementById("iooni-mass").value = "";
}

function sendData() {
    var name = document.getElementById("iooni-nimi").value;
    var charge = document.getElementById("iooni-laeng").value;
    var mass = document.getElementById("iooni-mass").value;

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("issuccess").innerHTML = "Ioon lisatud."
        }

    };
    xhttp.open("GET", "/sessionion/?name=" + name + "&charge=" + charge + "&atommass=" + mass, true);
    xhttp.send();
    emptyFields();
}



function makeSubstance(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("issuccess").innerHTML = this.responseText;
        }
    };

    xhttp.open("GET", "/createsubstance", true);
    xhttp.send();
}