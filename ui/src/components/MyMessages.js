import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function UserMessages() {
    const [messages, setMessages] = useState([]);
    const username = localStorage.getItem('username');
    const navigate = useNavigate();

    const fetchUserMessages = async () => {
        try {
            const response = await axios.post('/api/chatroom/userMessages', { username: username });
            setMessages(response.data);
        } catch (error) {
            console.error('Error fetching user messages:', error);
        }
    };

    useEffect(() => {
        fetchUserMessages();
    }, [username]);

    const editMessage = async (messageId, currentMessage) => {
        const newMessage = prompt("Edit your message:", currentMessage);
        if (newMessage) {
            try {
                await axios.post('/api/chatroom/update', { username: username, message: newMessage, id: messageId });
                await fetchUserMessages();
            } catch (error) {
                console.error('Error editing message:', error);
            }
        }
    };

    const deleteMessage = async (messageId) => {
        if (window.confirm("Are you sure you want to delete this message?")) {
            try {
                await axios.post('/api/chatroom/delete', { id: messageId });
                await fetchUserMessages();
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
                <div className="card p-3 mb-4">
                    <div className="chat-box">
                        {messages.map((message) => (
                            <div className="chat-message mb-3" id={`message-${message.id}`} key={message.id}>
                                <div className="d-flex justify-content-between">
                                    <div>
                                        <strong>{message.user.username}</strong>: <span className="message-text">{message.message}</span>
                                    </div>
                                    <div className="text-right">
                                        <small className="text-muted">{new Date(message.updatedTime).toLocaleString()}</small>
                                        <div className="actions mt-2">
                                            <button className="btn btn-sm btn-warning mr-2" onClick={() => editMessage(message.id, message.message)}>Edit</button>
                                            <button className="btn btn-sm btn-danger" onClick={() => deleteMessage(message.id)}>Delete</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        ))}
                    </div>
                </div>
                <div className="text-center mt-4">
                    <button className="btn btn-secondary" onClick={() => navigate('/chatroom')}>Back to Chatroom</button>
                </div>
            </div>
        </div>
    );
}

export default UserMessages;