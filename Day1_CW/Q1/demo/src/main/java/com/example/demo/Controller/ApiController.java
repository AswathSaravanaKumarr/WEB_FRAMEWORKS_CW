package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
    @GetMapping("/Hello")
    public String Hello()
    {
        return("Welcome SpringBoot");
    }


}
