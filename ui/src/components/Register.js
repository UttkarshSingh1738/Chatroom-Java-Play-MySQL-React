import React, { useState } from 'react';
import axios from 'axios';
import {useNavigate} from "react-router-dom";

function Register() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState('');
    const [error, setError] = useState('');
    const navigate = useNavigate();

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            const response = await axios.post('/api/save', { username, password });
            console.log(response.data);
            setMessage('Registration successful! Redirecting to login page...');
            setTimeout(() => {
                navigate('/');
            }, 2000); // Redirect after 2 seconds
        } catch (error) {
            setError('Error registering. Please try again.');
            console.error('Error registering:', error);
            setMessage('Error registering user. Please try again.');
        }
    };

    return (
        <div className="container">
            <div className="row justify-content-center mt-5">
                <div className="col-md-6">
                    <div className="card shadow-sm">
                        <div className="card-body">
                            <h2 className="text-center mb-4">Register</h2>
                            {error && <div className="alert alert-danger" role="alert">{error}</div>}
                            {message && <div className={`alert ${message.includes('successful') ? 'alert-success' : 'alert-danger'} text-center`}>{message}</div>}
                            <form onSubmit={handleSubmit}>
                                <div className="form-group">
                                    <label htmlFor="username">Username</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        id="username"
                                        value={username}
                                        onChange={(e) => setUsername(e.target.value)}
                                        placeholder="Enter your username"
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="password">Password</label>
                                    <input
                                        type="password"
                                        className="form-control"
                                        id="password"
                                        value={password}
                                        onChange={(e) => setPassword(e.target.value)}
                                        placeholder="Enter your password"
                                        required
                                    />
                                </div>
                                <button type="submit" className="btn btn-primary btn-block mt-4">Register</button>
                            </form>
                            <p className="text-center mt-3">Already have an account? <a href="/">Login here</a>.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Register;