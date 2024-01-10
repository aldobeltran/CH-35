import './Button.css'


/*
*Props: propiedades que se le pueden asignar a los comportamientos para modificar el texto, la informacion desde la renderizacion del mismo.
* Se asignan como parametro de la funcion con el nombre del prop y debe i entre llaves
* Se manda a llamar en el bloque de codigo donde se debe implementar utilizando llaves
 */
const Button = ({ label }) => {
    return (
        <>
        <button>
            {label}
        </button>
        </>
    )
}

export default Button