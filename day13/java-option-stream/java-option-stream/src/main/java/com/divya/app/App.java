package com.divya.app;

import com.divya.app.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collection
 *
 */
public class App
{
    public static void main( String[] args )
    {
        OptionsApp optionsApp=new OptionsApp();
      /* // Optional<Cat> result= optionsApp.getCat("c1");
        Optional<Cat> result= optionsApp.getCat("c3");
        System.out.println(result);
        if(result.isPresent()){
            Cat cat=result.get();
            System.out.println(cat);
        }*/

        optionsApp.getCat("c3").ifPresent(cat-> System.out.println(cat.getName()));

        StreamApp streamApp=new StreamApp();
        System.out.println("employee Array");
        streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee List");
        streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee Data");
        streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee builder");
        streamApp.getEmployeeStreamBuilder().forEach(employee -> System.out.println(employee.toString()));
        streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
        streamApp.getEmployeeStreamBuilder().forEach(employee -> System.out.println(employee.toString()));

    }
}
