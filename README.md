This project is on learnig app
#  Project Structure

learning-app 

     ├── src
     
     | └── main
     |    ├── java
     |    |   └── com
     |    |       └── example
     |                └── mohit 
     |  ├── config
                      |   ├── SecurityConfig.java
│       │               ├── controller
│       │               │   ├── AuthController.java
│       │               │   ├── UserController.java
│       │               │   └── GroupController.java  <-- New file
│       │               ├── dto
│       │               │   └── UserDTO.java
│       │               ├── entity
│       │               │   ├── Group.java
│       │               │   └── User.java
│       │               ├── repository
│       │               │   ├── GroupRepository.java
│       │               │   └── UserRepository.java
│       │               ├── security
│       │               │   ├── CustomUserDetailsService.java
│       │               │   └── JwtUtil.java
│       │               ├── service
│       │               │   ├── UserService.java
│       │               │   └── GroupService.java  <-- New file
│       │               ├── filter
│       │               │   └── JwtAuthenticationFilter.java
│       │               └── SpringBootJwtAuthenticationApplication.java
│       └── resources
│           ├── application.properties
│           └── static
│               └── index.html
│
├── pom.xml
└── README.md


