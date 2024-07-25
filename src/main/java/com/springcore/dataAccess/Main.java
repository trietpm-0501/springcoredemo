package com.springcore.dataAccess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.dataAccess.testDAOs.HibernateDAO;
import com.springcore.dataAccess.testDAOs.JdbcDAO;
import com.springcore.dataAccess.testEntities.NHANVIEN;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        @SuppressWarnings("resource")
        ApplicationContext spring = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
        HibernateDAO test = (HibernateDAO)spring.getBean("HibernateDAOBean");
        test.save(new NHANVIEN("John"));
        test.save(new NHANVIEN("Richard"));
        test.list();
        JdbcDAO testJDBC = (JdbcDAO)spring.getBean("JdbcDAOBean");
        testJDBC.findAllEmployeesWithJDBCTemplate();
        testJDBC.findEmployeeUsingNamedJDBCTemplate(1);
        testJDBC.findEmployeeUsingNamedJDBCTemplate(2);
        

    }
}