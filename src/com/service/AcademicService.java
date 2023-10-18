package com.service;

import com.model.Course;
import com.model.Professor;
import com.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AcademicService {

    final List<Course> coursesList = new ArrayList<>();
    final List<Professor> professorList = new ArrayList<>();
    final List<Student> studentsList = new ArrayList<>();

    public void addCourse(Course course) {
        if (!coursesList.contains(course)) {
            coursesList.add(course);
        }
    }

    public Optional<Course> findCourseByName(String name) {
        return coursesList.stream()
                .filter(course -> course.getName().equals(name))
                .findAny();
    }

    public void addProfessor(Professor professor) {
        if (!professorList.contains(professor)) {
            professorList.add(professor);
        }
    }

    public Optional<Professor> findProfessorById(String id) {
        return professorList.stream()
                .filter(professor -> professor.getId().equals(id))
                .findAny();
    }

    public void addStudent(Student student) {
        if (!studentsList.contains(student)) {
            studentsList.add(student);
        }
    }

    public Optional<Student> findStudentById(String id) {
        return studentsList.stream()
                .filter(student -> student.getId().equals(id))
                .findAny();
    }

    public Optional<Course> findCourseByCode(String code) {
        return coursesList.stream()
                .filter(course -> course.getCode().equals(code))
                .findAny();
    }

    public void enrollStudent(String idStudent, String codeCourse) {
        Optional<Student> studentOptional = findStudentById(idStudent);
        Optional<Course> courseOptional = findCourseByCode(codeCourse);

        if (studentOptional.isPresent() && courseOptional.isPresent()) {
            Student student = studentOptional.get();
            Course course = courseOptional.get();

            student.addEnrolledCourses(course);
        }
    }
}
