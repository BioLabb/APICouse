package com.app.course.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BuyKey  implements Serializable {
    @Column(name = "student_id")
    long studentId;
    @Column(name = "course_id")
    long courseId;
    public BuyKey(){}

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
}
