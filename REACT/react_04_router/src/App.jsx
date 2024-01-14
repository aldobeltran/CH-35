
import './App.css'
import { Routes, Route } from 'react-router-dom'
import Inicio from './components/Inicio'
import SobreN from './components/SobreNosotros'
import Contacto from './components/Contacto'

// - Routes. Actúa como contenedor padre de todas las rutas individuales que se crearán en la aplicación
/* - Route. Es la ruta 'hija' de cada componente. Recibe dos atributos
    1. path: especifica la ruta (URL) a seguir
    2. element: especifica el componente que se renderiza 
*/
function App() {


  return (
    <>
    <Routes>
      <Route path="/" element= {<Inicio />} />
      <Route path="about us" element= {<SobreN />} />
      <Route path="contacto" element= {<Contacto />} />
    </Routes>
    </>
  )
}

export default App


      
      