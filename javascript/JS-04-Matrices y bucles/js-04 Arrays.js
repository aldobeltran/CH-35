/*
*==Arrays==
*Es una coleccion o agrupacion de elementos en una misma variable, cada uno de ellos ubicado por la posicion que ocupa el array.
*Los arrays se utilizan para almacenar y organizar datos de manera mas eficiente.
[]*/

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