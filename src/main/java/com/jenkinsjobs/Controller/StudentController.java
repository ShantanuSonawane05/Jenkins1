package com.jenkinsjobs.Controller;

import com.jenkinsjobs.Entity.Student;
import com.jenkinsjobs.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> allStudents()
    {
        return studentService.allStudents();
    }

    @PostMapping("/new")
    public Student createUser(@RequestBody Student student)
    {
        return studentService.createUser(student);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> findById(Integer studentId)
    {
        return studentService.findById(studentId);
    }
}
