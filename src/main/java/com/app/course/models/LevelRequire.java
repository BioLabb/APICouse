package com.app.course.models;

import jakarta.persistence.*;

@Entity
@Table(name = "LevelRequire")
public class LevelRequire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int level;
}
