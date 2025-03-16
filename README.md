This project is on learning app
#  Project Structure

     LEARNING-APP 

     ├─ src
     │  └─ main
     │     ├── java
     │     │   └── com
     │     │       └── mohit
     │     │           └── LearningApp 
     │     │               ├── config
     │     │               │   └── SecurityConfig
     │     │               ├── controller
     │     │               │    ├── AuthController
     │     │               │    ├── UserController
     │     │               │    └── GroupController  
     │     │               ├── dto
     │     │               │    ├── Groupdto 
     │     │               │    ├── GroupMembershipdto
     │     │               │    └── Userdto
     │     │               ├── model
     │     │               │    ├── Group
     │     │               │    ├── GroupMembership
     │     │               │    └── User
     │     │               ├── repository
     │     │               │    ├── GroupRepository
     │     │               │    └── UserRepository
     │     │               ├── security
     │     │               │    ├── CustomUserDetailsService
     │     │               │    └── JwtUtil
     │     │               ├── service
     │     │               │    ├── UserService
     │     │               │    └── GroupService
     │     │               ├── filter
     │     │               │    └── JwtAuthenticationFilter
     │     │               └── LearningAppApplication
     │     └── resources
     │          ├── application.properties
     │          └── static
     │               └── index.html
     │
     ├── pom.xml
     └── README.md


It is an app created to help function small group and club in doing good co-ordination.
We will help create group for u and make it worthwhile for u to use.