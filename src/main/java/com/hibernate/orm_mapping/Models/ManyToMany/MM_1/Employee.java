package com.hibernate.orm_mapping.Models.ManyToMany.MM_1;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="MTM-Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_salary;
    @ManyToMany(cascade=CascadeType.ALL)
    Set<Roles> roles=new HashSet<>();

}
