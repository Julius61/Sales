package com.SpringBoot.MyString;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;

    public static void getId() {
        Object o = null;
        return ;
    }

    public Object getName() {

    }

    public void setName(Object name) {

    }

    public Object getEmail() {
        return null;
    }

    public void setEmail(Object email) {

    }

    public void setId(Long id) {
        this.id = id;
    }
}
