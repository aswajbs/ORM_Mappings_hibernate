package com.hibernate.orm_mapping.Models.ManyToOne;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="MTO-office_Address")
public class OfficeAddress {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String street;
    private String city;
    private int pincode;

}
