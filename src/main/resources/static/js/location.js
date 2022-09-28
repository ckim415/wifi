var LAT = 0.0
var LNT = 0.0

function getLocation() {
    if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition);
    } else {
    document.getElementById("lat").innerHTML = LAT;
    document.getElementById("lnt").innerHTML = LNT;
    }
}

function showPosition(position) {
    LNT = position.coords.longitude;
    LAT = position.coords.latitude;

    document.getElementById("lat").value = LAT;
    document.getElementById("lnt").value = LNT;
    document.getElementById("try").value = position.coords.latitude;
}

