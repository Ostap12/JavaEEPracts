package ua.voroniak.jdbcExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.voroniak.jdbcExample.entity.Student;
import ua.voroniak.jdbcExample.entity.Teacher;

import java.sql.Date;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
//new WorkWithStudents();
        Student testStudent = new Student("Vlad Valt", 5);
        worker.saveStudentToDb(testStudent);

        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        Calendar calendar = Calendar.getInstance();
        teacher.setBirthDate(new Date(1980, 1,1));
        workWithTeacher.saveTacher(teacher);



    }
}
