package com.app.course.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "buy")
public class Buy {
    @EmbeddedId
    BuyKey id;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;
    @Temporal(TemporalType.DATE)
    private Date dateBuy;

    private Boolean studentComplete;
    public Buy(){

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    public Boolean getStudentComplete() {
        return studentComplete;
    }

    public void setStudentComplete(Boolean studentComplete) {
        this.studentComplete = studentComplete;
    }
}
