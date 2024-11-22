package com.yusubov.MyFirstSpringProject.repository;

import com.yusubov.MyFirstSpringProject.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName (String name);

    List<Student> findByStudyField();

    List<Student> findByAge(Integer age);

    List<Student> findByGpa(Double gpa);

    List<Student> findByGender(String gender);

}
