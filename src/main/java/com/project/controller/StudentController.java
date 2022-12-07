package com.project.controller;

import com.project.Model.Student;
import com.project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String get(){
        return "Hello world!";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        studentService.save(student);
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable(name="id") Long id){
        return studentService.getStudent(id);
    }
}
