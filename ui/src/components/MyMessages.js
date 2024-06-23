import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function UserMessages() {
    const [messages, setMessages] = useState([]);
    const username = localStorage.getItem('username');
    const navigate = useNavigate();

    useEffect(() => {
        const fetchUserMessages = async () => {
            try {
                const response = await axios.post('/api/chatroom/userMessages', {username: username});
                setMessages(response.data);
            } catch (error) {
                console.error('Error fetching user messages:', error);
            }
        };

        fetchUserMessages();
    }, [username]);

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

    return (
        <div className="container mt-5">
            <div className="text-center mb-4">
                <h1 className="display-4">My Messages</h1>
            </div>
            <div className="chat-container">
                <div className="chat-box card p-3 mb-4" id="chat-box">
                    {messages.map((message) => (
                        <div className="chat-message mb-2" id={`message-${message.id}`} key={message.id}>
                            <strong>{message.user.username}</strong>: <span className="message-text">{message.message}</span> <em>{new Date(message.updatedTime).toLocaleString()}</em>
                            <div className="actions">
                                <button className="btn btn-sm btn-warning" onClick={() => editMessage(message.id, message.message)}>Edit</button>
                                <button className="btn btn-sm btn-danger" onClick={() => deleteMessage(message.id)}>Delete</button>
                            </div>
                        </div>
                    ))}
                </div>
                <div className="text-center mt-4">
                    <button className="btn btn-secondary" onClick={() => navigate('/chatroom')}>Back to Chatroom</button>
                </div>
            </div>
        </div>
    );
}

export default UserMessages;