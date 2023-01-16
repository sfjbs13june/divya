package com.divya.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String SayHello() { return "hello from app";
    }


@RequestMapping("/request/hello")
public String requestHello()
{
    return "Hello from Request mapping";
}
}