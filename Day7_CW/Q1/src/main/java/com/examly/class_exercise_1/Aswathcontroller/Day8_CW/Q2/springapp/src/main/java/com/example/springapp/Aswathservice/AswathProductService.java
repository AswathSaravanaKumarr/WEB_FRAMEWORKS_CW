package com.example.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.Aswathmodel.AswathProduct;
import com.example.springapp.Aswathrepository.AswathProductRepo;

@Service
public class AswathProductService {
    @Autowired
    private AswathProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AswathProduct person)
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

    public List<AswathProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AswathProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AswathProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
