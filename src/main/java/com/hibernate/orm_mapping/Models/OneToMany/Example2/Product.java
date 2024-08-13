package com.hibernate.orm_mapping.Models.OneToMany.Example2;

import jakarta.persistence.*;

@Entity
@Table(name="OTM-Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String product_name;
    private int quantity;
    private float price;

}