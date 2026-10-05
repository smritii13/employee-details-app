function submitUser() {

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    const user = {
        name: name,
        email: email
    };

    fetch("/api/users", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })

    .then(response => response.json())
    .then(data => {
        document.getElementById("result").innerHTML =
            "Name: " + data.name + "<br>" +
            "Email: " + data.email;
    });
}