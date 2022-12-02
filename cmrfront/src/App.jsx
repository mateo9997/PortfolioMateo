import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Login from './components/Login'
import { useState, createContext } from "react";
import Costumers from './components/Costumers';
import Opportunities from './components/Opportunities';
import Contacts from './components/Contacts';
import Header from './components/Header';

function App() {

  return (
    <BrowserRouter>
      <Header />
      <Routes>
      <Route path='/hola' element={ <Costumers/> }/>  
        <Route path='/Login' element={ <Login/> }/> 
        <Route path='/costumers' element={ <Costumers/> }/> 
        <Route path='/opportunities' element={ <Opportunities/> }/>
        <Route path='/contacts' element={ <Contacts/> }/>  
      </Routes>
    </BrowserRouter>
  ) 
}

export default App
