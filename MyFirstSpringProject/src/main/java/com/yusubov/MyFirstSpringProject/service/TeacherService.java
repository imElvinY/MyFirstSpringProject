package com.yusubov.MyFirstSpringProject.service;

import com.yusubov.MyFirstSpringProject.model.entity.Teacher;

import java.util.List;

public interface TeacherService extends CommonService<Teacher> {

    List<Teacher> getByName(String name) throws RuntimeException;

    List<Teacher> getByAge(Integer age) throws RuntimeException;

    List<Teacher> getBySubject(String subject) throws RuntimeException;

    List<Teacher> SalaryGreaterThan(Integer salary) throws RuntimeException;

    List<Teacher> getByYearOfExperience(Integer yearOfExperience) throws RuntimeException;
}
