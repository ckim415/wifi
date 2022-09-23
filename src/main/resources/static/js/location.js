
function getLocation() {
    if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition);

    } else {
    document.getElementById("lat").value = 0.0;
    document.getElementById("lnt").value = 0.0;
    }
}

function showPosition(position) {
    document.getElementById("lat").value = position.coords.latitude;
    document.getElementById("lnt").value = position.coords.longitude;
}

