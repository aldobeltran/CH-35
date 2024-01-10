import './Main.css'
import GenMxLogo from '../assets/generation_logo.jpg'


const Main = () => {
    return (
        <>
        <div className='main--container'>
            <div className="main--head">
                <a href='https://mexico.generation.org/' target='blank'>
                    <img src={GenMxLogo}  className='main--logo' 
                    alt='Logo Gen Mex' />
                </a>
            </div>
            <h1>React + vite</h1>
            <h2>Astros Api</h2>
        </div>
        </>
    )
}

export default Main;