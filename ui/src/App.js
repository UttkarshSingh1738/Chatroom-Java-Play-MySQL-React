import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { AppBar, Toolbar, Typography, Container, Card, CardContent, CircularProgress } from '@mui/material';

const theme = createTheme({
    palette: {
        primary: {
            main: '#1976d2',
        },
    },
});

function App() {
  const [summary, setSummary] = useState('');

  useEffect(() => {
    axios.get('/api/summary')
        .then(response => setSummary(response.data.content))
        .catch(error => console.error('Error fetching summary:', error));
  }, []);

    return (
        <ThemeProvider theme={theme}>
            <AppBar position="static">
                <Toolbar>
                    <Typography variant="h6">
                        Chatroom Application
                    </Typography>
                </Toolbar>
            </AppBar>
            <Container maxWidth="sm" style={{ marginTop: '2em' }}>
                    <Card>
                        <CardContent>
                            <Typography variant="h5" component="div">
                                Summary
                            </Typography>
                            <Typography variant="body2" color="text.secondary">
                                {summary}
                            </Typography>
                        </CardContent>
                    </Card>

            </Container>
        </ThemeProvider>
    );
}

export default App;