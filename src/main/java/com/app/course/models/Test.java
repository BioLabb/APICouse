package com.app.course.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Test {

    /*PRIMARY KEY */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /* SET FOREIGN KEY */

    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;
    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    @Column(name = "question")
    private Set<Question> questions;
    /*  SET COLUM  */
    private boolean complete;
}
