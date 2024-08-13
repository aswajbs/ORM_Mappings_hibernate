package com.hibernate.orm_mapping.Models.OneToMany.Example2;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="OTM-Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String phone;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    List<Product> products;
}
