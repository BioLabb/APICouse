package com.app.course.models;

import jakarta.persistence.*;

@Entity
@Table(name = "buy")
public class Buy {

    @Id
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
