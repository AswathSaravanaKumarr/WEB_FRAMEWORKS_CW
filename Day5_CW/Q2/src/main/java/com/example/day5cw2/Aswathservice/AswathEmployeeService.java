package com.example.day5cw2.Aswathservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.Aswathmodel.AswathEmployee;
import com.example.day5cw2.Aswathrepository.AswathEmployeeRepo;

@Service
public class AswathEmployeeService {
    public AswathEmployeeRepo employeeRepo;
    public AswathEmployeeService(AswathEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AswathEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AswathEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AswathEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
