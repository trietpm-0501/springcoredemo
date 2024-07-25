package com.springcore.dataAccess.testEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NHANVIEN {
    
    @Id
    @Column(name = "nv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nv_name")
    private String name;

    public NHANVIEN(){}

    public NHANVIEN(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    @Column(name = "nv_name")
    public void setName(String name) {
        this.name = name;
    }



}
