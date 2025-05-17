# Grocery Delivery System

A simple grocery delivery web application built using Node.js, Express, and MySQL. This app includes user login functionality and basic routing for frontend pages like `login.html` and `home.html`.

## 📁 Project Structure

```
grocery-delivery-system/
├── server.js               # Express server with MySQL integration
├── package.json            # Node project config with start script
├── public/                 # Static HTML pages
│   ├── login.html
│   └── home.html
└── README.md               # Project documentation
```

## 🚀 Features

- User login system connected to MySQL database
- Static page routing for `login` and `home`
- Organized file structure for backend and frontend
- Easy to run with `npm start`

## 🛠️ Technologies Used

- Node.js
- Express.js
- MySQL
- HTML/CSS (basic frontend)

## 🧑‍💻 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/grocery-delivery-system.git
cd grocery-delivery-system
```

### 2. Install Dependencies

```bash
npm install
```

### 3. Start the Server

```bash
npm start
```

The app will be available at [http://localhost:3000](http://localhost:3000)

### 4. MySQL Database Setup

- Create a MySQL database named `grocery_db`.
- Create a table `users` with at least `username` and `password` fields.
- Update your `server.js` with the correct database credentials.

Example `users` table:
```sql
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);
```

## 📝 License

This project is licensed under the MIT License - feel free to use and modify it.

---

### 📬 Contact

For questions or suggestions, feel free to contact [Your Name](mailto:your-email@example.com).
