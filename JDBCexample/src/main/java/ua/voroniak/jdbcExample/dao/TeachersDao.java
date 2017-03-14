package ua.voroniak.jdbcExample.dao;

import ua.voroniak.jdbcExample.entity.Teacher;

/**
 * Created by ostap on 14.03.2017.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}
