package ua.voroniak.jdbcExample.dao;

import ua.voroniak.jdbcExample.entity.Student;

/**
 * Created by ostap on 14.03.2017.
 */
public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}

