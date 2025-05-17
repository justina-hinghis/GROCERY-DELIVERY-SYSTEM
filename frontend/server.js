// Import required modules
const express = require('express');
const path = require('path');
const mysql = require('mysql2');

// Create an Express app
const app = express();
const PORT = 3000; // You can change the port if needed

// Middleware to parse form data (for POST requests)
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

// Serve static files from the "public" directory
app.use(express.static(path.join(__dirname, 'public')));

// Create a MySQL connection
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'justina@2005',
  database: 'grocery_db',
});

// Connect to the database
connection.connect((err) => {
  if (err) {
    console.error('Error connecting to MySQL:', err.stack);
    return;
  }
  console.log('Connected to MySQL as id ' + connection.threadId);
});

// Route to serve login.html
app.get('/login', (req, res) => {
  res.sendFile(path.join(__dirname, 'login.html'));
});

app.get('/', (req, res) => {
  res.redirect('/login');
});

// Route to serve home.html
app.get('/home', (req, res) => {
  res.sendFile(path.join(__dirname, 'home.html'));
});

// Optional: Handle login form submission (if you're posting from login.html)
app.post('/login', (req, res) => {
  const { username, password } = req.body;

  const query = 'SELECT * FROM users WHERE username = ? AND password = ?';
  connection.query(query, [username, password], (err, results) => {
    if (err) {
      console.error('Login error:', err);
      res.status(500).send('Internal server error');
    } else if (results.length > 0) {
      res.redirect('/home');
    } else {
      res.status(401).send('Invalid credentials');
    }
  });
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
