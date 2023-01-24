package com.divya.app.model;

public class Student {

    String name;
    String rollno;
    String std;
    String school;
    public Student(String name, String rollno, String std, String school) {
        this.name = name;
        this.rollno = rollno;
        this.std = std;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }



}