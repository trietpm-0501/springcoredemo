package com.springcore.dataAccess.testDAOs;

import com.springcore.dataAccess.testEntities.NHANVIEN;

public interface HibernateDAO {
    public void save(NHANVIEN p);
    public void list();
}
