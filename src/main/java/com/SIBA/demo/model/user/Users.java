package com.SIBA.demo.model.user;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Students")


public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String name;
    @javax.persistence.Id
    private Long id;

    public Users(int rollno,String name) {
        this.rollno = rollno;
        this.name = name;


    }

    public int getrollno() {
        return rollno;
    }

    public String getname() {
        return name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;

    }
    public void setName(String name){
        this.name = name;
    }

}







