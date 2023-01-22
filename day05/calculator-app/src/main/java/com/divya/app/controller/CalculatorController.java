package com.divya.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public long add(@RequestParam("a") long a, @RequestParam("b") long b){
        return a+b;
    }

    @GetMapping("/sub")
    public long sub(@RequestParam("a") long a, @RequestParam("b") long b){
        return a-b;
    }

    @GetMapping("/mul")
    public long mul(@RequestParam("a") long a, @RequestParam("b") long b){
        return a*b;
    }

    @GetMapping("/div")
    public long div(@RequestParam("a") long a, @RequestParam("b") long b){
        return a/b;
    }

}
