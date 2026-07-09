# LearningApp

A Spring Boot backend for managing small learning groups — subjects, assignments, submissions, and grading — with role-based access for Admins, Teachers, and Students.

---

## 🚀 Features

- **JWT-based authentication** with role-based access control (`ADMIN`, `TEACHER`, `STUDENT`)
- **Admin tools** — create users, list/filter users by role, create subjects, assign teachers to subjects
- **Teacher tools** — view assigned subjects, create assignments, view student submissions, grade submissions, compile per-subject mark reports
- **Student tools** — view enrolled subjects and pending assignments, submit assignments (multipart file upload for images/PDFs), view marks
- **Centralized exception handling** via a global exception handler (`ResourceNotFoundException`, `ForbiddenException`)

---

## 🛠 Tech Stack

- **Language:** Java 23
- **Framework:** Spring Boot
- **Security:** Spring Security + JWT (`jjwt`)
- **Persistence:** Spring Data JPA, PostgreSQL
- **Mapping:** ModelMapper
- **Validation:** Spring Boot Starter Validation
- **Build tool:** Maven

**Companion frontend:** [learningApp-frontend](https://github.com/Mohitrawal7/learningApp-frontend) (React + Vite + Tailwind)

---

## 📂 Project Structure

```
src/main/java/com/mohit/LearningApp/
├── config/           JwtAuthFilter, SecurityConfig, WebConfig
├── controller/        AdminController, TeacherController, StudentController, AuthController, SubjectController
├── dto/                RegisterRequest, LoginRequest, LoginResponse, UserDto, SubjectRequest, AssignmentRequest
├── entity/            User, Subject, Assignment, Submission, SubmissionFile
├── exception/         ResourceNotFoundException, ForbiddenException
├── exceptionhandler/  GlobalExceptionHandler
├── repository/        UserRepository, SubjectRepository, AssignmentRepository, SubmissionRepository, SubmissionFileRepository
└── service/            JwtService, UserService, SubjectService, TeacherService, SubmissionService, SubmissionFileService
```

---

## 🔌 API Endpoints

Endpoints are organized by role.

**Admin**
| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/users` | Create a new user (Teacher or Student) |
| GET | `/api/users` | List all users (filterable by role) |
| POST | `/api/subjects` | Create a new subject |
| PATCH | `/api/subjects/{id}/assign` | Assign a teacher to a subject |

**Teacher**
| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/teacher/subjects` | View subjects assigned to the logged-in teacher |
| POST | `/api/assignments` | Create a new assignment |
| GET | `/api/assignments/{id}/submissions` | View all submissions for an assignment |
| PATCH | `/api/submissions/{id}/grade` | Grade a student's submission |
| GET | `/api/subjects/{id}/report` | Get all students in a subject with total/average marks |

**Student**
| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/student/subjects` | View enrolled subjects |
| GET | `/api/student/assignments` | View pending/upcoming assignments |
| POST | `/api/submissions` | Submit an assignment (`multipart/form-data` for file uploads) |
| GET | `/api/student/marks` | View marks for submitted assignments |

---

## ⚙️ Setup Instructions

1. Clone the repository
```bash
git clone https://github.com/Mohitrawal7/LearningApp.git
cd LearningApp
```

2. Configure PostgreSQL and JWT via environment variables — **do not commit real credentials to `application.properties`**:
```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
jwt.secret=${JWT_SECRET}
```

3. Run the application
```bash
./mvnw spring-boot:run
```
The API starts on `http://localhost:8080`.

4. To run with the frontend, clone [learningApp-frontend](https://github.com/Mohitrawal7/learningApp-frontend) separately and point it at this backend's URL. If you only need the API, all endpoints above are testable directly in Postman.

---

## ✅ Production Checklist

- [ ] Move `jwt.secret` and database credentials out of `application.properties` into environment variables
- [ ] Change `spring.jpa.hibernate.ddl-auto` from `update` to `validate`
- [ ] Add file-type/size validation on submission uploads beyond the configured max size
- [ ] Add unit tests for grading and report-compilation logic

---

## 👨‍💻 Author

**Mohit Rawal**
- GitHub: [@Mohitrawal7](https://github.com/Mohitrawal7)
- Email: rawalmohit12@gmail.com
- LinkedIn: [mohit-rawal](https://www.linkedin.com/in/mohit-rawal-9480a52b2/)
