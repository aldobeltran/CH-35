# Pasos para iniciar el proyecto colors
1.-crear una carpeta llamada colors
2.-crear un archivo `main.js`

## npm desde CLI
3.-Iniciamos un proyecto desde npm con el comando
```sh
npm init -y
```
4.-Buscamos el package colors y lo instalamos con el comando 
```sh
npm i colors
```
5.-Dentro del archivo `main.js` vamos a importar el paquete colors con la linea de codigo
```javascript
const colors = require("colors");
```
6.- Implementar las funciones de colors (estilos para el texto de la terminal) en el m ain.js, Para ellos hay que consultar la documentacion oficial de colors en [https://npmjs.com]

7.-Para ejecutar el package, utilizando el comando
```sh
node archivo.js
```
8. Eliminar (desinstalar) módulos de npm
```sh
npm uninstall colors
```
