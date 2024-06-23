import React, { useState } from 'react';
import axios from 'axios';

function Register() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        axios.post('/api/save', { username, password })
            .then(response => {
                // Handle successful registration (e.g., redirect)
                console.log(response.data);
            })
            .catch(error => {
                console.error('Error registering:', error);
            });
    };

    return (
        <div className="container">
            <h1>Register</h1>
            <form onSubmit={handleSubmit}>
                <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} placeholder="Username" required />
                <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} placeholder="Password" required />
                <button type="submit">Register</button>
            </form>
            <p>Already have an account? <a href="/">Login here</a>.</p>
        </div>
    );
}

export default Register;
