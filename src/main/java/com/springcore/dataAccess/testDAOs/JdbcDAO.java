package com.springcore.dataAccess.testDAOs;

public interface JdbcDAO {

    public void findAllEmployeesWithJDBCTemplate();
    public void findEmployeeUsingNamedJDBCTemplate(int id);

}
