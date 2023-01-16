package com.divya.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    @GetMapping("/greet")

    public static String SayGreet(){

        return "greet from App";
    }
    @GetMapping("/welcome")

    public static String SayWelcome(){

        return "welcome from App";
    }

    @GetMapping("/hi")

    public static String SayHi(){

        return "hi from App";
    }
    @GetMapping("/thanks")

    public static String SayThanks(){

        return "thanks from App";
    }


}