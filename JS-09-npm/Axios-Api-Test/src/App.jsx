import './App.css'
import axios from 'axios'

function App() {

  //*Funcion async-await para consumir APi
  const getUsers = async () => {
    try{
      const response = await axios.get("https://jsonplaceholder.typicode.com/users/3");
      console.log(response);
      console.log(response.data[1].name);//*Output para usuario "Erwin howell"
    } catch(error){
      console.log("peligro", error);
    }
  }

  //*Funcion async-await para enviar un usuario
  const postUsers = async () => {
    try{
      const url = "https://jsonplaceholder.typicode.com/posts";
      const user = {
        userId: 1986,
        title: "Java Fullstack dev",
        body: "Aldo Beltran"
      }
      const response = await axios.post(url, user);
      console.log(response);
      //*Para mostrar solo la info en consola
      console.log(response.data);
    } catch(error) {
      console.log("cuidado", error);
    }
  }

  return (
    <>
      <div>
        <h1 className="box">HTTP - Axios</h1>
      </div>
      <div className="card">
        <button onClick={getUsers}>
          Get Method
        </button>
        <button onClick={postUsers}>
          Post Method
        </button>
      </div>
    </>
  )
}

export default App
