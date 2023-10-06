package com.jenkinsjobs.Service;

import com.jenkinsjobs.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> allStudents();

    Student createUser(Student student);
}
