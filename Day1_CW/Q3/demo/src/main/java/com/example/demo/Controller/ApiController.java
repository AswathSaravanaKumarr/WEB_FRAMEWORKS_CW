package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    // public String favColor(@RequestParam(name="color") String color )
    @GetMapping("/favouriteColor")
   public String favColor(@RequestParam(name="color") String name)
    {
        return "My favourite color is "+name+ "!";
        //return "hello";
    }
   
}

