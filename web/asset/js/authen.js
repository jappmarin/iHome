var firstnameCheck = false;
var lastnameCheck = false;
var usernameCheck = false;

var signupButton = document.getElementById("signUpButton");

document.getElementById("firstNameIn").addEventListener("input", function() {
    var firstNameIn = document.getElementById("firstNameIn");
    var firstNameInDiv = document.getElementById("firstNameInDiv");
    var firstname = firstNameIn.value;

    if (firstname.length <= 2) {
        firstNameInDiv.classList.remove("has-success");
        firstNameInDiv.classList.remove("has-danger");
        firstNameIn.classList.remove("form-control-success");
        firstNameIn.classList.remove("form-control-danger");
        firstnameCheck = false;
        check();
    } else if (firstname.length >= 3 && firstname.length <= 20) {
        firstNameInDiv.classList.add("has-success");
        firstNameInDiv.classList.remove("has-danger");
        firstNameIn.classList.add("form-control-success");
        firstNameIn.classList.remove("form-control-danger");
        firstnameCheck = true;
        check();
    } else {
        firstNameInDiv.classList.remove("has-success");
        firstNameInDiv.classList.add("has-danger");
        firstNameIn.classList.remove("form-control-success");
        firstNameIn.classList.add("form-control-danger");
        firstnameCheck = false;
        check();
    }
});

document.getElementById("lastNameIn").addEventListener("input", function () {
    var lastNameIn = document.getElementById("lastNameIn");
    var lastNameInDiv = document.getElementById("lastNameInDiv");
    var lastname = lastNameIn.value;

    if (lastname.length <= 2) {
        lastNameInDiv.classList.remove("has-success");
        lastNameInDiv.classList.remove("has-danger");
        lastNameIn.classList.remove("form-control-success");
        lastNameIn.classList.remove("form-control-danger");
        lastnameCheck = false;
        check();
    } else if (lastname.length >= 3 && lastname.length <= 20) {
        lastNameInDiv.classList.add("has-success");
        lastNameInDiv.classList.remove("has-danger");
        lastNameIn.classList.add("form-control-success");
        lastNameIn.classList.remove("form-control-danger");
        lastnameCheck = true;
        check();
    } else {
        lastNameInDiv.classList.remove("has-success");
        lastNameInDiv.classList.add("has-danger");
        lastNameIn.classList.remove("form-control-success");
        lastNameIn.classList.add("form-control-danger");
        lastnameCheck = false;
        check();
    }
});

document.getElementById("usernameIn").addEventListener("input", function() {
    var usernameIn = document.getElementById("usernameIn");
    var usernameInDiv = document.getElementById("usernameInDiv");
    var username = usernameIn.value;

    if (username.length >= 5) {
        var htpp = new XMLHttpRequest();
        var url = "CheckUsername";
        http.open("POST", url, true);

        http.setRequestHeader("Content-type", "application/json; charset=utf-8");
        htpp.setRequestHeader("username", username);

        http.onreadystatechange = function() {
            if (http.readyState == 4 && http.status == 200) {
                var result = http.responseText;
                if (result == "error") {
                    usernameInDiv.classList.remove("has-success");
                    usernameInDiv.classL    ist.remove("has-danger");
                    usernameIn.classList.remove("form-control-success");
                    usernameIn.classList.remove("form-control-danger");
                    usernameCheck = false;
                    check();
                } else {
                    usernameInDiv.classList.add("has-success");
                    usernameInDiv.classList.remove("has-danger");
                    usernameIn.classList.add("form-control-success");
                    usernameIn.classList.remove("form-control-danger");
                    usernameCheck = true;
                    check();
                }
            }
        }
        http.send(null);
    } else {
        usernameInDiv.classList.remove("has-success");
        usernameInDiv.classList.remove("has-danger");
        usernameIn.classList.remove("form-control-success");
        usernameIn.classList.remove("form-control-danger");
        usernameCheck = false;
        check();
    }
});

function check() {
    if (firstnameCheck && lastnameCheck && usernameCheck) {
        signupButton.removeAttribute("disabled");
    } else {
        signupButton.setAttribute("disabled", "disabled")
    }
}