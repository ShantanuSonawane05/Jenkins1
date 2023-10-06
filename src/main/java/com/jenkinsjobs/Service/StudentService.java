package com.jenkinsjobs.Service;

import com.jenkinsjobs.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> allStudents();

    Student createUser(Student student);
    Optional<Student> findById(Integer studentId);
}
