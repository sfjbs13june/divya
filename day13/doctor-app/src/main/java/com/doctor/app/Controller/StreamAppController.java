package com.doctor.app.Controller;

import com.doctor.app.Methods.StreamApp;



public class StreamAppController {
    public static void main( String[] args )
    {
        StreamApp streamApp=new StreamApp();
        System.out.println("employee Array");
        streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee List");
        streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee Data");
        streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee builder");
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
        streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
    }
}
