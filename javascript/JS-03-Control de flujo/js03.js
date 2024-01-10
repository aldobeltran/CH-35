console.log("Hola CH35");
/*
control de flujo y estruccturas de control

Las estructuras de control son un componente fundamental dentro de la programacion, entre algunas de las facilidades y ventajas que nos proporcionan para escribir y depurar codigo, podemos mencionar lo siguiente

- Tomar decisiones basadas en condiciones especificas, esto produce un codigo
 * tanto dinamico como adaptable
 * 
 * - Repetir acciones (estructuras de bucle) para iterar operaciones o procesar datos
 * de una forma eficiente sin caer en la redaccion de codigo innecesario y repetitivo
 * 
 * - Facilitar el control de flujo de una operacion, brindandonos la oportunidad de ser
 * especificos en indicar qe instrucciones ejecutar y en que orden
 * 
 * - Optimizan el rendimiento de nuestro codigo, ya que evita oportunamente ejecutar instrucciones
 * en caso de que no se necesite
 * 
 * - Facilitar tanto la escritura de codigo como la claridad de este
 * 
 * Las estructuras de control que vamos a ver durante las sesiones de JS son las siguientes
 * 
 *      - Estructura if-else
 *      - Estructura switch
 *      - Estructuras de bucles (for, do, do while)
 * 
 * Para esta sesion, nos centraremos solo en las primeras 2 señaladas en la lista
*/
/*
Declaracion de sentencia if-else
* Palabra reservada if para comenzar la declaracion, se coloca un parentesis () donde se debe colocar una expresion logica
(true false), se abre y cierran llaves {} para indicar que sentencia va a ejecutar si la condicion se cumple (true), 
*despues de la llave {} declarada para el bloque  de ejecucion if, colocamos la palabra reservada else, para este ejemplo no es necesario colocar mas expresiones de un () 
*simplemente colocamos otras llaves {} para indicar el bloque de codigo que tiene que ser ejecutado en caso de que la condicion no se cumpla (false)
*/

let n = 15;
if (n > 10) {
    console.log(true);
} else {
    console.log(false);
}

/*
if-else-if
 * 
 * Se trata de la misma sentencia if-else declarada anteriormente
 * Lo que vamos a hacer diferente es, en este caso, anidar varias veces
 * esta misma sentencia, lo que nos permitira tomar decisiones
 * mas complejas
 * 
 * Usaremos la concatenación.
 * Concatenar es una elegante palabra de la programación que significa: "unir". Para unir cadenas en JavaScript el símbolo de más (+), el mismo operador que usamos para sumar números, pero en este contexto hace algo diferente.
 * 
 * Hay que tener cuidado y no realizar demasiadas anidaciones, ya que va a resultar
 * en codigo poco legible y confuso
 *  */

//If anidados
let edad = 14;
if (edad < 18) {
    console.log("choza de los pequeñines");
} else if (edad >= 18n && edad < 65 ){
    console.log("La escupidera de Salty");
} else {
    console.log("El futuro es hoy oiste viejo")
}


/*
*Sentencia switch:
La sentencia switch es otro tipo de estructura de control de flujo, que nuevamente se encuentra en diversos lenguahes de programacion
*Es bastante parecida al a la sw sentencia if-else, pero diferente en cuanto comportamiento, ya que no se basa en una bifurcacion (partiendi de caminos), si no que se secciona en multiples casos (case) que,  dependiendo de la expresion que cumpla con un caso especifico, sera la secuencia que se va a ejecutar, dentro de la declaracion. 
* Declaracion: 
* Se empieza a colocar la palabra reservada switch, seguido de esto, colocamos parantesis () donde se debe colocar el valor que va a indicar mi sentencia/caso a ejecutar.
*falta indicar el bloque de codigo que se limita a esta sentencia, como lo haciamos en la sentencia if o con las funciones.
Dentro de este bloque de codigo, falta colocar los casos valor que se desee, establecer segun sea el valor indicado dentro del parentesis().
*Cada uno de estos casos se separa de la siguiente manera: 
*cada valor: instruccion a ejecutar si el valor empata en este caso.
*Despues para indicar que la ejecucion de la sentencias deba cortarse cuando se cumpla, se coloca la instruccion
*break. 
*Cuando terminemos de establecer los casos que necesitemos declarada, dentro de nuestra sentencia, debemos colocar un valor por defecto, default.
*Esta ultima sentencia nos permite establecer un valor colocado no empata con ningun otro dentro de la sentencia o en ningun de los casos.
*default: mensaje no disponible
*/

let dia ="martes";
switch(dia) {
    case "lunes":
        console.log("odio los lunes att: Garfield");
        break;
    case "martes":
        console.log ("Ni te cases ni te embarques");
        break;
    case "miercoles":
        console.log ("Ombligito de la semana");
        break;
    case "jueves":
        console.log ("Juevebes casi viernes");
        break;
    case "viernes":
        console.log("viernes de disfraces");
        break;
    case "sabado":
        console.log("saabadrink");
        break;
    case "domingo":
        console.log ("Domingo de misa a las seis am");
        break;
        default :
    console.log("Dia desconocido");
    break;

}
/*
*Operador ternario
*Expresion condicional if-else mas simple y legible 
*Principalmente se usa para simplificar condiciones de una sola expresion.
*Tambien puede anidar sentencias if- else-if  sin embargo, no es recomendable porque el codigo se puede volver confuso y poco legible
*Su declaracion es la siguiente:
*Palabra reservada var, let o const:
Se le asigna un nombre como si se tratara de una variable, operador de asignacion "=" seguido de este operador hay que colocar una expresion logica, esta va dentro de un parentesis() despues hay que colocar un caracter ? que indica el camino a seguir, dependiendo de si, se cumple (o no) la expresion.
*Para separar el resultado true o false debemos agregar un caracter de : del lado izquierdo se coloca la sentencia a ejecutar.
*Si se cumple la condicion, del lado derecho se coloca la sentencia a ejecutar.  */

//Ejemplo de operador ternario

let verificacion = n > 10 ? "si es mayor" : "no es mayor"
console.log(verificacion);
/*
* Cuando usar if else y cuando usar switch:
*if else- cuando necesitemos tomar decisiones bajo condiciones mas flexibles.
*Switch: cuando tengamos un conjunto fijo de valores para comparar una expresion.
*/
