package com.app.course.models;


import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    /*  PRIMARY KEY  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*  SET FOREIGN KEY  */
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    /*  SET COLUM  */
    private String question;
    private String answer;
    private String choose1;
    private String choose2;
    private String choose3;
}
