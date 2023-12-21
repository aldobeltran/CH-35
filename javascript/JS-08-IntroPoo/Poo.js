/*
*Paradigma de progrmacion:

*-  Programacion imperativa: Se basa en instrucciones detalladas ejecutando un flujo o una secuencia determinada.

*-  Programacion basada en eventos: Se basa en la gestion y respuesta de eventos.

*-  Programacion declarativa: Explicar lo que queremos obtener.

*-  Programacion orientada a objetos: Toma cierta informacion o estructura del mundo real (objetos) para poder explicar ciertas cosas, como sus caracteristicas (propiedades o atributos) y sus comportamientos o acciones (metodo)

*/

//*Clases; plantillas para crear objetos. Nos ayudan a definir un tipo de objeto y crear instancias(hacerlo presente) de este tipo de objeto.

class persona{

    nombre = "";
    apellido = "";
    edad = 0;
    email = "";
    telefono = "";

    //*Objetos:
    //*El constructor es una funcion especial, cuya finalidad es la de construir o instanciar objetos.
    //*Para inicializar un objeto es necesario definir un constructor que tomara los atributos.
    //*Clases= molde objeto = gomita constructor = chefisto atributos= ingredientes metodos=comportamientos
    //*Lo que vaya en el constructor tiene que tener el missmo orden que lo que declaremos abajo

    constructor (nombre, apellido, edad, email, telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    comer(){
        console.log("bon apetit");
    }//*metodo comer

    bailar (){
        console.log("Dale hasta el suelo");
    }//*Metodo bailar
    programar (){
        console.log("Orele programe");
    }
    chambear (){
        console.log("a chambear");
    }
    juega (){
        console.log("plei o nintendo");
    }

    mostrarInfo(){
        console.log("Nombre: ", this.nombre);
        console.log("Apellido: ",this.apellido);
        console.log("Edad: ", this.edad);
        console.log("Email: ",this.email);
        console.log("Telefono: ", this.telefono);
    }
}

let usuario1 = new persona ("Aldo","Beltran","24","aldo6a@hotmail.com","5559465134");
let usuario2 = new persona ("Fernanda","Martinez","25","fer.love@hotmail.com","5559465554");
let usuario3 = new persona ("Juan","Lopez","40","juanito@hotmail.com","55553465134");
let usuario4 = new persona ("Peter","Parker","26","spidy@hotmail.com","5999465134");
let usuario5 = new persona ("Link","Hyrule","17","zelda@hotmail.com","55590005134");

console.log(usuario1);//*Imprime objeto completo
console.log(usuario4.email);//*Imprime un atributo en especifico
console.log(usuario1.email,usuario2.email,usuario3.email,usuario4.email,usuario5.email);

usuario4.comer();//Invocar el metodo
usuario3.chambear();

usuario1.mostrarInfo();

console.log(usuario3.telefono, usuario5.apellido);

//*4 pilares de la programacion orientada a objetos

//*Herencia
//*Polimorfismo
//*Encapsulamiento
//*Abstraccion

//*=====Herencia nos permite heredar a clases inferiores para poder optimizar el programa, se declaran en orden de arriba a abajo, padre,hijo,etc
//*Con extends se dice de donde viene la herencia
class arrendador extends persona{ //*subclase
    capacidad = 0;
    costo = 0;
    nombreLugar="";

    constructor(nombre, apellido, edad, email, telefono, capacidad, costo, nombreLugar){
        super(nombre, apellido, edad, email, telefono);//*Con super pedimos atributos en especial de clases de arriba
        this.capacidad = capacidad;
        this.costo = costo;
        this.nombreLugar = nombreLugar;

    }
    
    mostrarInfo(){
        console.log("capacidad", this.capacidad);
        console.log("costo", this.costo);
        console.log("nombre del lugar", this.nombreLugar)
    }

}
//*Instanciar
let arrendador1 = new arrendador("Juan", "Lopez",29,"juanga@gmail.com", "5559485958", 100, 50000, "salon G");

console.log(arrendador1);
console.log(arrendador1.costo);
arrendador1.mostrarInfo();

//*=======Polimorfismo: Tener objetos de diferentes tipos que pueden ser manipulados en comun
//*La posibilidad de realizar cambios en distintos objetos que comparten atributos
class producto {
    marca = "";
    precio = 0;

    constructor(marca, precio){
    this.marca = marca;
    this.precio = precio; 
    };


    mostrarDescripcion(){
        console.log("Marca");
        console.log("precio");
    }
}
let producto1 = new producto("cerave", 85,);

//*==========Encapsulamiento: Ocultar la implementacion de un objeto y solo mostrar los datos necesarios

class usuario{
    #contraseña;

    constructor(userName, correo, contraseña){
    this.userName = userName
    this.correo = correo;
    this.contraseña = contraseña;
}

verificarContraseña(contraseña){
    return this.#contraseña === contraseña;
}
}


//*=======Abstraccion no es nada mas que traer objetos del mundo real y poder aplicarlos a la programacion mediante clases, metodos, constructores y objetos.
//*Los objetos de tipo Json es un formato de intercambio de datos ligero, accesible, estructurado, manipulable (DOM) y que nos brindan una mejor comunicacion entre el cliente y el servidor. Esto gracias a que son mas flexibles y generalmente se ejecutan con fetch

    let objetoJson ={
    "nombre":"juanin",
    "apellido":"juan Harry",
    "edad": 31,
}



//*Ejemplo con animales
class Animal {
    sonido() {
    console.log('Hace un sonido genérico');
    }
}

class Perro extends Animal {
    sonido() {
    console.log('Guau guau');
    }
}

class Gato extends Animal {
    sonido() {
    console.log('Miau');
    }
}

const perro = new Perro();
const gato = new Gato();

perro.sonido();  
gato.sonido();