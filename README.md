# LEARNINGAPP


It is an app created to help function small group and club in doing good co-ordination.
We will help create group for u and make it worthwhile for u to use.


To use checkout to feature branch 
1. git clone
2. git checkout feature

if u download all the setup ( Also frontend from different repo u can use it if u decide to use only backend use following apipoints in postman)

# API Endpoints

Endpoints are organized by who has access to them.

Admin Endpoints
--


POST /api/users: Create a new user (Teacher or Student).

GET /api/users: List all users (with filters for role).

POST /api/subjects: Create a new subject.

PATCH /api/subjects/{id}/assign: Assign a teacher_id to a specific subject.

Teacher Endpoints
--
GET /api/teacher/subjects: View subjects assigned to the logged-in teacher.

POST /api/assignments: Create a new assignment for a subject.

GET /api/assignments/{id}/submissions: View all student submissions for a specific assignment.

PATCH /api/submissions/{id}/grade: Give marks to a student's submission.

GET /api/subjects/{id}/report: Compile Marks – Get a list of all students in the subject with their total/average marks.

Student Endpoints
--
GET /api/student/subjects: View subjects the student is enrolled in.

GET /api/student/assignments: View pending/upcoming assignments.

POST /api/submissions: Submit an assignment.[2]

Note: Use multipart/form-data to allow multiple file uploads (images/PDFs) in one request.

GET /api/student/marks: View marks for all submitted assignments.
