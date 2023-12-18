/*
*Para manipular la informacion de un usuario, necesito crear un perfil mediante un objeto JS

 */

const user ={
username: `aldobeltran`,
age: 24,
email:`aldo6a@hotmail.com`,
favfilms: [`Interestelar`,`Se7en`,`Irongiant`]

}

//*Crea una funcion que me permita ingresar el objeto del perfil en el nodo padre.
const createUser = (user) => {
    document.getElementById("username").textContent = user.username;
    document.getElementById("age").textContent = user.age;
    document.getElementById("email").textContent = user.email;
    //*Mostrando elementos de lista en forma de lista 
    //*Para mostrar el array en forma de lista utilizaremos el ciclo forEach, para recorrer todo el array y traer cada elemento en la lista
const ul = document.getElementById("fav-films");
user.favfilms.forEach(film => {
        const li = document.createElement("li");
        li.textContent = film;
        ul.appendChild(li);
});
//*Modificandoo estilos de la ul para quitar viñetas
    ul.style.listStyleType = "none";
    ul.style.padding = "0";
    ul.style.color= "#F2CD5C";

    //*Mostrando elemntos en forma de fila (no nos sirve por que definimos una lista desordenada y no un parrafo)
    //document.getElementById("fav-films").textContent = user.favfilms;
}

//*Invocar la funcion
createUser(user);

/*
*Events para actualizar el username mediante el input y el boton
 */

const inputName = document.getElementById("name");
const userName = document.getElementById("username");
const userEmail = document.getElementById("useremail");
const Inputemail = document.getElementById("email");
const profileBtn = document.getElementById("btn-main");


profileBtn.addEventListener("click", () =>{
    userName.textContent = inputName.value;
    userEmail.textContent = inputEmail.value;
});