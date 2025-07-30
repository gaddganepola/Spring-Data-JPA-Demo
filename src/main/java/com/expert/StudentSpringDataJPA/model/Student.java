package com.expert.StudentSpringDataJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
@Data
@Entity
public class Student {

    @Id
    private int rollNo;
    private String name;
    private int marks;

}
