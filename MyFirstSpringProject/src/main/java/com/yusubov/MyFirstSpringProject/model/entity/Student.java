package com.yusubov.MyFirstSpringProject.model.entity;

import com.yusubov.MyFirstSpringProject.model.enums.StudyField;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Students")


public class Student extends User {


    private String gender;

    private Double gpa;

    private StudyField studyField;
}
