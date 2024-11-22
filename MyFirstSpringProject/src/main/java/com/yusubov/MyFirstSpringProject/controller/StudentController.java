package com.yusubov.MyFirstSpringProject.controller;

import com.yusubov.MyFirstSpringProject.model.entity.Student;
import com.yusubov.MyFirstSpringProject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/get-all")
    public List<Student> getAll() {
        return studentService.getAll();

    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable Integer id) {
        return studentService.getById(id);
    }

    @PostMapping("/students/save")
    public Student create(@RequestBody Student student) {
       return studentService.create(student);

    }


    @DeleteMapping("/students/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }


    @PutMapping("/students/update/{id}")
    public Student update(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.update(id, student);


    }

}
