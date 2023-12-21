const emailInput = document.getElementById("email");
const submitButton = document.getElementById("btn-submit");
//*Regex: exprexiones regulares. Determinan patrones que se deben cumplir.
const emailREGEX = /^[\w.+\-] + @gmail\.com$/;
//*Deshabilitar el boton para ver funcionalidad de REGEX
submitButton.disabled = true;

//* Evento pra input, el cual evaluara el patron de expresion regular y en caso de cumplir con el patron, habilitara el boton y podremos ser redirigidos a index.html
//*Se obtiene el valor actual del campo email (imput) usando e.target, value y se almacena en una variable (text)
//*Se evalua la REGEX

emailInput.addEventListener("input", (e) =>{
    const text = e.target.value;
    if(emailREGEX.test(text) === true) {
        submitButton.disabled = false;
    }
})

