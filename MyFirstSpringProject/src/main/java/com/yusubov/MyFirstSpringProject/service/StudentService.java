package com.yusubov.MyFirstSpringProject.service;

import com.yusubov.MyFirstSpringProject.model.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService extends CommonService<Student> {

    List<Student> getByName(String name) throws RuntimeException;

    List<Student> getByStudyField(String StudyField) throws RuntimeException;

    List<Student> getByAge(Integer age) throws RuntimeException;

    List<Student> getByGpa(Double gpa) throws RuntimeException;

    List<Student> getByGender(String gender) throws RuntimeException;

}
