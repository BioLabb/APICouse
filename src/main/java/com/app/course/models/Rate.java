package com.app.course.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rate")
public class Rate {
    @Id
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    /*  SET COLUM  */
    private int rate;
    private String comment;
}
