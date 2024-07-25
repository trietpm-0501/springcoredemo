package com.springcore.dataAccess.testServices;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.springcore.dataAccess.testEntities.NHANVIEN;

public class EmployeeMapper implements RowMapper<NHANVIEN>{

    @SuppressWarnings("null")
    @Override
    @Nullable
    public NHANVIEN mapRow(ResultSet rs, int rowNum) throws SQLException {
        NHANVIEN nv = new NHANVIEN();
        nv.setId(rs.getInt("nv_id"));
        nv.setName(rs.getString("nv_name"));
        return nv;
    }


}
