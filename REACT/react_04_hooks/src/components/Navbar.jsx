import './Navbar.css' //Importación de CSS
import ISSLogo from '../assets/ISS_logo.svg'

//Crear función que contiene el marcado para que viva nuestro código
const Navbar = () => {
        const url1 = 'https://www.nasa.gov/international-space-station/'
        const url2 = 'https://www.nasa.gov/mission/apollo-13/'
        const url3 = 'http://open-notify.org/Open-Notify-API/People-In-Space/'
    return (
        <> {/*Fragmento... (por cierto, el comentario debe ser multilínea y estar encerrado entre llaves) */}
        <div className='navbar--container'>
            <div className='navbar--title'>
                <a href= { url1 } target='_blank' id='link--logo'>
                    <img src={ISSLogo} alt='Logo de ISS'/>
                </a>
            </div>
            <div className='navbar--links'>
                <div className='navbar--link'>
                    <a href={ url1 }target='_blank'>Home</a>
                </div>
                <div className='navbar--link'>
                    <a href={ url2 }target='_blank'>Apolo 13</a>
                </div>
                <div className='navbar--link'>
                    <a href={ url3 }target='_blank'>Astros</a>
                </div>
            </div>
        </div>
        </>
    )
}

export default Navbar;

import './Navbar.css' //Importacion de CSS

//Crear funcion que contiene le marcado para que viva nuestro codigo
