# React Router

### Instalacion 
Ejecutar el comando npm para instralar React Router
```sh
npm install react-router-dom
```

### Implementación
1. Importar React Router en `main.jsx` para que se encuentre disponible en cualquier parte de la aplicación.
Para ello, importamos el componente 
`import { BrowserRouter } from 'react-router-dom`

2. Modificar el componente `<App />` y envolverlo con los componentes `<BrowserRouter> </ BrowserRouter>` quedando de la siguiente manera:
```javascript
import { BrowserRouter } from 'react-router-dom'

<BrowserRouter>
    <App />
</BrowserRouter>
```
3. Crear componentes `Inicio.jsx`, `SobreNosotros.jsx`, `Contacto.jsx`
4. Necesitamos importar las funcionalidades que emplearemos `Route` y `Routes` dentro del archivo `App.jsx`
```javascript
import { Routes, Route } from 'react-router-dom'
```
5. Modificamos `App.jsx` para implementar Routes y Route
6. Para evitar etiquetas de anclaje <a></a>, vamos a ocupar una funcionalidad de react router llamada `{link}`
