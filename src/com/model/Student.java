package com.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String id;

    final String name;

    final String email;

    final String phoneNumber;

    double average;

    final List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void addEnrolledCourses(Course course) {
        enrolledCourses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", average=" + average +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
