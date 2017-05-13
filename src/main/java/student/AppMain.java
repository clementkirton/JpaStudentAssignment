/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config-dao.xml"});

        StudentDao dao = (StudentDao) context.getBean("studentDao");


            Student s = new Student("Gary","Again","TodayAgain");
            dao.persist(s);
            System.out.println(dao.getAllStudents());
    }
}

