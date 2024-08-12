package com.hibernate.orm_mapping.Models.OneToOne;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_tb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Email;
    @OneToOne(cascade=CascadeType.ALL)
   // @JoinColumn(name="Address_id",referencedColumnName = "id")
    private Address address;
}
