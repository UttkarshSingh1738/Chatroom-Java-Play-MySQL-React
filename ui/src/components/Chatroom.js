import React, { useEffect, useState } from 'react';
import axios from 'axios';

function Chatroom() {
    const [messages, setMessages] = useState([]);
    const [newMessage, setNewMessage] = useState('');
    const username = localStorage.getItem('username');
    useEffect(() => {
        const fetchMessages = async () => {
            try {
                const response = await axios.get('/api/chatroom');
                setMessages(response.data);
            } catch (err) {
                console.error('Error fetching messages:', err);
            }
        };
        // console.log(messages.at(0));
        // fetchMessages();
    }, []);

    const sendMessage = async () => {
        if (newMessage.trim() !== '') {
            try {
                await axios.post('/api/chatroom/send', { username: username, message: newMessage });
                setNewMessage('');
                // Fetch messages again to update the list
                const response = await axios.get('/api/chatroom');
                setMessages(response.data);
            } catch (error) {
                console.error('Error sending message:', error);
            }
        }
    };

    const editMessage = async (messageId, currentMessage) => {
        const newMessage = prompt("Edit your message:", currentMessage);
        if (newMessage) {
            try {
                await axios.post('/api/chatroom/update', { username: username, message: newMessage, id: messageId });
                // Fetch messages again to update the list
                const response = await axios.get('/api/chatroom');
                setMessages(response.data);
            } catch (error) {
                console.error('Error editing message:', error);
            }
        }
    };

    const deleteMessage = async (messageId) => {
        if (window.confirm("Are you sure you want to delete this message?")) {
            try {
                await axios.post('/api/chatroom/delete', { id: messageId });
                // Fetch messages again to update the list
                const response = await axios.get('/api/chatroom');
                setMessages(response.data);
            } catch (error) {
                console.error('Error deleting message:', error);
            }
        }
    };

    const logout = async () => {
        try {
            await axios.get('/api/logout');
            localStorage.removeItem('token');
            localStorage.removeItem('username');
            window.location.href = '/';
        } catch (error) {
            console.error('Error logging out:', error);
        }
    };

    return (
        <div className="chatroom-container">
            <div className="text-center mb-4">
                <h1 className="display-4">Welcome to the Chatroom, {username}!</h1>
            </div>
            <div className="chat-box">
                {messages.map((message) => (
                    <div className="chat-message mb-2" id={`message-${message.id}`} key={message.id}>
                        <strong>{message.user.username}</strong>: <span className="message-text">{message.message}</span> <em>{new Date(message.updatedTime).toLocaleString()}</em>
                        {message.user.username === username && (
                            <div className="actions">
                                <button className="btn btn-sm btn-warning" onClick={() => editMessage(message.id, message.message)}>Edit</button>
                                <button className="btn btn-sm btn-danger" onClick={() => deleteMessage(message.id)}>Delete</button>
                            </div>
                        )}
                    </div>
                ))}
            </div>
            <div className="input-group mb-4">
                <input
                    type="text"
                    className="form-control"
                    value={newMessage}
                    onChange={(e) => setNewMessage(e.target.value)}
                    placeholder="Type a message..."
                />
                <div className="input-group-append">
                    <button className="btn btn-primary" onClick={sendMessage}>Send</button>
                </div>
            </div>
            <div className="text-center mt-4">
                <button className="btn btn-info" onClick={() => window.location.href = '/userMessages'}>View My Messages</button>
            </div>
            <div className="text-center mt-4">
                <button className="btn btn-secondary" onClick={logout}>Logout</button>
            </div>
        </div>
    );
}

export default Chatroom;