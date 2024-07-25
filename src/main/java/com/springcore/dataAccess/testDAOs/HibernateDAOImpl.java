package com.springcore.dataAccess.testDAOs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.dataAccess.testEntities.NHANVIEN;

@Repository("HibernateDAOBean")
@Transactional(readOnly = true)
public class HibernateDAOImpl implements HibernateDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void save(NHANVIEN p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void list() {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from NHANVIEN";
        Query<NHANVIEN> query = session.createQuery(hql, NHANVIEN.class);
        List<NHANVIEN> list = query.list();
        System.out.println("\nPrinting using spring-integrated transactional hibernate:");
        for (NHANVIEN nv : list)
            System.out.println(nv.getId() + " " + nv.getName());
        System.out.println("");
    }

}
