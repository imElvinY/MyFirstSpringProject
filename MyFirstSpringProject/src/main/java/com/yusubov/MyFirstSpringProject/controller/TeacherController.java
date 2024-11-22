package com.yusubov.MyFirstSpringProject.controller;

import com.yusubov.MyFirstSpringProject.model.entity.Teacher;
import com.yusubov.MyFirstSpringProject.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/t2")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers/get-all")
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }
@GetMapping("teachers/{id}")
    public Teacher getById(@PathVariable Integer id){
        return teacherService.getById(id);

    }
@PostMapping("teachers/save")
    public Teacher create(Teacher teacher){
        return teacherService.create(teacher);
    }
@DeleteMapping("teachers/delete/{id}")
    public void delete(@PathVariable Integer id){
}
@PutMapping("teachers/update/{id}")
public Teacher update(@PathVariable Integer id, @RequestBody Teacher teacher){
        return teacherService.update(id, teacher);
}
}
