package com.example.ce1.Aswathservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Aswathmodel.AswathAddress;
import com.example.ce1.Aswathrepository.AswathAddressRepo;
import com.example.ce1.Aswathrepository.AswathEmployeeRepo;

@Service
public class AswathAddressService {
    @Autowired
    AswathAddressRepo addressRepo;
    @Autowired
    AswathEmployeeRepo employeeRepo;
    public AswathAddress setAddressById(int id,AswathAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
