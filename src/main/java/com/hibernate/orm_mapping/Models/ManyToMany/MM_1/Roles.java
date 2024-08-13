package com.hibernate.orm_mapping.Models.ManyToMany.MM_1;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="MTM-Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;
    private String role_name;
}
