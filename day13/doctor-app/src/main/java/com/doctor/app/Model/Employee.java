package com.doctor.app.Model;

public class Employee {
    int id;

    String name;

    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void salaryIncrement(double data){
        this.salary=salary+data;
    }
    @Override
    public String toString(){
        return "Employee Name:"+name+" Id:"+id+" salary:"+salary;

    }
}
