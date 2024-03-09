package com.example.StudentServesTest1.serves.impl;

import com.example.StudentServesTest1.model.Student;
import com.example.StudentServesTest1.repository.InMemoryStudentServesDAD;
import com.example.StudentServesTest1.serves.StudentServes;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServes implements StudentServes {
    private final InMemoryStudentServesDAD repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmailStudent(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
