/*
*==Manipulacion del Dom==
*-Podemos leer y traer nodos del arbol del Dom.
*document.getElementById (Trae elementos por Id)
*document.getElementsByClassName (Trae elementos por Class)
*document.getElemenstByTagName (Trae elementos por Etiquetas)
*/

//*getElementById
const titulo = document.getElementById("title1");
console.log(titulo);
console.log(titulo.innerText); //*Trae un string (texto que vive en mi Id)

//*getElementsByClassName
const titulos = document.getElementsByClassName("title");
console.log(titulos);
console.log(titulos.length); //*Devuelve la longitud de elementos de la clase
console.log(typeof titulos); //*Muestra que es un objeto porque es una coleccion de arrays

//*getElementsByTagName
const tituloH3 = document.getElementsByTagName("h3");
console.log(tituloH3);
console.log(tituloH3[0].innerText);

/*
*Metodos para llamar elementos mediante selecciones de CSS, Se usa pra procesos especificos y la sintaxis querySelector
*-document.querySelector("Selector"); //#, ., <>
*-document.querSelectorAll(). Selecciona los elementos con el selector indicado

 */

//*querySelector
const query = document.querySelector("#title4");
console.log(query.innerText);

const queryClass = document.querySelectorAll(".title");
console.log(queryClass);

//*querySelectorAll
const queryClassAll = document.querySelectorAll(".title");
console.log(queryClassAll);


//*Manipular elementos del DOM (Styles) con JS
titulo.style.textAlign = "center";
titulo.style.color = "#A62F03"; //*Aqui se cambio el color introdcuiendo de Adobe colors

//*Manipular el texto de un elemento
const titulo2 = document.querySelector("#title2");
titulo2.innerText = "Sesion de Manipulacion del DOM - CH35"
titulo2.style.color = "#D93636";

/*
*Metodos para crear y agregar elementos en el DOM. Este proceso se divide en dos : "Crear el nodo y agregr el nodo"
*-Crear nodos
*--document.createElement("element") --> Crear elementos a partir de etiquetas.
*--document.createTextNode ("text") -->Crea texto dentro de las etiquetas:

*/
const nodo1 = document.createElement("h4");
const imgNodo = document.createElement("img");

/*
* -Agregar nodos, mandamos a llamar el elemento padre y le pasamos la propiedad con la constante que guarda el nodo creado.

*---parsentElement.appendChild(const);
*---parsentElement.append(const);
*---parsentElement.insertBefore(const);
*---parsentElement.inertAdjacentElement(const);

*Se utilizara mayormente appendChild
 */
const parentElement = document.getElementById("dif");
//*Agregar texto al nodo1
const textNodo1 = document.createTextNode ("Imagen agregada desde el DOM");
//*inserto el texto con el nodo1
nodo1.appendChild(textNodo1);
//*Insertar nodo1 en el elemento padre
parentElement.appendChild(nodo1);
parentElement.style.fontFamily = "`Karla`,sans-serif";
parentElement.style.color = "#7C53A6";

//*Agregar imagen
//*Inserto el imgNodo en el elemento padre para definirlo posteriormente.
parentElement.appendChild(imgNodo);
//*Accedo a las propiedades de la imagen
imgNodo.src = "./src/assets/image20231218120450.jpg";
imgNodo.alt = "Octocat-gitHub";
imgNodo.width = "300";

/*
*Otra forma de leer y modificar nodos
*---document.outerHTML (leer)
*---node.innerHTML (escribir sobre el nodo)
*/
const elementOuter = titulo2.outerHTML;
console.log(elementOuter);
titulo2.innerHTML = "Manipulacion del DOM - CH35";


