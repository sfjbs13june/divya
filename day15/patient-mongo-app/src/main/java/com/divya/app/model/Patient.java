package com.divya.app.model;

public class Patient {
    String name;
    String age;
    String gender;
    String disease;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Patient(String name, String age, String gender, String disease) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }
}
