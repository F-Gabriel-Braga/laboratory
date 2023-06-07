import React, { useState, useEffect } from 'react';

import './style.css';

import { Card } from '../../components/Card';

export function Home() {
  const [studantName, setStudantName] = useState('Gabriel');
  const [studants, setStudants] = useState([]);
  const [user, setUser] = useState({ name: '', avatar: '' })

  function handleAddStudant() {
    const newStudant = {
      name: studantName,
      time: new Date().toLocaleTimeString("pt-br", {
        hour: '2-digit',
        minute: '2-digit',
        second: '2-digit'
      })
    }
    setStudants(prevState => [...prevState, newStudant]);
  }

  useEffect(() => {
    async function fetchDataUser() {
      const response = await fetch('https://api.github.com/users/f-gabriel-braga');
      const data = await response.json();
      setUser({
        name: data.name,
        avatar: data.avatar_url
      })
    }
    fetchDataUser();
  }, []);

  return (
    <div className='container'>
      <header>
        <h1>Lista de presença</h1>
        <div>
          <strong>{user.name}</strong>
          <img src={user.avatar} alt="Foto de Perfil" />
        </div>
      </header>
      <input type="text" placeholder="Digite o nome:" onChange={event => setStudantName(event.target.value)} />
      <button type="button" onClick={handleAddStudant}>Adicionar</button>

      {
        studants.map(studant => {
          return (<Card name={studant.name} time={studant.time} key={studant.time} />)
        })
      }
    </div>
  )
}

// export default Home
