package com.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private final String id;

    final String name;

    final String email;

    final String phoneNumber;

    String rank;

    double salary;

    final List<Course> coursesToTeach = new ArrayList<>();

    public Professor(String id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void addCourseToTeach(Course course) {
        if (!coursesToTeach.contains(course)) {
            coursesToTeach.add(course);
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rank='" + rank + '\'' +
                ", salary=" + salary +
                ", coursesToTeach=" + coursesToTeach +
                '}';
    }
}
