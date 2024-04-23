package com.example.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aswathmodel.AswathPerson;
import com.example.springapp.Aswathrepository.AswathPersonRepo;

@Service
public class AswathPersonService {
    @Autowired
    private AswathPersonRepo rep;

    public boolean post(AswathPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AswathPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AswathPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
