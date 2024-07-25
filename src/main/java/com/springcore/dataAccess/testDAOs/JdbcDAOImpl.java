package com.springcore.dataAccess.testDAOs;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.springcore.dataAccess.testEntities.NHANVIEN;
import com.springcore.dataAccess.testServices.EmployeeMapper;

@Repository("JdbcDAOBean")
public class JdbcDAOImpl implements JdbcDAO {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedTemplate;

    @Autowired
    public JdbcDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void findAllEmployeesWithJDBCTemplate() {
        List<NHANVIEN> list = this.jdbcTemplate.query("select * from NHANVIEN", new EmployeeMapper());
        System.out.println("\nPrinting using jdbc template");
        for (NHANVIEN nv : list)
            System.out.println(nv.getId() + " " + nv.getName());
        System.out.println("");
    }

    // @SuppressWarnings("null")
    @Override
    public void findEmployeeUsingNamedJDBCTemplate(int id) {
        String sql = "select * from NHANVIEN where nv_id = :id";
        SqlParameterSource parameterSource = new MapSqlParameterSource("id", id);
        List<NHANVIEN> nv = this.namedTemplate.query(sql, parameterSource, new EmployeeMapper());
        System.out.println("\nPrinting employee with id = " + id + " using named jdbc template:");
        for (NHANVIEN employee : nv)
            System.out.println(employee.getId() + " " + employee.getName());
        System.out.println("");
    }

}
