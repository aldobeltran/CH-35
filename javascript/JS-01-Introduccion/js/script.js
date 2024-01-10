// comentarios en una sola linea

/*comentario 
multilinea*/

/*alert("Hola mundoo");*/

//console.log("Este es un mensaje")


/*var nombre = prompt("ingresa tu nombre");
alert("Hola" + nombre + "Bienvenido a la ch35");*/

/*var numero1 = parseInt (prompt("Ingresa el primer numero:"));
var numero2 = parseInt (prompt("Ingresa el segundo nuero:"));
*/
/*
console.log("suma:" + (numero1 + numero2));
console.log("resta:" + (numero1 - numero2));
console.log("multiplicacion:" + (numero1 * numero2));
console.log("division:" + (numero1 / numero2));
*/
/*
var nombre = prompt("Ingresa tu nombre");

var edad = parseInt(prompt("Ingresa tu edad"));

if ( edad < 17 ){

    alert(nombre + ". Tas chavo, chavo");
}
else{
    alert(nombre + ". Ya te sabes la de chambear");
}
*/
/*
Scope: es el alcance de nuestras variables
Var, let, const la diferencia es el alcance
var tiene un alcance global
let tiene un alcance local
const se muestra sin cambios

String: Cadena de texto ("lleva comillas")
number: numero
booleano: true/false
null: nulo
undefinied: no esta asignado o definido
*/

/*Todas nuestras variables deben ser declaradas con nombres especificos y claros, sin espacios y no deben iniciar con numeros

let nombre = "Dani";
let invitadosExtra = 2;
let esMayorEdad = true;
let edad = 24;
let invitadoEspecial = null;
let horaDeSalida = undefined;*/

/*console.log(nombre);consola*/

//document.write(nombre);/*visible

/*Encasillamiento o typado: se separa por secciones
Nos es util para el mantenimiento del codigo ya que lo hace mas legible y facil de entender, prevencion de errores para reducir la probabilidad de los mismos

let numero = 15;
let texto = "hola";

//con enasillamiento

let numeroEncasillado= Number = 15;
let textoEncasillado= String = "hola";*

//typeof palabra reservada para saber que tipo de dato tenemos 

console.log(typeof(nombre))

Conversion de string a number

let funcionNumber = console.log(typeof Number(nombre));

meotodoParseInt = console.log (typeof(nombre));

metodoParseFloat = console.log(typeof parseFloat(nombre));

/*parseInt y parseFloat son funciones que se utilizan para convertir cadenas de texto en numeros, ambas nos ayudan en esta cambio 


var numero1 = "4";
var numero2 = "5";

console.log("Tipo de variable numero1: "+typeof(numero1));
/*
typeof solo devuelve el tipo de variable que estas utilizando
*/
//console.log("Tipo de variable luego de aplicar un Number: "+typeof(Number(numero1)));
//console.log("Tipo de variable luego de aplicar un parseInt: "+typeof(parseInt(numero1)))
/*
Number: tranforma tu variable a una variable numerica
parseInt: tranforma tu variable a un tipo de variable entera
en el ejmplo lo utilizamod para sumas dos variables tipo string

console.log(numero1+numero2);
console.log(parseInt(numero1)+parseInt(numero2));
console.log(Number(numero1)+Number(numero2));
*/
//conversion de number a string

/*console.log(typeof String(edad));
console.log(typeof edad.toString());

Conversion de boolean a string

let numero = Number (esMayorEdad);

console.log(typeof(numero));

let texto = String(esMayorEdad);

console.log(typeof(texto));
console.log(typeof esMayorEdad.toString())

let negacion = !esMayorEdad;

console.log (negacion);

//concatenar
//Concatenar es unir strings

let saludo = "Hola humano";
let frase = "el futuro es hoy"
texto= saludo + frase;

document.log(texto);*/


/*Tipos de datos en js
String (cadenas de texto)
Number (numericos)
Booleans (booleanos true or false)
Null (nulos)
Undefined (indefinidos)
Objets (objetos)
Object (Arrays)
 */

/*
->console.log():
No es necesario que se imprima en consola para que se vea, tampoco es el unica forma de enlazar con consola.
Nos permite visualizar en consola del navegador el codigo de js.
->console.warn():
Muestra un mensaje de advertencia
->console.error():
Muestra un mensaje de error.
->console.table():
 */

let firstName;
firstName = "Daniel";
let lastName = "Maldonado";

console.log(firstName + "" + lastName);
//pueden vivir variables y strings y primer forma de concatenar

console.log("Mi nombre es " + firstName + "y mi apellido es " + lastName);
//Segunda forma de concatenar

let age = 37
console.log(`Mi nombre es ${firstName} mi apellido es ${lastName} y tengo ${age} años`);

/*ECMAScript 6 (ES6)
Interpolacion de cadenas (tercera forma)
Backticks
Para variables ${}
Texto string
 */

console.warn(`Precaucion, no es buena practica dejar sin punto y coma.`);
//console.warn(); cuarta forma
console.error(`Status 404: Failed`);
//console error(); quinta forma

/* Array. Se traduce como matriz o arreglo. Es un tipo de dato que pertenece a JS, en el cual se almacena una colección de elementos de manera ordenada.
Los arrays se pueden manipular mediante métodos específicos.
Los elementos de una array se contabilizan como índices empezando por índice 0, por lo cual, el primer elemento del array posee el índice 0.
Un array posee n cantidad de elementos.
Se declaran como variables, seguidos del signo igual y corchetes, dentro de cada corchete vive un elemento con un tipo de dato.
*/
let arreglo1 = [ ]; //Array vacio
console.log(arreglo1);
//los elementos de un array se separan con comas
let cars = [ "Voskwagen", "BMW", "MAZDA", "KIA",]; //Array de string
console.log(cars)
//longitud e indice son difentes.la longitud (length) es el numero de elementos y el indice correspondiente a cada elemento a partir del 0

console.log(typeof(cars))

let salariesMx = [ 15000, 12000, 18000, 28000, 10000, 18500, 10200, 20500, 13500, 17500, 17200];
console.log(salariesMx, length); //output: 12
console.log(salariesMx);
//Array de numbers

/*
Objetos:  Son tipos de datos de JS con una estructura definida que nos permite almacenar informacion mediante llaves (claves) y valores.
Su sintaxis es la siguiente:
const object ={
    clave1: valor1 (dato1),
    clave2: valor2 (dato2)
    }
Los objetos pueden almacenar diferentes tipos de valores.
Trata de no interactuar tanto con ellos ya que son Apis
*/
const employee = {
    firstName: "Rey David",
    lastName: "Martinez",
    age:29,
    country: "Mexico",
}

console.log(employee);

console.table(cars);
//mostrando mi array como table
console.table(employee);
//mostrando mi objeto como table
