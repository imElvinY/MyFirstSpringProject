package com.yusubov.MyFirstSpringProject.service.serviceimpl;

import com.yusubov.MyFirstSpringProject.exceptions.NotFoundException;
import com.yusubov.MyFirstSpringProject.model.entity.Student;
import com.yusubov.MyFirstSpringProject.repository.StudentRepository;
import com.yusubov.MyFirstSpringProject.repository.TeacherRepository;
import com.yusubov.MyFirstSpringProject.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getByName(String name) throws RuntimeException {
        return studentRepository.findByName(name);

    }

    @Override
    public List<Student> getByStudyField(String StudyField) throws RuntimeException {
        return studentRepository.findByStudyField();
    }

    @Override
    public List<Student> getByAge(Integer age) throws RuntimeException {
        return studentRepository.findByAge(age);
    }

    @Override
    public List<Student> getByGpa(Double gpa) throws RuntimeException {
        return studentRepository.findByGpa(gpa);
    }

    @Override
    public List<Student> getByGender(String gender) throws RuntimeException {
        return studentRepository.findByGender(gender);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student is not found: " + id));
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        Student student = getById(id);
        studentRepository.delete(student);

    }

    @Override
    public Student update(Integer id, Student student) {
        Student foundedStudent = studentRepository.findById(id).orElseThrow(null);
        foundedStudent.setFullName(student.getFullName());
        foundedStudent.setAddress(student.getAddress());
        return studentRepository.save(foundedStudent);
    }
}

