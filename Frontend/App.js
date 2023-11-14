import react, {Suspense} from "react";
import { fetchData } from "./src/fetchData";
import  "./src/App.css";

const apiData = fetchData("http://localhost:8080/api/usuarios");

 function App(){
   const data = apiData.read();
  console.log(data)
   return (
    <div className="App">
      <h1>Datos del Usuario</h1>
      <Suspense fallback={<div>Cargando...</div>}>
        <table className="Tarjeta">
          <thead>
            <tr>
            <th>Id</th>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Correo Electronico</th>
            </tr>
          </thead>
          <tbody>
            {data?.map((item) => (
              <tr key={item.idusuario}>
                <td>{item.idusuario}</td>
                <td>{item.nombre}</td>
                {/* Assuming there's a property for apellido in your data */}
                <td>{item.apellido}</td>
                <td>{item.correolectronico}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </Suspense>
    </div>
  );
}

export default App;
