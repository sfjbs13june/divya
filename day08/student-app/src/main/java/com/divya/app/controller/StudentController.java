
package com.divya.app.controller;

import com.divya.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class StudentController {
    @GetMapping("/get/student")

    public List<Student> getStudent(){

        List Studentlist = new ArrayList();

        Student Student1 = new Student("ABC","001","5th","PLS");
        Student Student2 = new Student("DEF","002","6th","JBS");
        Student Student3 = new Student("GHI","003","7th","DGS");

        Studentlist.add(Student1);
        Studentlist.add(Student2);
        Studentlist.add(Student3);

        return  Studentlist;

    }

    @GetMapping("/map/student")
    public Map mapStudent() {
        Map mapStudent = new HashMap();

        Student Student1 = new Student("ABC","001","5th","PLS");
        Student Student2 = new Student("DEF","002","6th","JBS");
        Student Student3 = new Student("GHI","003","7th","DGS");

        mapStudent.put(Student1.getRollno(),Student1);
        mapStudent.put(Student2.getRollno(),Student2);
        mapStudent.put(Student3.getRollno(),Student3);

        return  mapStudent;


    }
}