package com.hibernate.orm_mapping.Models.OneToMany;

import jakarta.persistence.*;
import lombok.Data;

import javax.xml.stream.events.Comment;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Set<Comments> comments = new HashSet<>();
}
