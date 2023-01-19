package com.divya.app;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String SayHello() { return "Hello from App";
    }


@RequestMapping("/request/hello")
public String requestHello()
{
    return "Hello from Request mapping";
}

    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name) { return "welcome to"+name;
    }

    @GetMapping("/send/{message}")
    public String SendMessage(@PathVariable String message) { return "send message"+message;
    }

}