/*
*==Arrays==
*Es una coleccion o agrupacion de elementos en una misma variable, cada uno de ellos ubicado por la posicion que ocupa el array.
*Los arrays se utilizan para almacenar y organizar datos de manera mas eficiente.
*/

//*Crear un Array
const numeros = [1, 2, 3, 4, 5,];
//Array de cadena de texto
const comida = ["tacos", "sopa", "pan", "jugo"];
console.log(comida);

//*Array mixto
const mixto = [ 
    "pluma",
    8,
    true,
    { nombre:"Mar"}
];
console.log(mixto);

//*Array vacio.
const lista = [ ];
console.log(lista)

//*Agregar elementos a mi array vacio
lista[0] = "Leche";
lista[1] = "pollo";
lista[2] = "espinaca";
lista[3] = "huevo";
console.log(lista);

//*Otra manera de crear arrives
const frutas = new Array("manzana","mandarina","peras","uvas");

//*Esta sintaxis se puede emplear en Arrays porque son Objects, es una manera de mandar a llamar un nuevo Objeto de tipo Array.

console.log(frutas);

//*Longitud de un array este dice cuantos elementos hay en futas
console.log(frutas.length);

//*Acceder a los elementos del array, acorde a su indice
console.log(frutas[3]);//*llamamos uvas de acuerdo a su posicion
console.log(frutas[4]);//*undefined ya que se cuenta de cero

//*Modificar un elemento del array por el indice
const cremeria = ["jamon","salchicha","Queso","yogurt","crema"];
console.log(cremeria);
cremeria[2] = "Quesillo";
console.log(cremeria);
cremeria[4] = "danonino";
console.log(cremeria);

//*Arreglo de arreglos, multidimensional
console.log("Arreglo de arreglos");

//* Estados : EDOMEX, GDL, YUCATAN, SONORA, OAXACA, CDMX

//*Platillos: Guajolocombo, Torta ahogada, Panuchos, Dogos, Tlayuda, tacos.


const estados = ["Estado de Mexico", "Jalisco", "Yucatan", "Sonora", "Oaxaca", "CDMX"];

const platillos = ["Guajolocombo", "Torta ahogada", "Panuchos", "Dogos", "Tlayuda", "Tacos"];

const menu = [estados, platillos];

console.log (menu[0][2]);

//*En el primer corchete se establece el índice del array y en el segundo corchete se establece el índice del elemento de dicho array.

console.log(`En ${menu[0][1]} se come ${menu[1][1]}`);

/*
*Metodos de Arrays
*Metodos de cola (queue). Los metodos de cola implica agregar elementos al final del Array y eliminar elementos al inicio del array, sigue el principio de FIPO (First-in-first-out) Lo que significa el primer elemento añadido es el primer elemento eliminado.
*push
*shift
*unshift

*Metodo de pila (stack). Implica agregar elementos al final del array y eliminar elementos del final del array, sigue el principio LIFO (Last -in-first-out) que significa el ultimo elemento añadido es el primero en ser eliminado.

*push
*pop 
[]
*/

console.log("Metodos de Arrays");

const CH35 = ["Dani","Fer","Maara","Gaby","Mar","Paola","Enrique"];
console.log(CH35);

//*pop() Eliminar el ultimo elemento del array
let popCH35 = CH35.pop();
console.log(popCH35); //*devuelve el dato eliminado
console.log(CH35); //*elimina el dato de la lista
//*Push () Agregar el final del Array
let pushCH35 = CH35.push("Mony");
console.log(CH35);

//*Shift() quitar primer elemnto del array
let shiftCH35 = CH35.shift();
console.log(CH35);

//*Unshift () agregar al principio de array
let unshiftCH35 = CH35.unshift("Dani");
console.log(CH35);

//*Reverse() cambia el sentido del ordenamiento del array
let reverseCH35 = CH35.reverse();
console.log(CH35);

/*
*Investigar: sort, forEach, slice, splice, 
 */
