// EJERCICIO UNO

// Programa para convertir minutos a segundos.

/*function convertidor(m){

    m = parseInt(prompt("ingrese los segundos"));

    let resultado = m * 60;
    
    return console.log("tus segundos en minutos son:" + resultado);

}

convertidor();*/
// EJERCICIO DOS

// Programa para incrementar un numero.
/*function incrementar (x){
    let resultado = x + 1;
    return resultado;
}
console.log(`Si le sumanmos uno esto nos da: ` + incrementar(7));*/
// EJERCICIO TRES

// Programa para sacar area de un triangulo
/*function area(base , altura){
    return (base*altura)/2;
}
console.log(area(5 , 6));*/
// EJERCICIO CUATRO

// Programa que te dice cuantos dias tiene los años que tienes

/*function calEdad(age) {
    return age * 365;
}
function calcAge(age) {
    return age * 365;
}
console.log(65);*/

// EJERCICIO QUINTO

// Programa que te dice cuantos voltaje tienes.

/*function circuitPower(power , current){
    return (power * current);
}
console.log(Power(5 , 6));*/

// EJERCICIO SEXTO

// Programa que te dice algo

const mensaje = function(a="algo"){
    return a;
}
console.log(a + `es mejor que nada`)

/*7. Sum of Polygon Angles.**

Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).*/

const sumAngulos = (n) => (n - 2) * 180;

console.log(sumAngulos(3)); 
console.log(sumAngulos(4)); 
console.log(sumAngulos(6)); 

/*8 */
const convertidor = (horas, minutos) => (horas * 3600) + (minutos * 60);

console.log(convertidor(1, 3));
console.log(convertidor(2, 0)); 
console.log(convertidor(0, 0)); 
