package com.hibernate.orm_mapping.Models.ManyToOne;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="MTO-Employee")
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_salary;
    @ManyToOne(cascade=CascadeType.ALL)
    private OfficeAddress emp_office;


}
