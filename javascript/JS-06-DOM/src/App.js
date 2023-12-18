const botonRandom = document.getElementById("btn");
const botonReset = document.getElementById("reset");
const colorFondo = document.body.style.backgroundColor;

//*Vamos a declarar una funcion que genere un numero random tomando un parametro number.
const random = (number) => {
    return Math.floor(Math.random() * (number + 1));

}

//*Crear evento de click para que cuando presione un boton pase algo

//*--Boton de random
botonRandom.addEventListener("click", () => {
    const randomColor = `rgb(${random(255)}, ${random(255)}, ${random(255)})`;
    document.body.style.backgroundColor = randomColor;
});
//*--Boton de reset
botonReset.addEventListener("click", () => {
    document.body.style.backgroundColor = colorFondo;
});
