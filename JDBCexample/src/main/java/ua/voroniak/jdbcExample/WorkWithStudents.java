package ua.voroniak.jdbcExample;

import com.googlecode.ehcache.annotations.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import ua.voroniak.jdbcExample.dao.StudentsDao;
import ua.voroniak.jdbcExample.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;


public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }

}

