document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");
    const username = form.querySelector("input[type='text']");
    const password = form.querySelector("input[type='password']");

    form.addEventListener("submit", function (e) {
        e.preventDefault(); // este metodo evita que se envíe el formulario

        const user = username.value.trim();
        const pass = password.value.trim();

        if (user === "" || pass === "") {
            alert("Por favor, complete ambos campos.");
            return;
        }

        alert(`¡Bienvenido, ${user}!`);
    });
});
