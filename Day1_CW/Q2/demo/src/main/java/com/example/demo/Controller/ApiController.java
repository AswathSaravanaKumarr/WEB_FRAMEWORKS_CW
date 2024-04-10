package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("First")
public class ApiController 
{
    @GetMapping("/Hello")
    public String Welcome(@RequestParam(name="id")String name)
    {
        return "Welcome "+ name;
    }
    
}
