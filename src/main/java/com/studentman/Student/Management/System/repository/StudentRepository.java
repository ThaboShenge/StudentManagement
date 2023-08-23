package com.studentman.Student.Management.System.repository;

import com.studentman.Student.Management.System.entity.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
