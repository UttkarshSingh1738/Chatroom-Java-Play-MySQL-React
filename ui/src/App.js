import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';
import Chatroom from "./components/Chatroom";
import MyMessages from "./components/MyMessages";

function App() {
    return (
        <Router>
            <div className="App">
                <Routes>
                    <Route exact path='/' element={<Login/>} />
                    <Route path='/register' element={<Register/>} />
                    <Route path="/chatroom" element={<Chatroom/>} />
                    <Route path="/userMessages" element={<MyMessages/>} />
                </Routes>
                <div className="footer">
                    &copy; 2024 Chatroom Application | All rights reserved
                </div>
            </div>
        </Router>
    );
}

export default App;