package com.yusubov.MyFirstSpringProject.repository;

import com.yusubov.MyFirstSpringProject.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findByName(String name);

    List<Teacher> findByAge(Integer age);

    List<Teacher> findBySubject(String subject);

    List<Teacher> findBySalaryGreaterThan(Integer salary);

    List<Teacher> findByYearOfExperience(Integer yearOfExperience);
}
