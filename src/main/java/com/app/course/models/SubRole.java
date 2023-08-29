package com.app.course.models;

import jakarta.persistence.*;


@Entity
@Table(name ="subRole" )
public class SubRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
