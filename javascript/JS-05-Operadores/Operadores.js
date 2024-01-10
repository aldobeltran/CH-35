/*
*Operador
*Es un signo que especifica que debe efectuar una determinada operacion
*Operadores aritmeticos (+,-,*,/,%,++,--)

*Operadores de asignacion (=)

*Operadores logicos (&&,, !)
*Operadores de comparacion (==,===,<,>, <=,=> !=, !== )
*Operadores de cadena (toLowerCase, toUpperCase, trim, toString, concat, +)
*/
/*
*Operadores aritmeticos
*(+):suma, se utiliza para sumar dos numeros 
*(-):Resta, se utiliza para restar dos numeros
*(*):Multiplicar, se utiliza para multiplicar dos numeros.
*(/):Division, se utiliza para dividir dos numeros
*(%):Residuo, 10%3=1, se obtiene el resido de una division
*(++):Incremento, aumenta de uno en uno la cantidad o el numero
*(--):Decremento, disminuye de uno en uno la cantidad o el numero
*/
let numero1 = 10;
let numero2 = 8;

suma = numero1 + numero2;
resta = numero1 - numero2;
multiplicacion = numero1 * numero2;
division = numero1 / numero2;
residuo = numero1 % numero2;
incremento = numero1;
incremento ++;
decremento = numero2;
decremento --;

console.log(suma);
console.log(resta);
console.log(multiplicacion);
console.log(division);
console.log(residuo);
console.log(incremento);
console.log(decremento);

//*Ejemplo de descuento
let precioReal = 100;
let procentajeDescuento = 20;

let montoDelDescuento = (precioReal * procentajeDescuento)/100;
let preioConDescuento = precioReal - montoDelDescuento;

console.log("Precio Real:$" + precioReal);
console.log("procentajeDescuento:" + procentajeDescuento + "%");
console.log("Cantidad del descuento:$" + montoDelDescuento);
console.log("precio con descuento:$" + preioConDescuento);


/*
*Operadores de asignacion:
* Este operador no compara, lo que hace es asignar

let frutas = manzanas;
*/

/*
*Operador de comparacion:
*(==): Igualdad, compara si nuestros valores son iguales
*/
let numero3 = 10;
let texto = "10";

console.log(numero3 == texto);

//* === igualdad estricta este da false por que los elementos son de igual valor pero de diferente tipo de dato.

let numero4 = 10;
let texto1= "10";

console.log(numero4 === texto1);

/*
*(!=): Desigualdad o distinto este operador verifica si dos valores no son iguales y de ser necesario realizar la conversion.
*/

let precioCaja = 1499;
let precioMaximo = 1500;

if (precioCaja != precioMaximo){
    console.log("El precio del producto no es igual al precio maximo" );
}else{
    console.log("El precio del producto es igual al precio maximo permitido")
}


let numero5 = 10;
let numero6 = "10";

if (numero5 !== Number(numero6)){
    console.log("son diferentes");
} else{
    console.log("Los valores son iguales");
}

/*
* (!==)Desigualda estricta este operador verifica si dos valores no son iguales, pero a diferencia de (!=) en este caso ambos valores deben tener el mismo ttipo y valor
*/

let numero7 = 10;
let numero8 = "10";

if (numero7 !== numero8){
    console.log("los valores son diferentes");
}else{
    console.log("los valores son iguales");
}

/*
*En igualdad: ==, y desigualdad: !=
*En igualdad estricta: ===, y desigualdad estricta: !==
*(Es como sustituir el primer "=" por un "!")
*/


/*
*(>): Mayor que nos indica si un valor es mayor que otro, con true o false │
*/

let puntuacionFinal = 85;
let puntuacionRequerida =102;
console.log(puntuacionFinal > puntuacionRequerida);

/*
*(<): Menor que nos indica si un valor es menor que otro, con true o false │
*/
let años = 20;
let edadLimite = 30;

console.log(años < edadLimite);

/*
*(<=): Mayor o igual que nos indica si un valor es mayor o igual que otro, con true o false │
*/

let edad = 40;
let edadNecesaria = 18; 
console.log(edad >= edadNecesaria);

/*
*(>=): Menor o igual que nos indica si un valor es menor o igual que otro, con true o false │
*/

let temperatura = 14;
let temperaturaMaxima = 21;

console.log(temperatura <= temperaturaMaxima);

/*
*Ejercicio 1 un programas que solicite al usuario dos números y en consola nos va a decir si esos números son iguales o ay alguno que sea mayor que otro
*/
let numero9 = 40;
let numero10 = 18; 
console.log(numero9 >= numero10);
/*
*Ejercicio 2 un programa que pida al usuarios dos palabras y determine si son iguales o no
*/
let Palabra1 = "Mismo";
let Palabra2 = "Mesmo";

console.log(Palabra1 == Palabra2);

/*
*Operadores logicos

*(&&) And, este operador une dos condicones para dos condicones se cumplan simultaneamente (Se pueden comparar mas e incluso comparar comparaciones ).
 */
let mayoriaEdad = 17;
let tieneId = true;

if (mayoriaEdad >= 18 && tieneId) {
    console.log("Puedes rentar el salon");
} else {
    console.log("No puedes rentar el salon");
}
/*
*(||) Or, se utiliza cuando se ddbe cumplir una condicion u otra.
 */
let esUsuarioPrime = false;
let descuento1 = true;

if (esUsuarioPrime || descuento1 ){
    console.log("Califica para descuento");
} else {
    console.log("No califica");
}

/*
*(!) Not, se utiliza el valor de una condicion.
 */

let esDialibre = false;
if (!esDialibre){
    console.log("se trabaja");
} else {
    console.log("Descanso");
}

/*
*Operadores de cadena

*(toLowerCase) se utiliza para cambiar nuestro string a minusculas
 */

let mensajeUsuario = "BIENVENIDOS";
let cambioMinusculas = mensajeUsuario.toLowerCase();

console.log(cambioMinusculas);

/*
*(toUpperCase) se utiliza para cambiar nuestro string a mayusculas
 */

let mensajeUsuario1 = "bienvenidos";
let cambioMayusculas = mensajeUsuario1.toUpperCase();

console.log(cambioMayusculas);

/*
*(trim) quita los espacios al principio y final.
 */

let aviso = "   CH35   "
let sinEspacios = aviso.trim();
console.log(sinEspacios);

/*
*(toString) Convierte un tipo de dato number a string.
 */

let numero11 = 31;
let cadenas = numero11.toString();
console.log(cadenas);

/*
*(concat) Concatena (junta) los datos.
 */

let nombre = "Fer";
let apellido = "Martinez";
let nombreCompleto = nombre.concat ("",apellido)
console.log(nombreCompleto);

/*
*Expresiones

*Expresion aritmetica
*let operacion = 14 + 25 + 12; Combina la suma con la multiplicacion

*Expresion de cadena
*let notificacion = "casi," + "Año nuevo"; expresion concatenando expresion logica

*let esMayorDeEdad = (23 > 18) && (23 < 65); tiene operadores logicos y de comparacion

*expresion de asignacion

*let frasco = chocolates; asigna valor a las variables
 */

/*
*funcion para hacer hotcakes operadore logicos ingredientes y comprobar si tenemos la cantidad necesaria operados logicos, de comparacion que de true if else 
*/

let tieneHarina = true;
let tieneHuevos = true;
let tieneMantequilla = true;
let tieneNutella = true;
let tieneLeche = true;

if (tieneHarina && tieneHuevos && tieneMantequilla && tieneNutella && tieneLeche) {
    console.log("¡Puedes hacer Hotcakes!");
} else {
    alert("No puedes hacer Hotcakes. Necesitas todos los ingredientes.");
}
let siHay = true;

if (siHay == true) {
    alert("¡Genial! Tienes todos los ingredientes para hacer hotcakes.");
    alert("Comienza mezclando la harina, los huevos y la leche, luego añade la mantequilla derretida.");
    alert("Calienta un sartén y vierte un poco de la mezcla para hacer los hotcakes.");
    alert("Hotcakes listos, ¡a disfrutar!");
    } else {
        alert("Tssss, te faltan ingredientes para hacer hotcakes.");
        alert("No es posible hacer hotcakes sin todos los ingredientes.");
        alert("Ve a conseguirlos, CORREEEE");
    }

    let x = 6 + 3 + "3";
    console.log(x);