# Grocery Delivery System

A full-stack grocery delivery application with:

- 🖥️ **Frontend** using Node.js + Express (serves static HTML pages)
- 🚀 **Backend API** using Java Spring Boot (handles user data and business logic)
- 🗄️ **MySQL** database for data storage

---

## 📁 Project Structure

```
grocery-delivery-system/
├── backend/                        # Spring Boot API
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/grocery/
│   │   │   │   ├── controller/     # API controllers
│   │   │   │   ├── model/          # Entity classes
│   │   │   │   ├── repository/     # Spring JPA Repositories
│   │   │   │   └── GroceryApplication.java
│   │   │   └── resources/
│   │   │       ├── application.properties
│   └── pom.xml                     # Maven configuration
│
├── frontend/                       # Node.js + Express frontend
│   ├── public/
│   │   ├── login.html
│   │   └── home.html
│   ├── server.js
│   └── package.json
│
└── README.md                       # Project documentation
```

---

## ⚙️ Tech Stack

| Layer      | Technology         |
|------------|--------------------|
| Frontend   | HTML, CSS, Node.js, Express |
| Backend    | Java Spring Boot, REST APIs |
| Database   | MySQL              |

---

## 🧑‍💻 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/grocery-delivery-system.git
cd grocery-delivery-system
```

---

## 🔧 Backend Setup (Java Spring Boot)

### Prerequisites:
- Java 17 or later
- Maven
- MySQL

### Steps:

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

### `application.properties` example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/grocery_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🖥️ Frontend Setup (Node.js + Express)

### Prerequisites:
- Node.js and npm

### Steps:

```bash
cd frontend
npm install
npm start
```

Visit: [http://localhost:3000](http://localhost:3000)

---

## 🔗 Example API Endpoints

| Method | Endpoint          | Description        |
|--------|-------------------|--------------------|
| POST   | `/api/login`      | Login user         |
| GET    | `/api/users`      | Fetch all users    |
| POST   | `/api/users`      | Create new user    |

---

## 🧪 MySQL Setup

Run the following SQL:

```sql
CREATE DATABASE grocery_db;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);
```

---
