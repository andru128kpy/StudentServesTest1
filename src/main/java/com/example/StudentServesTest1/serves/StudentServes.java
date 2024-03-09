package com.example.StudentServesTest1.serves;

import com.example.StudentServesTest1.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServes {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
