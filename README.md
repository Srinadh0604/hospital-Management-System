Hospital Management System
(Spring Boot + OAuth2 + JWT)

🚀 A secure and scalable backend system designed to streamline hospital operations, including patient management, appointments, and role-based access — built with modern authentication and clean architecture principles.

✨ Key Features

🔐 Secure Authentication System
JWT-based authentication for stateless sessions
Google OAuth2 login integration for seamless access

👥 Role-Based Access Control (RBAC)
Admin, Doctor, and Patient roles with controlled permissions 

📅 Appointment Management
Book, update, and manage appointments efficiently

🏥 Hospital Workflow Management
Patient records, doctor interactions, and scheduling

🔒 Security Best Practices
Environment variables (.env) for sensitive data
No hardcoded secrets

🧱 Clean Architecture
Controller → Service → Repository layered design
🛠️ Tech Stack
Backend: Java, Spring Boot
Security: Spring Security, JWT, OAuth2
Database: PostgreSQL
Build Tool: Maven

🔑 Authentication Flow
JWT Flow:
User logs in with credentials
Server validates user and generates JWT token
Token is sent in response

Client includes token in headers:

Authorization: Bearer <JWT_TOKEN>
Server validates token for every request
OAuth2 Flow (Google Login):
User selects Google login
Redirected to Google authentication page
On success, backend receives user info
JWT token is generated and returned

📡 API Documentation

🔐 Auth Endpoints
Method	Endpoint	Description
POST	/api/auth/login	Login with credentials
GET	/api/auth/oauth2	Google OAuth2 login

👤 Patient Endpoints
Method	Endpoint	Description
GET	/api/patients	Get all patients
POST	/api/patients	Add new patient
GET	/api/patients/{id}	Get patient by ID

👨‍⚕️ Doctor Endpoints
Method	Endpoint	Description
GET	/api/doctors	Get all doctors
POST	/api/doctors	Add doctor

📅 Appointment Endpoints
Method	Endpoint	Description
POST	/api/appointments	Create appointment
GET	/api/appointments	View appointments
PUT	/api/appointments/{id}	Update appointment

⚙️ Setup Instructions

🧩 Prerequisites
Java 17+
Maven
PostgreSQL
Git
🚀 Installation Steps

Clone the repository

git clone https://github.com/Srinadh0604/hospital-Management-System.git
cd hospital-management-system

Configure Database

Create PostgreSQL database
Update application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/hospital_db
spring.datasource.username=your_username
spring.datasource.password=your_password

Configure Environment Variables

JWT_SECRET=your_secret_key
GOOGLE_CLIENT_ID=your_client_id
GOOGLE_CLIENT_SECRET=your_client_secret

Build & Run

mvn clean install
mvn spring-boot:run

Access API

http://localhost:8080/api

📦 Sample Requests & Responses
🔐 Login Request
POST /api/auth/login

{
"email": "user@example.com",
"password": "password123"
}
✅ Response
{
"token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
📅 Create Appointment
POST /api/appointments

{
"patientId": 1,
"doctorId": 2,
"date": "2026-04-15",
"time": "10:30"
}

📁 Project Structure

src/main/java/com/project/
│
├── controller/        # REST Controllers
├── service/           # Business logic
├── repository/        # Data access layer
├── entity/            # JPA entities
├── security/          # JWT & OAuth configs
├── config/            # App configurations
└── exception/         # Global exception handling 

📜 License

This project is licensed under the MIT License.