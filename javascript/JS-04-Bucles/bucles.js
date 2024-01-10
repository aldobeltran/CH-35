 console.log("Ahora hablamos de bucles");
/* 
*===== BUCLES =====
* Iteración. Proceso de repetir una secuencia de instrucciones o acciones en un programa. Es decir, ejecutar un bloque de código muchas veces, basado en una condición o una colección de elementos.

* -- Operadores de incremento (++) y operadores de decremento (--)
*${} se utiliza en el contexto de plantillas de cadena (template literals). Las plantillas de cadena son una forma más conveniente y legible de concatenar cadenas y expresiones en comparación con las cadenas tradicionales con el operador +.
* Los operadores ++ y -- son conocidos como operadores de incremento y decremento respectivamente. 
*- El operador ++ se utiliza para aumentar el valor de una variable en uno.
*- El operador -- se utiliza para disminuir el valor de una variable en uno.
* (i)  : comúnmente utilizada como variable en bucles, es simplemente una convención de nomenclatura y puede ser cualquier nombre válido de variable que elijas. La "i" a menudo se utiliza como abreviatura de "índice" en el contexto de bucles, especialmente en situaciones donde se está iterando sobre índices de arrays o en situaciones similares.
*/

//*Ciclo for

/*
*Un ciclo for se repite hasta que la condicion se evalue como false. Crea 3 expresionales opcionales
*Sintaxis
    *   for(expresioninicial; expresioncondicional;
    * expresionactualizacion){
    *   codigo a ejecutar en cada iteracion del bucle
    * }
    * 1 Inicializacion: Se debe inicializar con una variable que sera evaluada en la expresion a comparar.
    * 2 Condicion: Es una expresion que debe cumplir la variable inicial (true), si no se cumple (false) el bucle termina.
    * 3 pasos a realizar; Son los intervalos que cambiaran 
    * La variable inicial mientras sea true
 */

//*Crear un programa para saber cuantos boletos vendemos para una rifa
for (let boleto = 1; boleto <= 25; boleto++ ){
    console.log(`Boleto # ${boleto}`);
}
//*Programas para vender bolos con variable global
let bolos = 1;

for(bolos; bolos <=20; bolos++){
    console.log(`vendi ${bolos}`);
}

//*Cuenta regresiva
let cuentaRegresiva = 15;
for (cuentaRegresiva; cuentaRegresiva >=0; cuentaRegresiva--){
    console.log(cuentaRegresiva);
console.log(`Quedan ${cuentaRegresiva} paletas`);
}

/*
*Recorrer arrays con el ciclo for
*Debemos usar indices del arreglo para poder usar el bucle, en indices desde 0 hasta n y usaremos la propiedad lenght
*/

const CH35 = ["Rodrigo","Diego","Ania","Rey","Arturo","Eunice"];

for(let i = 0; i < CH35.length; i++){
    console.log(CH35[i]);
}
/**** Variaciones del ciclo for
-- for...of nos permite recorrer el objeto (array) y devuelve el valor
-- for...in nos permite recorrer el objeto (array) y devuelve su posición (indices)
*/
const frutas =  ["manzana","mandarina","peras","uvas"];

for(let fruta of frutas){
    console.log(frutas + "grupo frutas");
}


//*sumar numeros del 1 al 20
let suma = 0;
for (let i = 1; i <=20; i++){
    suma += i;
}
console.log(suma);

//*Tabla del 5
const tabla = 5;
for (let i = 1; i<= 10; i++){
    let resultado = tabla *i;

    console.log (`${tabla} x ${i} =${resultado}`)
}


 //* Ciclo While
 //*Recorrer un bloque de codigo siempre que una condicional especifica sea verdader.
 //* Sirve para realizar una tarea repetitiva mientras una condicion 

let productos = 5;
while (productos > 0){
    console.log(productos + "productos vendidos");
    productos--;
}

//*Imprimir numeros
let num1 = 0;
while(num1 < 10) {
    num1 ++
    console.log("El numero es " + num1);
}

/*
*Links de la sesion:
https://dcodingames.com/el-ciclo-while/
*/