var firstnameCheck = false;
var lastnameCheck = false;
var usernameCheck = false;
var emailCheck = false;
var phoneCheck = false;

var password = "1";
var confirmPassword = "2";

var passIn = document.getElementById("passIn");
var passInDiv = document.getElementById("passInDiv");

var confirmPassIn = document.getElementById("confirmPassIn");
var confirmPassInDiv = document.getElementById("confirmPassInDiv");

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

document.getElementById("lastNameIn").addEventListener("input", function() {
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
        var http = new XMLHttpRequest();
        var url = "CheckUsername";
        http.open("POST", url, true);

        http.setRequestHeader("Content-type", "application/json; charset=utf-8");
        http.setRequestHeader("username", username);

        http.onreadystatechange = function() {
            if (http.readyState == 4 && http.status == 200) {
                var result = http.responseText;
                if (result === "error") {
                    usernameInDiv.classList.remove("has-success");
                    usernameInDiv.classList.add("has-danger");
                    usernameIn.classList.remove("form-control-success");
                    usernameIn.classList.add("form-control-danger");
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

document.getElementById("emailIn").addEventListener("input", function() {
    var emailIn = document.getElementById("emailIn");
    var emailInDiv = document.getElementById("emailInDiv");
    var email = emailIn.value;

    if (email.length <= 2) {
        emailInDiv.classList.remove("has-success");
        emailInDiv.classList.remove("has-danger");
        emailIn.classList.remove("form-control-success");
        emailIn.classList.remove("form-control-danger");
        emailCheck = false;
        check();
    } else if (email.length >= 10) {
        emailInDiv.classList.add("has-success");
        emailInDiv.classList.remove("has-danger");
        emailIn.classList.add("form-control-success");
        emailIn.classList.remove("form-control-danger");
        emailCheck = true;
        check();
    } else {
        emailInDiv.classList.remove("has-success");
        emailInDiv.classList.add("has-danger");
        emailIn.classList.remove("form-control-success");
        emailIn.classList.add("form-control-danger");
        emailCheck = false;
        check();
    }
});

document.getElementById("phoneIn").addEventListener("input", function() {
    var phoneIn = document.getElementById("phoneIn");
    var phoneInDiv = document.getElementById("phoneInDiv");
    var phone = phoneIn.value;

    if (phone.length <= 2) {
        phoneInDiv.classList.remove("has-success");
        phoneInDiv.classList.remove("has-danger");
        phoneIn.classList.remove("form-control-success");
        phoneIn.classList.remove("form-control-danger");
        phoneCheck = false;
        check();
    } else if (phone.length == 10) {
        phoneInDiv.classList.add("has-success");
        phoneInDiv.classList.remove("has-danger");
        phoneIn.classList.add("form-control-success");
        phoneIn.classList.remove("form-control-danger");
        phoneCheck = true;
        check();
    } else {
        phoneInDiv.classList.remove("has-success");
        phoneInDiv.classList.add("has-danger");
        phoneIn.classList.remove("form-control-success");
        phoneIn.classList.add("form-control-danger");
        phoneCheck = false;
        check();
    }
});

document.getElementById("passIn").addEventListener("input", function() {
    var passIn = document.getElementById("passIn");
    var passInDiv = document.getElementById("passInDiv");
    password = passIn.value;
    confirmpassword = confirmPassIn.value;

    if (password.length >= 8) {
    	if (password === confirmpassword) {
    		passInDiv.classList.add("has-success");
        	passInDiv.classList.remove("has-danger");
        	passIn.classList.add("form-control-success");
        	passIn.classList.remove("form-control-danger");
        	confirmPassInDiv.classList.add("has-success");
        	confirmPassInDiv.classList.remove("has-danger");
        	confirmPassIn.classList.add("form-control-success");
        	confirmPassIn.classList.remove("form-control-danger");
    	} else {
    		passInDiv.classList.remove("has-success");
        	passInDiv.classList.add("has-danger");
        	passIn.classList.remove("form-control-success");
        	passIn.classList.add("form-control-danger");
        	confirmPassInDiv.classList.remove("has-success");
        	confirmPassInDiv.classList.add("has-danger");
        	confirmPassIn.classList.remove("form-control-success");
        	confirmPassIn.classList.add("form-control-danger");
    	}
    } else {
    		passInDiv.classList.remove("has-success");
        	passInDiv.classList.remove("has-danger");
        	passIn.classList.remove("form-control-success");
        	passIn.classList.remove("form-control-danger");
        	confirmPassInDiv.classList.remove("has-success");
        	confirmPassInDiv.classList.remove("has-danger");
        	confirmPassIn.classList.remove("form-control-success");
        	confirmPassIn.classList.remove("form-control-danger");
    	}
});

document.getElementById("confirmPassIn").addEventListener("input", function() {
    var confirmPassIn = document.getElementById("confirmPassIn");
    var confirmPassInDiv = document.getElementById("confirmPassInDiv");
    password = passIn.value;
    confirmpassword = confirmPassIn.value;

    if (confirmpassword.length >= 8) {
    	if (password === confirmpassword) {
    		passInDiv.classList.add("has-success");
        	passInDiv.classList.remove("has-danger");
        	passIn.classList.add("form-control-success");
        	passIn.classList.remove("form-control-danger");
        	confirmPassInDiv.classList.add("has-success");
        	confirmPassInDiv.classList.remove("has-danger");
        	confirmPassIn.classList.add("form-control-success");
        	confirmPassIn.classList.remove("form-control-danger");
    	} else {
    		passInDiv.classList.remove("has-success");
        	passInDiv.classList.add("has-danger");
        	passIn.classList.remove("form-control-success");
        	passIn.classList.add("form-control-danger");
        	confirmPassInDiv.classList.remove("has-success");
        	confirmPassInDiv.classList.add("has-danger");
        	confirmPassIn.classList.remove("form-control-success");
        	confirmPassIn.classList.add("form-control-danger");
    	}
    } else {
    		passInDiv.classList.remove("has-success");
        	passInDiv.classList.remove("has-danger");
        	passIn.classList.remove("form-control-success");
        	passIn.classList.remove("form-control-danger");
        	confirmPassInDiv.classList.remove("has-success");
        	confirmPassInDiv.classList.remove("has-danger");
        	confirmPassIn.classList.remove("form-control-success");
        	confirmPassIn.classList.remove("form-control-danger");
    }
    check();
});

function check() {
    if (firstnameCheck && lastnameCheck && usernameCheck && emailCheck && phoneCheck && password === confirmpassword) {
        signupButton.removeAttribute("disabled");
    } else {
        signupButton.setAttribute("disabled", "disabled")
    }
}