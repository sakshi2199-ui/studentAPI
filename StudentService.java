package com.example.studentapi.service;

import com.example.studentapi.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service public class StudentService {
    private List<Student> students = new ArrayList<>();
    public StudentService(){

         String url = "https://dummyjson.com/users";
         RestTemplate restTemplate = new RestTemplate();
         var response = restTemplate.getForObject(url,Object.class);


        students.add(new Student(1,"John","Doe",20,"john@example.com"));
        students.add(new Student(2,"Jane","Smith",22,"jane@example.com"));
    }

      public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(s->s.getId() == id).findFirst();
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

}