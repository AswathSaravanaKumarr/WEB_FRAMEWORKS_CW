package com.example.ce1.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Aswathmodel.AswathEmployee;
import com.example.ce1.Aswathrepository.AswathEmployeeRepo;

@Service
public class AswathEmployeeService {
    @Autowired
    AswathEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AswathEmployee setEmployee(AswathEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AswathEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AswathEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
