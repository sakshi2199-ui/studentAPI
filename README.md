# Student API - Spring Boot

A simple REST API for managing student data using Spring Boot.  
Data is stored **in-memory** and initialized with sample records.

---

## **Technologies Used**
- Java 17+
- Spring Boot
- Maven
- RestTemplate (for dummyjson.com API call)

---

## **Endpoints**

| Method | Endpoint             | Description |
|--------|----------------------|-------------|
| GET    | /students            | Retrieve all students |
| POST   | /students            | Add a new student |
| GET    | /students/{id}       | Retrieve student by ID |
| GET    | /dashboard/stats     | Get total students & average age |

---



## **Sample JSON for POST /students**
```json
{
  "id": 3,
  "firstName": "Sakshi",
  "lastName": "Kumari",
  "age": 21,
  "email": "sakshi@123.com"
}

---

### API Testing Examples

**GET /students**
```bash
curl http://localhost:8080/students


curl -X POST http://localhost:8080/students \
-H "Content-Type: application/json" \
-d '{"id":3,"firstName":"Sakshi","lastName":"Kumari","age":21,"email":"sakshi@123.com"}'

```markdown
## Implementation Summary

This Student API project is built using Java 17 and Spring Boot.  
It manages student data in memory and provides REST endpoints to fetch, add, delete students, and view basic statistics.  
Initial data is seeded manually and optionally from dummyjson.com.  
The backend is fully tested using Postman.