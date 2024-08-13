package com.hibernate.orm_mapping.Models.OneToOne;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="OTO-Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private int pincode;

}
