# Pruebas unitarias con Jest

## Inicializar node 
```sh
$ npm init -y
```

### Crear archivo index.js
`index.js`

### Instalar y configurar Jest
```sh
npm install --save-dev jest
```
En el `package.json`, modificar los scripts de test
```javascript
    "scripts": {
        "test": "jest"
    },
```

Crear carpeta `modules` y dentro el archivo `calculator.js`

Crear carpeta`test` y dentro el archivo `calculator.test.js`

creamos lo metodos y funciones, esportamos e importamos
Ejecutamo Jest desde comando 'npm test'