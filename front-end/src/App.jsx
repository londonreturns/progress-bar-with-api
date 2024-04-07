import { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css';
import Card from './component/Card';

function App() {
  const [getter, setter] = useState([])
   useEffect(() => {
    axios.get('http://localhost:8080/api')
      .then(res => {
        console.log(res.data); 
        setter(res.data)
      });
  },[])
  return (
    <>
    <div className="container">
      <div className="row d-flex justify-content-around">
        {getter.map((item)=>(
          <Card key={item.value} {...item} />
          
        ))}

      </div>
    </div>
    </>
    
  );
}

export default App;
