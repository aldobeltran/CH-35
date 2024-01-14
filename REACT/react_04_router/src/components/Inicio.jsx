import { Link } from "react-router-dom"

const Inicio = () => {
    return (
        <>
        <div>
            <h1>Esta es la pagina de inicio</h1>
            <Link to="about us">
                presiona aqui para ir a nuestra pagina sobre nosotros
            </Link>
            
            <br />
            <Link to="contacto">
                presiona aqui para ir a nuestra pagina de contacto
            </Link>

        </div>
        </>
    )
}

export default Inicio