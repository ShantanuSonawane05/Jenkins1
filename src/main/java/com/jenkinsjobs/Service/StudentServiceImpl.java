package com.jenkinsjobs.Service;

import com.jenkinsjobs.Entity.Student;
import com.jenkinsjobs.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createUser(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Integer studentId) {
        return Optional.of(studentRepository.findById(studentId).get());
    }
}
