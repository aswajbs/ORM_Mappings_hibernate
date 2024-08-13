package com.hibernate.orm_mapping.Models.OneToMany.Example1;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="OTM-Comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private String author;
    @Column(name = "post_id")
    Long postId;

}
