package com.doctor.app.Methods;

import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Employee;
import com.doctor.app.Model.Prescription;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {


     private static Employee[] arrayOfEmps = {
            new Employee(1, "bavya", 100000.0),
            new Employee(2, "divya", 200000.0),
            new Employee(3, "kavya", 300000.0)
    };
    public Stream<Employee> getEmployeeArray(){
        return Stream.of(arrayOfEmps);
    }
    public Stream<Employee> getEmployeeList(){
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        return empList.stream();
    }
    public Stream<Employee> getEmployeeData(){
        return  Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
    }

    public Stream<Employee> getEmployeeStreamBulider() {
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();
        return empStream;
    }
}
