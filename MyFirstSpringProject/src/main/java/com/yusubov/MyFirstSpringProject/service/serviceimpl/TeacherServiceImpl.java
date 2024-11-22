package com.yusubov.MyFirstSpringProject.service.serviceimpl;

import com.yusubov.MyFirstSpringProject.model.entity.Teacher;
import com.yusubov.MyFirstSpringProject.repository.TeacherRepository;
import com.yusubov.MyFirstSpringProject.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public List<Teacher> getByName(String name) throws RuntimeException {
        return teacherRepository.findByName(name);
    }

    @Override
    public List<Teacher> getByAge(Integer age) throws RuntimeException {
        return teacherRepository.findByAge(age);
    }

    @Override
    public List<Teacher> getBySubject(String subject) throws RuntimeException {
        return teacherRepository.findBySubject(subject);
    }

    @Override
    public List<Teacher> SalaryGreaterThan(Integer salary) throws RuntimeException {
        return teacherRepository.findBySalaryGreaterThan(salary);
    }

    @Override
    public List<Teacher> getByYearOfExperience(Integer yearOfExperience) throws RuntimeException {
        return teacherRepository.findByYearOfExperience(yearOfExperience);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getById(Integer id) {
        return teacherRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Teacher not found with id: " + id));
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void delete(Integer id) {
        Teacher teacher = getById(id);
        teacherRepository.delete(teacher);

    }

    @Override
    public Teacher update(Integer id, Teacher teacher) {
        Teacher foundedTeacher = getById(id);
        foundedTeacher.setAddress(teacher.getAddress());
        foundedTeacher.setYearOfExperience(teacher.getYearOfExperience());
        return teacherRepository.save(foundedTeacher);
    }
}
