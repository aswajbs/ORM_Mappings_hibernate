package com.hibernate.orm_mapping.Models.OneToMany;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private String author;
    @Column(name = "post_id")
    Long postId;

}
