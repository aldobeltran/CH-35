/*
La funciones son bloques de codigo que se pueden reutilizar las veces que 
seaun necesarias.
Algunas funciones reciben parametros y otras no reciben parametros Nota :las funciones normales se le llaman tambien funcion por declaracion

*/

//funcion que saluda
function saludar(){
    console.log("hola desde una funcion");
}
//Ejecutar la funcion con el nombre de la funcion y los parametros
saludar();

//Hoisting. caracteristica de una funcion que nos permite invocarla desde antes de su icializacion, es decir, se puede invocar antes del bloque de codigo o despue.
//se invoca en la linea 13 y 20
function saludar(){
    console.log("hola invocando la funcion con hosting")
}
saludar();

//funciones que retornan algo. Para que una funcion retorne algo (un string, una operacion, una variable,etc) necesitamos indicarle al codigo de la funcion que vamos a retornar mediante la funcion return.
function greeting (){
    return "hola desde una funcion que retorna";
}
console.log(greeting());

//funcion que retorna y reciba parametros
function sumar(x, y){
    return x + y
}
let resultado = sumar(255, 245);
console.log(`El resultado de sumar x+ y es ${resultado}`);

//calcular el cuadrado de un numero
function calcCuadrado (numero){
    return numero * numero;
}
let resultCuadrado = calcCuadrado(5);
console.log(resultCuadrado);

//funciones flecha(arrow function). Es una manera de declarar una funcion por declaracion, sintetizando codigo y haciendolo mas legible.
//Funcion flecha para calcular el cubo de un numero
const calcCubo = (number) => {
    return number * number * number;
}
let resultCubo = calcCubo(3);
console.log(resultCubo);

// funciones anonimas, son un tipo de funciones que se declaran sin nombre de funcion y se alojan en el interior de una variable. Se hace referencia a ellas cada vez que la utilicemos.
//Las funciones anonimas no permiten el hoisting(no se puede invocar antes de la inicializacion)
const mensaje = function (){
    return "Este es un mensaje desde una funcion anonima";
}
console.log(mensaje());
//callbacks. Es pasar una funcion B por parametro a una funcion A, de modo que la funcion A pueda ejecutar esa funcion de forma generica desde su codigo.
//FuncionB
const functionB = function (){
    console.log("Ejecutando funcion B")
}
//Funcion A que mandara a llamar a la funcion B
const functionA = function (callback){
    callback();
}
functionA(functionB);

