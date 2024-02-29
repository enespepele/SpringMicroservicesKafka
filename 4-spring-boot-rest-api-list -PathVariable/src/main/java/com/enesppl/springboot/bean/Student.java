package com.enesppl.springboot.bean;

public class Student {

    private int id;
    private String firstNmae;
    private String lastName;


    public Student(int id, String firstNmae, String lastName) {
        this.id = id;
        this.firstNmae = firstNmae;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
