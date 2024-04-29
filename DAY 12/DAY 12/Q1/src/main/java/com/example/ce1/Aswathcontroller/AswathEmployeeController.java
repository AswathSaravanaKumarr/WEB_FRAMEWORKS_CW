package com.example.ce1.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.Aswathmodel.AswathEmployee;
import com.example.ce1.Aswathservice.AswathEmployeeService;

@RestController
public class AswathEmployeeController {
    @Autowired
    AswathEmployeeService employeeService;

    @PostMapping("/employee")
    public AswathEmployee setMethod(@RequestBody AswathEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AswathEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AswathEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
