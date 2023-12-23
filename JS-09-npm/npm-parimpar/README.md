# Crear y publicar un nuevo paquete de npm

## Creacion del package
1.-Inicializar npm desde CLI con el comando
```sh
npm init
```
Me guiara a traves de una serie de pasos donde me solicita informacion relacionada con mi package, como el nombre(nombre unico), la version, la descripcion, el punto de entrada (index.js), comando de prueba, repositorio de git en donde vive palabras clave para coincidir con busquedad, autor, licencia 
2.-Presionar enter para aceptar que la informacion es correcta y generar el archivo package.json
> - package.json
-Contiene informacion sobre el proyecto-modulo que vamos a crear. son un estandar de nodejs para facilitar la estructura y ejecucion de los proyectos dentro del entorno de ejecucion y de esta manera poder compartirlo a traves del sitio [https://wwww.npmjs.com].
-La informacion se estructura como objeto de js con notacion JSON.

3.-Crear una carpeta llamada `modules` en donde vivira nuestro script 
4.-Dentro de `modules` crear el script (.js) con el nombre `parimpar.js`
5.-Crear la funcion del script y exportarlo con `export default`
6.-Importar el script desde el archivo`index.js` con `import + funcion + from + ruta con estension` e invocamos la funcion con parametros.

    ```javascript
    import determinarParImpar from "./modules/parimpar.js";
    ```
7.-Configurar el `type.module` en el archivo `package.json`
8.-Ejecutamos el programa desde el entorno de nodejs con el comando 
```sh
node index.js
```
## Publicar package en npm
1. Iniciar sesión de npm pero ahora desde CLI con el comando
```sh
npm login
```
2.  Esperemos que cargue y presionamos enter para abrir el navegador.
3.-Recibiremos un correo con un password de una sola vez, lo agregamos y presionamos Login
4.-Regresamos a la terminal y nos mostrara e mensaje `logged in on npmjs.org`
5.-Publicar el package con acceso publico desde CLI a npm con el comando.
```sh
npm publish --access=public
```