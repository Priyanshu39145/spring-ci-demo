package com.Spring.AWS_Deploy_Manual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello()   {
        return "Hello Deployment....";
    }
}
