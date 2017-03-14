package ua.voroniak.jdbcExample.dao.impl;

/**
 * Created by ostap on 14.03.2017.
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.voroniak.jdbcExample.dao.TeachersDao;
import ua.voroniak.jdbcExample.entity.Teacher;

@Repository
public class HibernateTeacherDao implements TeachersDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}

