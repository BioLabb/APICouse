package com.app.course.models;

import jakarta.persistence.*;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;
    private String title;
    private String content;
}
