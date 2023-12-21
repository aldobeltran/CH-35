//*Programacion sincronica
function two () {
    console.log("dos");
}
function one () {
    console.log("uno");
    two();
    console.log("tres");
}

one();
console.log("**********************");

//*Programacion asincrona
//*setTimeout que recibe una funcion anonima y establece un tiempo de ejecucion (en milisegundos 1000ms es 1 sec) para cumplir con la condicion de asincronismo

//*Primera forma de estructurar con setTimeout
const twoAsync = () => {
    setTimeout(() => {
        console.log("dos Async"); 
    }, 5000);
}
//*Segunda forma de estructurar con setTimeout
const oneAsync = () => {
    setTimeout(function(){
        console.log("uno Async")
    }, 2000);
    twoAsync();
    console.log("tres Async")
}
oneAsync();

/*
  *Trabajando con promesas mediante Fetch API
    *GET
 */
//*dos formas de referenciar apis
const url = "https://jsonplaceholder.typicode.com/users";

fetch(url)
//*Si se cumple la promesa, vamos a traer los datos de la API y se convertiran en tipo JSON para poder mostrarlos en consola
    .then(data => data.json())
    .then(data =>{
        console.log(data);//*Mostrando 
        console.log(data[0].name);
    })
    .catch(error => console.error ("Ups, algo salio mal", error));
//*Mensajee de error personalizado

//* >-Usando fetch para mostrar en navegador
const botonInfo = document.querySelector("#btn-mensaje");
const info = document.querySelector("#mensaje");
//*Variable para guardar la informacion que se va a traer desde la API: debe ser de tipo null
let post = null;

//*Consumiendo API con fetch (promnesas)
botonInfo.addEventListener("click" , () => {
    fetch ("https://jsonplaceholder.typicode.com/users/6")
        .then(response => response.json())
        .then(response =>{
            post = response; //*Guardo los datos de reposnes en la variable de tipo null, para que modificar el dato
            //*Mandamos a llamar la variable desde la funcion (esto se hace despues de la funcion)
            mostrarDatos(post);
        })
        .catch(error => console.error("problemazzz" , error))
});
//*Funcion que me permita manipular la variable de tipo null
//*Voy a traer name, username, email, hone del user de la API que esta en fetch
const mostrarDatos = (post) => {
    //*creando (elementos) nodos mediante el DOM manipulation
    const name = document.createElement("h2");
    const userName = document.createElement("h3");
    const email = document.createElement("p");
    const phone = document.createElement("p");

    //*Ponerlos en el HTML (innerHTML) se pone .la llave que queremos traer de la api
    name.innerHTML = post.name;
    userName.innerHTML = post.username;
    email.innerHTML = post.email
    phone.innerHTML = post.phone;

    //*Hacer que aprezcan en el navegador
    info.appendChild(name);
    info.appendChild(userName);
    info.appendChild(email);
    info.appendChild(phone);

}

//*Usando fetch para mostra en navegador (ahora de productos)

const botonProductos = document.querySelector("#btn-store");
const tienda = document.querySelector("#store");
let productos = null;

botonProductos.addEventListener("click" , () =>{
    fetch("https://fakestoreapi.com/products")
    .then (response => response.json())
    .then(response =>{
        productos=response
        //*Funcion por definir
        mostrarProductos(productos);
    })
    .catch(error => console.error("cuidao pescador", error))
});

//*funcion para crear, agregar y mostrar elementos desde el DOM
const mostrarProductos = (productos) => {
    //*Mando a llamar las llaves title, price, description, category, imagen desde API
    productos.map((productos) => {//*funcion .map en lugar de for each, toma el array (objeto en js) y crea nuevos arreglos que se pueden manipular de manera individual. Así, evitamos el uso de un ciclo forEach 
    const imagen = document.createElement("img");
    const titulo = document.createElement("h2");
    const precio = document.createElement("h3");
    const descripcion = document.createElement("p");
    const categoria = document.createElement("p");
    const separador = document.createElement("hr");

    //*Enviar a HTML con innerHTML
    imagen.src = productos.image; //*para imagen es src
    imagen.widht = 50;
    titulo.innerHTML = productos.title;
    precio.innerHTML = productos.price;
    descripcion.innerHTML = productos.description;
    categoria.innerHTML = productos.category;
    //*Mostrarlos en navegador al agragarlos a su padre
    tienda.appendChild(imagen);
    tienda.appendChild(titulo);
    tienda.appendChild(precio);
    tienda.appendChild(descripcion);
    tienda.appendChild(categoria);
    tienda.appendChild(separador);
    })
}

//*Metodo post utilizando fetch, me permite crear recursos en la API
fetch("https://jsonplaceholder.typicode.com/posts", {
    //*Indicar que es un metodo de tipo POST
    method: "POST",
    //*Creo el body de mi nuevo objeto, siguiendo, las mismas llaves de la API existente
    //*UserID, title y body
    body: JSON.stringify({//*books
        userID: 1986,//*useriID
        title: "Sueñan los androides con ovejas eectricas?",//*book
        body: "Author:Phillipe K. Dick"//*author.value
        
    }),
    //*Definir headers
    headers:{
        "content-type":"application/json; charset=UTF-8"
    }
})
//*Fin de fetch, inicio de mis promesas
    .then(response => response.json())
    .then(response => {
        console.log(response)
        
})

//*=====Programacion asincrona (promesa)====
//*Funcion flecha de tipo sync-await
//*Indico que es una funcion asincrona con la palabra reservad async antes de los parametros
const getUser = async() =>{
    //*Para que se cumpla la promesa, no utilizamos then sino que usamos try para errores, se sigue utilizando catch
    try{
        //*Promesa se ejecuta, se le poneretardo para que se ejecute de manera asincrona
        await new Promise(resolve => setTimeout(resolve, 3000));

        const url = "https://jsonplaceholder.typicode.com/users/4";
        const response = await fetch (url);
        const data = await response.json();
        console.log(data);
    } catch (error){
        console.error("error rarito", error);
    }
}
//*invocar funcion, que no se ovide pofa
getUser();


//*================LocalStorage======================
//*Nos permite modificar eliminar, guardar objetos de js de manera local en el equipo
//*Crear un objeto de js con sus llaves y valores
const user = [
    {
    id:1,
    nombre: "Aldo",
    apellido:"Beltran",
    email:"aldo6a@hotmail.com",
    posicion: "estudiante",
    empresa:"Generation"
},    
{
    id:2,
    nombre: "Fer",
    apellido:"Martinez",
    email:"ferchas@hotmail.com",
    posicion: "java dev",
    empresa:"Generation"
}

];

//*Convertir el objeto creado a notacion JSON y almacenamiento en el localStorage, se guarda en cache
localStorage.setItem("usuario", JSON.stringify(user));

//*Traer el objeto desde localStorage
const users = JSON.parse(localStorage.getItem("usuario"));
console.log(users);
console.log(`${user[1].nombre} con posicion ${user[1].posicion}, trabaja en ${user[1].empresa}`);

//*SesionStorage