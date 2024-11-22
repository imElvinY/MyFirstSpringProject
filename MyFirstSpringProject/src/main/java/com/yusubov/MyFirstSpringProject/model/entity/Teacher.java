package com.yusubov.MyFirstSpringProject.model.entity;

import com.yusubov.MyFirstSpringProject.model.enums.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Teachers")


public class Teacher extends User {


    private Integer salary;

    private Subject subject;

    private Integer yearOfExperience;
}
